package MiniSpring;

public class Main {
    public static void main(String[] args) throws Exception {
        MiniApplicationContext context = new MiniApplicationContext("");

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder(); // 输出 Hello from UserService
    }
}
