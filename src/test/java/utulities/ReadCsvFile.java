package utulities;


import pojoFruitApp.FruitAppPojo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvFile {



    public static String path = "C:\\Users\\fatih\\Desktop\\FruitBasketApp.csv";



public static List<FruitAppPojo> getFruitDetails(String filePath){
    List<FruitAppPojo> all = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader((filePath)))) {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            FruitAppPojo fruitPojo = new FruitAppPojo();
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();

            String[] each = line.split(",");
            fruitPojo.setFruit_type(each[0]);
            fruitPojo.setCharacteristic1(each[2]);
            fruitPojo.setGetCharacteristic2(each[3]);
            fruitPojo.setAge_in_days(each[1]);
            all.add(fruitPojo);
        }
        String everything = sb.toString();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return all;
}
























}
