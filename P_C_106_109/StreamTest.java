package P_C_106_109;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Hello", "World","Welcome","To programming");

        names.stream().forEach(name -> System.out.println(name));
    }
}
