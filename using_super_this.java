class Shape1{
    double area1;
    public void area1() {
        System.out.println("to finding area of rectangle");
    }

}
class rectangle1 extends Shape1{
    double l,b;
    rectangle1(double l,double b){
        this.l=l;
        this.b=b;
        System.out.println(l*b);

    }
 public  void area1(double l,double b){
     super.area1();
     area1=l*b;
     System.out.println("area of rectangle is:"+area1);

 }
}




public class using_super_this {
    public static void main(String[] args) {
        rectangle1 obj1=new rectangle1(12.0,13.0);

        obj1.area1();

    }
}
