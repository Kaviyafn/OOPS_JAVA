import java.util.Scanner;

public class Calculator_using_methodtypes {
    Scanner in=new Scanner(System.in);

    public void add(){
        int a=in.nextInt();
        int b= in.nextInt();
        int add=a+b;
        System.out.print("the addition:"+add);
        System.out.println();
    }public int sub(){
        int a=in.nextInt();
        int b= in.nextInt();
        int sub=a-b;
        System.out.print("the subraction:"+sub);
        System.out.println();
        return 0;
    }
    public void mul(int a,int b){

        int mul=a*b;
        System.out.print("the multiplication:"+mul);
        System.out.println();

    }
    public int dev(int a,int b){
        int dev=a/b;
        System.out.print("the divition:"+dev);
        System.out.println();
        return 0;

    }

    public static void main(String[] args) {
        Calculator_using_methodtypes obj1=new Calculator_using_methodtypes();
        obj1.add();
       // Calculator_using_methodtype obj2=new Calculator_using_methodtype();
        obj1.sub();
        //Calculator_using_methodtype obj3=new Calculator_using_methodtype();
        obj1.mul(4,5);
       // Calculator_using_methodtype obj4=new Calculator_using_methodtype();
        obj1.dev(6,2);
    }
}
