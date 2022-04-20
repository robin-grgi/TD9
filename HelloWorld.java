public class HelloWorld {
    public static native void printCpp();
    public static native void printStringToCpp(String str);
    public native String stringFromCpp();
    static {
        System.loadLibrary("HelloWorld");
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("Hello, World from Java!");
        HelloWorld.printCpp();
        HelloWorld.printStringToCpp("C++ printf from Java String");
        System.out.println(helloWorld.stringFromCpp());
    }
}