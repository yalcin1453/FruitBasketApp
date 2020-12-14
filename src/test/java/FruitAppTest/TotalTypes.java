package FruitAppTest;


import org.testng.annotations.Test;
import pojoFruitApp.FruitAppPojo;
import utulities.ReadCsvFile;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TotalTypes {

    public static List<FruitAppPojo> fruitPojoList;


@Test
    public static void totalTypes()  {
        fruitPojoList =ReadCsvFile.getFruitDetails(ReadCsvFile.path);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < fruitPojoList.size(); i++) {
            set.add(fruitPojoList.get(i).getFruit_type());


        }

        System.out.println("The total number types of fruit :" + set.size());


    }


}
