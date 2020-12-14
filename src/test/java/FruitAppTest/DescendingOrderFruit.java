package FruitAppTest;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.testng.annotations.Test;
import pojoFruitApp.FruitAppPojo;
import utulities.ReadCsvFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DescendingOrderFruit {

    public static List<FruitAppPojo> fruitPojoList;
@Test
    public static void descendingOrder()  {
   fruitPojoList = ReadCsvFile.getFruitDetails(ReadCsvFile.path);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <fruitPojoList.size(); i++) {

            if (map.containsKey(fruitPojoList.get(i).getFruit_type())) {

                map.put(fruitPojoList.get(i).getFruit_type(), map.get(fruitPojoList.get(i).getFruit_type()) + 1);

            } else {

                map.put(fruitPojoList.get(i).getFruit_type(), 1);
            }
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        set.stream().forEach(x -> System.out.println(x));

    }

















}
