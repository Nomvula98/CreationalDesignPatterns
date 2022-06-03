public class Main {
    public static void main(String[] args) {
        //Define a class that has only one instance and provides a global point of access to it
        //In other words, a class must ensure that only single instance should be created and single
        // object can be used by all other classes

        //This pattern involves a single class which is responsible to create an object while making sure that
        // only single object gets created. This class provides a way to access its only object which can be
        // accessed directly without need to instantiate the object of the class.
        
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}

