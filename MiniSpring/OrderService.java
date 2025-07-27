package MiniSpring;

@MyComponent
public class OrderService {
    @MyAutowired
    private UserService userService;

    public void placeOrder() {
        System.out.println("📦 Placing order...");
        userService.sayHello();
    }
}
