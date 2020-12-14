package FruitAppTest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.testng.annotations.Test;
import pojoFruitApp.FruitAppPojo;
import utulities.ReadCsvFile;

import java.util.List;
import java.util.stream.Collectors;

public class AllFruitDetails {

    public static List<FruitAppPojo> fruitPojoList;

@Test
    public static void AllFruitDetails() {

        fruitPojoList = ReadCsvFile.getFruitDetails(ReadCsvFile.path);
        fruitPojoList.stream().parallel()
                .collect(Collectors.toList()).
                forEach(x -> System.out.println(x.getFruit_type() + "," + x.getAge_in_days() + "," + x.getCharacteristic1() + "," + x.getGetCharacteristic2()));


    }


















}
