import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.GreetingServiceImp;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(8087)
                .addService(new GreetingServiceImp())
                .build();

        server.start();

        System.out.println("Server started"); //В дз делать через лог

        server.awaitTermination();
    }
}
