package service;

import com.greeting.grpc.GreetingServiceGrpc;
import com.greeting.grpc.GreetingServiceOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Класс для взаимодействия с сервисом gRPC
 */
public class GreetingService {

    /**
     * Создание канала
     */
    private static final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8087")
            .usePlaintext().build();

    /**
     * Создание стаба
     */
    private static final GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);

    public static GreetingServiceOuterClass.GreetingResponse greeting(GreetingServiceOuterClass.GreetingRequest request) {
        return stub.greeting(request);
    }

    /**
     * Получение тела запроса
     *
     * @return тело запроса Greeting
     */
    public static GreetingServiceOuterClass.GreetingRequest getGreetingRequest(String name, String lastname, Integer age) {
        return GreetingServiceOuterClass.GreetingRequest.newBuilder()
                .setName(name)
                .setLastname(lastname)
                .setAge(age)
                .build();
    }
}
