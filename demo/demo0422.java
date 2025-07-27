import java.util.*;
public class demo0422 {
    public static void main(String[] args) {
        //int a = 100;
        //int b = 100;
        //Integer c = Integer.valueOf(100);
        //Integer d = Integer.valueOf(100);
        //System.out.println(a==b);
        //System.out.println(a==c);
        //System.out.println(c==d);
        // 第一步，创建一个大的容器
        //List<byte[]> bigObjects = new ArrayList<>();
        //try {
        //    // 第二步，循环写入数据
        //    while (true) {
        //        // 第三步，创建一个大对象，一个大约 10M 的数组
        //        byte[] bigObject = new byte[10 * 1024 * 1024];
        //        // 第四步，将大对象添加到容器中
        //        bigObjects.add(bigObject);
        //    }
        //} catch (OutOfMemoryError e) {
        //    System.out.println("OutOfMemoryError 发生在 " + bigObjects.size() + " 对象后");
        //    throw e;
        //}
        Integer a=122;
        Integer b=122;
        System.out.println(a==b);
        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // 输出: false
        System.out.println(c.equals(d)); // 输出: true
    }
}
