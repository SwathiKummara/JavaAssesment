public class Static_Keyword {
    public static void main(String[] args) {
     //to run program we can simply use static without creating object
        System.out.println(j);
        System.out.println(n);
      A.show();
        System.out.println(A.i * 10);
    }
    static int j = 10;
    static int n;

    // static block
    static {
        n = j * 8;
    }
//static method
    class A{
        static int i = 3;
        public static void show(){
            System.out.println("Hi");
        }
    }
}
// static keyword mainly used for memory management
