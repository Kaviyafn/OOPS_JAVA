public class Book {
    String title;
    float price;

     void Getbook() {
         title="java programming";
         price=100.0f;



    }

    public static void main(String[] args) {
        Book obj=new Book();
        obj.Getbook();
        System.out.println("book title:"+obj.title);
        System.out.println("book price:"+obj.price);



    }
}
