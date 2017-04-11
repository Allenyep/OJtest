import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by allen on 2017/4/11.
 */
public class Server {
    /**模拟web服务器的访问过程
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);
        Socket sock = server.accept();
        FileInputStream in = new FileInputStream("C:\\Users\\allen\\Desktop\\index.html");
        OutputStream out = sock.getOutputStream();

        int len = 0;
        byte buffer[] = new byte[1024];
        while((len = in.read(buffer)) > 0){
            out.write(buffer, 0 , len);
        }
        in.close();
        out.close();
        sock.close();
        server.close();

    }
}
