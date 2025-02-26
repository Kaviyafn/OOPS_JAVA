public class Default_constructor_Counter {
    static int count=0;



      Default_constructor_Counter( )
      {

           count++;
      }

    public static void main(String[] args) {
        Default_constructor_Counter obj1=new Default_constructor_Counter();
        System.out.println("object created!current count increased:"+count);

        Default_constructor_Counter obj2=new Default_constructor_Counter();
        System.out.println("object created!current count increased:"+count);

        Default_constructor_Counter obj3=new Default_constructor_Counter();
        System.out.println("object created!current count increased:"+count);

    }
}
