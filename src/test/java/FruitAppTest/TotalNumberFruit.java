package FruitAppTest;


import org.testng.annotations.Test;
import pojoFruitApp.FruitAppPojo;
import utulities.ReadCsvFile;

import java.util.List;

public class TotalNumberFruit {
    public static List<FruitAppPojo> fruitPojoList;



@Test
    public static void totalNumberFruit() {

        int count = 0;
        fruitPojoList = ReadCsvFile.getFruitDetails(ReadCsvFile.path);
        for (FruitAppPojo number : fruitPojoList) {
            count++;

        }
        System.out.println("The total number of Fruit:" + count);


    }
















}
