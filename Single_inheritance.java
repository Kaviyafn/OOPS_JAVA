

class Parents{
    public int age_pa=50;
    public void display(){
        System.out.print("the parent age is:"+age_pa);
        System.out.println();
    }

}
class Child extends Parents{
    public int age_ch=20;
    public void show(){
        System.out.println("the child age is:"+age_ch);
    }
}
class Single_inheritance {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.show();
    }

}