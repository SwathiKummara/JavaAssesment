package Module5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

 class Main implements EmployInterface {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        try {
            // set the properties value
            prop.setProperty("e1","Swathi");
            prop.setProperty("e2", "Garima");
            prop.setProperty("e3", "Pawan");
            prop.setProperty("e4", "sakhi");
            prop.setProperty("e5", "Jai");
            prop.setProperty("e6", "money");
            // save properties to project root folder
            prop.store(new FileOutputStream("employee.properties"),"this is Employee file" );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        EmployInterface obj = new Main();
        Swathi swathi = new Swathi();
        Garima garima = new Garima();
        Pawan pawan = new Pawan();

        if(obj.getEmployee().equals(swathi.getName())){
            System.out.println(swathi.getDesignation());
        }
        else if(obj.getEmployee().equals(pawan.getName())){
            System.out.println(pawan.getDesignation());
        }
        else if(obj.getEmployee().equals(garima.getName())){
            System.out.println(garima.getDesignation());
        }
    }


     @Override
     public String getEmployee() throws IOException {
         FileInputStream fis =new  FileInputStream("/home/swathi/Java Evaluation/employee.properties");

         Properties properties = new Properties();

         properties.load(fis);

        return properties.getProperty("e2");
     }
 }

 // TODO cyclomatic complexity