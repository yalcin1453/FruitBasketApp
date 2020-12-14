package pojoFruitApp;

public class FruitAppPojo {

    private String fruit_type;
    private String age_in_days;
    private String characteristic1;
    private String getCharacteristic2;

    public FruitAppPojo(String fruit_type, String age_in_days, String characteristic1, String getCharacteristic2) {
        this.fruit_type = fruit_type;
        this.age_in_days = age_in_days;
        this.characteristic1 = characteristic1;
        this.getCharacteristic2 = getCharacteristic2;
    }

    public FruitAppPojo() {
    }

    public FruitAppPojo(String fruit_type, String characteristic1, String getCharacteristic2) {
        this.fruit_type = fruit_type;
        this.characteristic1 = characteristic1;
        this.getCharacteristic2 = getCharacteristic2;


    }

    public String getFruit_type() {
        return fruit_type;
    }

    public void setFruit_type(String fruit_type) {
        this.fruit_type = fruit_type;
    }

    public String getAge_in_days() {
        return age_in_days;
    }

    public void setAge_in_days(String age_in_days) {
        this.age_in_days = age_in_days;
    }

    public String getCharacteristic1() {
        return characteristic1;
    }

    public void setCharacteristic1(String characteristic1) {
        this.characteristic1 = characteristic1;
    }

    public String getGetCharacteristic2() {
        return getCharacteristic2;
    }

    public void setGetCharacteristic2(String getCharacteristic2) {
        this.getCharacteristic2 = getCharacteristic2;
    }

    @Override
    public String toString() {
        return "FruitAppPojo{" +
                "fruit_type='" + fruit_type + '\'' +
                ", age_in_days='" + age_in_days + '\'' +
                ", characteristic1='" + characteristic1 + '\'' +
                ", getCharacteristic2='" + getCharacteristic2 + '\'' +
                '}';
    }
}

