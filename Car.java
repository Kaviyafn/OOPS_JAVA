import java.util.Scanner;

public class Car {
    String brand="Unknown";

    public void setBrand() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the brand name:");
        this.brand=in.next();

    }

    public static void main(String[] args) {
        Car obj=new Car();
        System.out.println("the old brandis:"+obj.brand);
        obj.setBrand();
        System.out.println("the new brand is:"+obj.brand);

    }
}
