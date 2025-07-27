package anythread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 12349;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept(); // 等待客户端连接
                System.out.println("New client connected");

                // 为每个连接创建一个线程，防止阻塞其他连接
                new Thread(() -> handleClient(socket)).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket socket) {
        try (
            InputStream input = socket.getInputStream(); // 从socket套接字获取输入流
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)); //把字节流包装成字符流（BufferReader）
            OutputStream output = socket.getOutputStream(); //获取输出流，用于向对方发送数据
            PrintWriter writer = new PrintWriter(output, true); //把OutputStream包装成PrintWriter，方便按文本输出字符串
        ) {
            String message = reader.readLine();
            System.out.println("Received from client: " + message);

            writer.println("Hello, client! You said: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close(); // 关闭连接
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
