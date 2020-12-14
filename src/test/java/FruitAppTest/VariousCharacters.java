package FruitAppTest;


import org.testng.annotations.Test;
import pojoFruitApp.FruitAppPojo;
import utulities.ReadCsvFile;

import java.util.*;

public class VariousCharacters {

    public static List<FruitAppPojo> fruitPojoList;

@Test
    public static void variousChar()  {
    fruitPojoList = ReadCsvFile.getFruitDetails(ReadCsvFile.path);
        List<FruitAppPojo> list1;
    ArrayList<String> stringArrayList= new ArrayList<>();
    Map<String,Integer> map= new LinkedHashMap<>();
        for (int i = 0; i < fruitPojoList.size(); i++) {

            list1 = Arrays.asList(new FruitAppPojo(fruitPojoList.get(i).getFruit_type(),

                    fruitPojoList.get(i).getCharacteristic1(), fruitPojoList.get(i).getGetCharacteristic2()));

            list1.stream().distinct().forEach(x -> stringArrayList.add(x.getFruit_type() + " : " + x.getCharacteristic1() + " ," + x.getGetCharacteristic2()));
        }



        for(int i=0;i<stringArrayList.size();i++){

            if(map.containsKey(stringArrayList.get(i))){

                map.put(stringArrayList.get(i),map.get(stringArrayList.get(i))+1);


            }else{

                map.put(stringArrayList.get(i),1);

            }





        }
    map.forEach((key,value) -> System.out.println(value + " " + key));









}




    }


















