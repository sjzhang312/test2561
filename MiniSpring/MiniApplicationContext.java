package MiniSpring;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MiniApplicationContext {

    // Bean 容器（类名 -> 实例）
    private Map<Class<?>, Object> beanMap = new HashMap<>();

    public MiniApplicationContext(String basePackage) throws Exception {
        // 1. 扫描包下所有类
        Set<Class<?>> classSet = scanClasses(basePackage);

        // 2. 实例化带 @MyComponent 的类
        for (Class<?> clazz : classSet) {
            if (clazz.isAnnotationPresent(MyComponent.class)) {
                Object instance = clazz.getDeclaredConstructor().newInstance();
                beanMap.put(clazz, instance);
            }
        }

        // 3. 注入带 @MyAutowired 的属性
        for (Object bean : beanMap.values()) {
            Field[] fields = bean.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(MyAutowired.class)) {
                    field.setAccessible(true);
                    Object dependency = beanMap.get(field.getType());
                    field.set(bean, dependency);
                }
            }
        }
        System.out.println(1);
    }

    public <T> T getBean(Class<T> clazz) {
        return (T) beanMap.get(clazz);
    }

    private Set<Class<?>> scanClasses(String basePackage) throws Exception {
        // 简化模拟，只写死几个类
        Set<Class<?>> classes = new HashSet<>();
        classes.add(UserService.class);
        classes.add(OrderService.class);
        return classes;
    }
}
