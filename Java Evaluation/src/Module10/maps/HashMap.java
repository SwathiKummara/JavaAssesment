package Module10.maps;

//Java HashMap is a hash table based implementation of Java’s Map interface. A Map, as you might know, is a collection of key-value pairs. It maps keys to values.
//A HashMap cannot contain duplicate keys.
//
//        Java HashMap allows null values and the null key.
//
//        HashMap is an unordered collection. It does not guarantee any specific order of the elements.
//
//        Java HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap.

import java.util.Map;

import static javax.swing.UIManager.put;

public  class HashMap<S, S1> {
    //1st initialization
    Map<Integer,String> names = new java.util.HashMap<>();
    //2nd initialization
    Map<String, String> h = new java.util.HashMap<String, String>() {{put("a","b");}};
    //3rd initialization
    Map< String , String > animalSounds = java.util.Map.of("dog"  , "bark" ,   "cat"  , "meow" ,   "bird" , "chirp");

}
