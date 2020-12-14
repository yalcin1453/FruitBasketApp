package FruitAppTest;
import org.testng.annotations.Test;
import pojoFruitApp.FruitAppPojo;
import utulities.ReadCsvFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OldestFruit {

    public static List<FruitAppPojo> fruitPojoList;

@Test
    public static void oldestFruit() {
    fruitPojoList = ReadCsvFile.getFruitDetails(ReadCsvFile.path);
        List<Integer> days = new ArrayList<>();
        for (int i = 0; i < fruitPojoList.size(); i++) {
            days.add(Integer.parseInt(fruitPojoList.get(i).getAge_in_days()));


        }

        int max = Collections.max(days);
        fruitPojoList.stream().filter(x -> Integer.parseInt(x.getAge_in_days()) == max)
                .forEach(x -> System.out.println(x.getFruit_type() + " : " + x.getAge_in_days()));


    }















}
