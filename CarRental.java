import java.util.Scanner;

public class CarRental {
    int carid;
    String cartype;
    float rent;
    public void getcar(int carid, String cartype, float rent){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the car id:");
        this.carid=in.nextInt();
        System.out.println("Enter the car type:");
        this.cartype=in.next();

    }
    void  getrent(String cartype) {
        if (cartype == "small") {
            System.out.print("the rent is 1000");
        } else if (cartype=="van") {
            System.out.print(" the rent is 800");

        }
        else{
            System.out.println("the rent is 2500");
        }

    }

    public static void main(String[] args) {

    }
}
