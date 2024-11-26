/**
 * fileName       : HelloJNI
 * author         : baehyoyeol
 * date           : 2023/08/04
 * description    :
 */
public class HelloJNI {  // Save as HelloJNI.java
    static {
        System.loadLibrary("hello"); // Load native library hello.dll (Windows) or libhello.so (Unixes)
        //  at runtime
        // This library contains a native method called sayHello()
    }

    // Declare an instance native method sayHello() which receives no parameter and returns void
    private native void sayHello();

    // Test Driver
    public static void main(String[] args) {
        new HelloJNI().sayHello();  // Create an instance and invoke the native method
    }
}
