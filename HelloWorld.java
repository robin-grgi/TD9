public class HelloWorld {

    private int entier = 0;
    public static native void printCpp();
    public static native void printStringToCpp(String str);
    public native String stringFromCpp();
    public native void callJavaMethod();
    public native String toString();
    public native int fib(int n);
    static {
        System.loadLibrary("HelloWorld");
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("Hello, World from Java!");
        HelloWorld.printCpp();
        HelloWorld.printStringToCpp("C++ printf from Java String");
        System.out.println(helloWorld.stringFromCpp());
        helloWorld.callJavaMethod();
        System.out.println(helloWorld.toString());
        System.out.println(""+helloWorld.fib(15));
    }

    public static void test(String str) {
        System.out.println("TEST "+str);
    }
}