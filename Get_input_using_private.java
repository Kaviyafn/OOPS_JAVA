import java.util.Scanner;

public class Get_input_using_private {
    private int a,b,c;
    private void get(){
        Scanner in =new Scanner(System.in);
        System.out.println("enter the a:");
        a=in.nextInt();
        System.out.println("enter the b:");
        b=in.nextInt();

    }
    public void sum(){
        get();
        c=a+b;
        System.out.println("the total sum:"+c);
    }
    }


        class total {
            public static void main(String[] args) {
                Get_input_using_private obj=new Get_input_using_private();
                obj.sum();
            }
        }