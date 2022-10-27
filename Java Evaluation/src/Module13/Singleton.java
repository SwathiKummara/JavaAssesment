public class Singleton {
    public static void main(String[] args) {
        Database db1;
        db1 = Database.getInstance();
        db1.getConnection();
    }
}
class Database{
    private static Database dbObject;
    private Database(){

    }
    static Database getInstance(){
        if(dbObject == null){
            dbObject = new Database();
        }
        return dbObject;
    }
    public void getConnection(){
        System.out.println("you are connected to the database.");
    }
}
//        We have created a singleton class Database.
//        The dbObject is a class type field. This will refer to the object of the class Database.
//        The private constructor Database() prevents object creation outside of the class.
//        The static class type method getInstance() returns the instance of the class to the outside world.
//        In the Main class, we have class type variable db1. We are calling getInstance() using db1 to get the
//        only object of the Database.
//        The method getConnection() can only be accessed using the object of the Database.
//        Since the Database can have only one object, all the clients can access the database through a single connection.