import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) throws IOException {
       try(Socket socket =new Socket("localhost",8888)){
           InputStream is = socket.getInputStream();
           OutputStream os = socket.getOutputStream();

           Scanner scanner= new Scanner(is,"gbk");
           while(scanner.hasNextLine()){
               String line = scanner.nextLine();
               System.out.println(line);

           }
       }catch(UnknownHostException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }


    }
}
