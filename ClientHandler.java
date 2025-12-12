import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMultiThread {
public static void main(String[],args) throws IOException {
int port=12345;
ServerSocket serverSocket = new ServerSocket(port);
    System.out.println(("Server avviato sullaporta"+port));
    while (true){
        Socket clientSocket = serverSocket.accept();
        System.out.println("Nuovoclient connesso"+clientSocket.getInetAddress());

        ClientHandler clientHandler= new ClientHandler(clientSocket);
        new Thread(clientHandler).start();
        
    }
}
}
