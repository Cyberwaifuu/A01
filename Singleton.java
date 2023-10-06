public class Singleton {
    // Variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to avoid outside instantiation
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showWork() {
        System.out.println("Working :)");
    }
}
