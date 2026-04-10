import java.util.*;
import java.util.stream.*;

public class TrainAppUC9 {
    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("AC Chair", 56));

        Map<String, List<Bogie>> grouped =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        System.out.println(grouped);
    }
}