public class FinalKeyword_22 {
//    22.Explain usage and working of the final keyword through a simple programme?
//
//    Ans. Final modifier which provides restriction.
//
//    We can use final keyword in 3 ways
//1.final variable : Once we declare a variable as a fina we can’t perform re-assignment.
//            Syntax: final int  A = 100;
//
//2.final method: Once we declare a method as a final it can’t be overridden to our extended class.
//    Syntax: final void Method()
//    {
//    }
//
//3.final class: whenever we declare a class as a final it can’t be extended or inherited to sub classes.
//    Syntax: final Class A{
//    }
// img: https://www.geeksforgeeks.org/final-keyword-in-java/
//    Program:

    public static void main(String[] args) {

        // create a final variable
        final int AGE = 32;

        // try to change the final variable
//        AGE = 45;
        System.out.println("Age: " + AGE);

//        Main obj = new Main();
//        obj.display();
    }

    class FinalDemo {
        // create a final method
        public final void display() {
            System.out.println("This is a final method.");
        }
    }

    class Main extends FinalDemo {
        // try to override final method
//        public final void display() {
//            System.out.println("The final method is overridden.");
//        }


    }

    // create a final class
    final class FinalClass {
        public void display() {
            System.out.println("This is a final method.");
        }
    }

    // try to extend the final class
//    class Main extends FinalClass {
//        public  void display() {
//            System.out.println("The final method is overridden.");
//        }



}
