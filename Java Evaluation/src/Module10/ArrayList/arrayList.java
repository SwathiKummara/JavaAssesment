package Module10.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime.
//        So, it is much more flexible than the traditional array.
////
//        The ArrayList in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of the List interface here.
//        The ArrayList maintains the insertion order internally.
public class arrayList {
    public static void main(String[] args) {
        // 1st initialization
        ArrayList<String> namesList = new ArrayList<>();
//      //methods
//        namesList.add("Swathi");
//        namesList.add("harika");
//        namesList.add("zooro");
//        namesList.add("micky");
//
//        namesList.add("bruno");
//        System.out.println(namesList);
//        boolean b = Collections.addAll(namesList, "Rahul", "OM", "Prem");
//        System.out.println(namesList);
//        namesList.remove(3);
//        System.out.println(namesList);
//        namesList.set(3,"honey");
//        System.out.println(namesList);
//        namesList.clone();
//        System.out.println(namesList);
//        System.out.println(namesList.contains("zooro"));
//        System.out.println(namesList.isEmpty());
//        namesList.clear();
//        System.out.println(namesList);

//        2nd type of initialization

        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Buenres", "Córdoba", "Lampa"));

        // 3rd type of initializatin
        ArrayList<String> list = new ArrayList<String>() {{
            add("A");
            add("B");
            add("C");
        }};

    }

}
