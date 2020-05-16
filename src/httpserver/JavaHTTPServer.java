package httpserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * The type Java HTTP Server.
 */
public class JavaHTTPServer {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the IO exception
     */
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080.");
        while (true) {
            // read request, prepare response, send response, close socket

            /* read GET request
            // accept incoming connections
            final Socket client = server.accept();
            InputStreamReader is_reader = new InputStreamReader(client.getInputStream());
            BufferedReader reader = new BufferedReader(is_reader); // as request is multiple lines, use a BR
            String requestLine = reader.readLine();
            while (!requestLine.isEmpty()) {
                System.out.println(requestLine);
                requestLine = reader.readLine();
            }
            */

            try (Socket client = server.accept()) {
                // prepare response
                long millis = System.currentTimeMillis();
                String httpResponse = "HTTP/1.1 200 OK\nMillis = " + millis + "\n"; // print current time in millis
                // send response
                client.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            } // try with automatically closes the socket once response received
        }
    }

}