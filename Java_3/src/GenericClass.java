import pac_1.Parent;

import java.util.HashMap;
import java.util.Map;

public class GenericClass<N extends Parent> {

    private Map<String, N> map = new HashMap<>();

    public <A> String getA(A a){
        return a.toString();
    }
}
