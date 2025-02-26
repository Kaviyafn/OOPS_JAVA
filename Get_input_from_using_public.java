import java.util.Scanner;

public class Get_input_from_using_public {

    public int a,b,c;
    public void display(){
        System.out.print("sum:"+c);
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Get_input_from_using_public obj=new Get_input_from_using_public();
        obj.a=in.nextInt();
        obj.b= in.nextInt();
        obj.c=obj.a+obj.b;
        obj.display();

    }
}
