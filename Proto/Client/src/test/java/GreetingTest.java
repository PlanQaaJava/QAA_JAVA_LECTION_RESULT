import com.greeting.grpc.GreetingServiceOuterClass;
import org.junit.jupiter.api.Test;
import service.GreetingService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    @Test
    void greetingPositiveTest() {
        GreetingServiceOuterClass.GreetingRequest request = GreetingService.getGreetingRequest("Dmitry", "Kuznetsov", 29);

        var actual = GreetingService.greeting(request);

        GreetingServiceOuterClass.GreetingResponse expected = GreetingServiceOuterClass.GreetingResponse.newBuilder()
                .setGreeting("Hello " + request.getLastname() + " " + request.getName() + ", " + request.getAge() + " years old!")
                .build();

        assertEquals(expected, actual);
    }
}
