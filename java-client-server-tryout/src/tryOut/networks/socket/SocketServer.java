package tryOut.networks.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by root on 29/5/16.
 */
public class SocketServer {
    public void createServer() {
        try {
            //Create Socket on this machine at port 7070
            ServerSocket serverSocket = new ServerSocket(7070);
            Socket serverSideSocket;
            //keep checking for input connection
            while (true) {
                //if you find any input connection read data from it.
                serverSideSocket = serverSocket.accept();
                DataInputStream inputStream = new DataInputStream(serverSideSocket.getInputStream());
                Scanner scanner = new Scanner(inputStream, "UTF-8");
                while (scanner.hasNext()) {
                    System.out.println(scanner.next());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
