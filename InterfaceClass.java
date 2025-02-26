public class InterfaceClass {
    public static void main(String[] args) {
        interfaceEx obj=new interfaceEx();
        obj.test11();

    }
}

    interface A1 {
        void test11();
    }

    interface B1 {
        void test11();
    }

class interfaceEx implements A1,B1{
    public void test11(){
        System.out.println("interface method");

    }

}