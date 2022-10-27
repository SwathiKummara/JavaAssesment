package Module10.maps;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    //1
    Map<Integer,Integer> numbers = new TreeMap<>();
    //2
    Map<Integer,Integer>getNumbers = new TreeMap() {{this.put(1,2);}};
    //3
    Map<String, Integer> map = new TreeMap<String, Integer>() {{ put("one", 1); put("two", 2); put("three", 3); }};





}
