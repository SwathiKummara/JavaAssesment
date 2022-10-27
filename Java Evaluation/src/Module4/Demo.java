package Module4;

import java.lang.reflect.Method;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Person {
    String name();
    int age();
}
class Room {
    @Person(name = "Swathi", age=21)
    public void getPerson() {
    }
}
public class Demo {
    public static void main(String[] args) {
        try {
            Method m = Room.class.getMethod("getPerson");
            Person personAnnotation = (Person) m.getAnnotation(Person.class);
            if (personAnnotation != null) {
                System.out.println(" Name : " + personAnnotation.name());
                System.out.println(" Age : " + personAnnotation.age());
                System.out.println(" --------------------------- ");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException");
            return;
        }
    }
}
