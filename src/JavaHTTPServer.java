import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaHTTPServer {

    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080.");
        while(true) {
            // accept incoming connections
            final Socket client = server.accept();
            // read request, prepare response, send response, close socket
        }
    }

}