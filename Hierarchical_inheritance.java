class Shape2{
    public void area_h(){

        System.out.println("Area of all shape:");

    }
}
class Rectangle2 extends Shape2{
    double l,b;
    public void area_h(double l,double b){

        System.out.println("the area of rectangle is:"+l*b);
    }

}
class Square2 extends Shape2{

    double a=5;
    public void area_h( double a){

        System.out.println("the area of square is:"+a*a);
    }
}
class Triangle2 extends Shape2{
    double l,b;
    public void area_h(double l,double b){
        System.out.println("the area of triangle is:"+0.5*l*b);
    }
}
class circle2 extends Shape2{

    final double pi=3.14;
    double r;
    public void area_h(double r){
        super.area_h();
        System.out.println("the area of circle is:"+pi*r*r);

    }
}
public class Hierarchical_inheritance {
    public static void main(String[] args) {
        circle2 obj1=new circle2();
        obj1.area_h(2.2);

        Triangle2 obj2=new Triangle2();
        obj2.area_h(12.3,3.2);

        Square2 obj4=new Square2();
        obj4.area_h(3.2);

        Rectangle2 obj3=new Rectangle2();
        obj3.area_h(3.4,5.2);
    }
}
