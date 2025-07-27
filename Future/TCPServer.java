package Future;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("服务器启动，监听端口 8080...");

            while (true) {
                // 等待客户端连接
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("新客户端连接: " + clientSocket.getInetAddress());

                    // 获取输入输出流
                    BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                    // 读取客户端消息
                    String message = in.readLine();
                    System.out.println("收到客户端消息: " + message);

                    // 回复客户端
                    out.println("服务器收到: " + message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}