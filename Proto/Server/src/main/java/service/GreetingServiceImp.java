package service;

import com.greeting.grpc.GreetingServiceGrpc;
import com.greeting.grpc.GreetingServiceOuterClass;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImp extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greeting(GreetingServiceOuterClass.GreetingRequest request,
                         StreamObserver<GreetingServiceOuterClass.GreetingResponse> responseObserver) {

        System.out.println(request); //В дз делать через лог

        GreetingServiceOuterClass.GreetingResponse response = GreetingServiceOuterClass.GreetingResponse.newBuilder()
                .setGreeting("Hello " + request.getLastname() + " " + request.getName() + ", " + request.getAge() + " years old!")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
