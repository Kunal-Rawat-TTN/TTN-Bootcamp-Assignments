public class Test {
    public static void produceClassNotFoundException() {
        try {
            // Attempt to load a non-existent class
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
    public static void produceNoClassDefFoundError() {
        try {
            // available at compile time but missing at runtime
            new MissingClass();
        } catch (Throwable t) {
            System.out.println("NoClassDefFoundError caught: " + t.getMessage());
        }
    }
    public static void main(String[] args) {
        produceClassNotFoundException();
        produceNoClassDefFoundError();
    }
}
// missing at runtime
class MissingClass {
    // This class will be compiled but deleted before runtime to cause NoClassDefFoundError
}