public class Parameterized_BookDetails {
    String title;
    String author;
    float price;

    Parameterized_BookDetails(String title, String author, float price){
        this.title = title;
              this. author = author;
               this.price = price;
    display();
    }

    void display(){
        System.out.println("the title is:"+this.title);
        System.out.println("the author name is:"+this.author);
        System.out.println("the price is:"+this.price);
    }


    public static void main(String[] args) {
        Parameterized_BookDetails obj = new Parameterized_BookDetails("java programming", "kaviya", 100.0f);

    }


}
