package Module9;

import java.io.FileInputStream;
import java.util.Properties;

 abstract class Main extends Capital{
     public static void main(String[] args) throws Exception {


        FileInputStream fis =new  FileInputStream("/home/swathi/Java Evaluation/capitals.properties");

        Properties properties = new Properties();

        Amaravathi amaravathi = new Amaravathi();
        Bangalore bangalore = new Bangalore();
        Gandhinagar gandhinagar = new Gandhinagar();

        properties.load(fis);

        Capital obj = new Capital() {
            @Override
            String getCapital() {

                return properties.getProperty("Gujarat");


            }
        };
        if (obj.getCapital().equals(amaravathi.getCapital())) {
            System.out.println(amaravathi.getDetails());
        }
        else if(obj.getCapital().equals(gandhinagar.getCapital())){
            System.out.println(gandhinagar.getDetails());
        }
        else if(obj.getCapital().equals(bangalore.getCapital())){
            System.out.println(bangalore.getDetails());
        }

    }





 }
    abstract class Capital{
        abstract String getCapital();

    }

