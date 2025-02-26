public class interface_static_default {
    public static void main(String[] args) {
        InterfaceEm obj = new InterfaceEm();
        obj.testt();

        B11.staticMethodB();
    }
}

interface A11 {
    default void testt() {
        System.out.println("A11 is  default method");
    }
}

interface B11 {


    static void staticMethodB() {
        System.out.println("B11 is static method");
    }
}

class InterfaceEm implements A11, B11 {
    @Override
    public void testt() {
        System.out.println("interface method");
        A11.super.testt();

    }
}
