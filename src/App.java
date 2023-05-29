import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class App {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(1087), 0);
        server.createContext("/", new MyHandler()); 
        server.setExecutor(null); 
        server.start(); 
    }

}