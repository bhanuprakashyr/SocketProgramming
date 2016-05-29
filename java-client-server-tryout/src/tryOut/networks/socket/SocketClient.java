package tryOut.networks.socket;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Date;

/**
 * Created by root on 29/5/16.
 */
public class SocketClient {

    public void createClient() {
        try {
            //Try to connect to open  a connection at the specified socket and write data into it.
            Socket clientSocket = new Socket("localhost", 7070);
            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            dataOutputStream.write("Hi Dear how are you ??".getBytes(Charset.defaultCharset()));
            dataOutputStream.close();
            clientSocket.close();
            Thread.sleep(50000);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
