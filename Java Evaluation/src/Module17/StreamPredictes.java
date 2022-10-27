import java.util.function.Predicate;

public class StreamPredictes {
    public static void main(String[] args) {

           predicate_or();
           predicate_and();
    }
    public static Predicate<String> containsS = new Predicate<String>()
    {
        @Override
        public boolean test(String t)
        {
          return t.contains("S");
        }
    };
    public static void predicate_or()
    {
        String name = "Swathi";
        Predicate<String> containsVowela = p -> p.contains("a");
        boolean answer = containsS.or(containsVowela).test(name);
        System.out.println(answer);
    }

    public static void predicate_and()
    {
        String name = "hari";
        Predicate<String> containsVowela = p -> p.contains("a");
        boolean answer = containsS.and(containsVowela).test(name);
        System.out.println(answer);
    }
}