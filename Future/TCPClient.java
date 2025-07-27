package Future;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {
            // 获取输入输出流
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            // 发送消息给服务器
            String message = "Hello, Server!";
            out.println(message);
            System.out.println("发送消息: " + message);

            // 读取服务器回复
            String response = in.readLine();
            System.out.println("收到服务器回复: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}