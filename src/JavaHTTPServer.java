import java.io.IOException;
import java.net.ServerSocket;

public class JavaHTTPServer {

    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080.");
        while(true) {
            // keep connection open until server stopped
        }
    }

}