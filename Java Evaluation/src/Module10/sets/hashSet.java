package Module10.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashSet {
    //1
    Set<Integer> set = new HashSet<Integer>();
    //2
    Set<String> bset = new HashSet<String>(){{add("a");add("b");add("c");}};
    //3
    Set<String> aset = new HashSet<>(Arrays.asList("a", "b", "c"));


}
