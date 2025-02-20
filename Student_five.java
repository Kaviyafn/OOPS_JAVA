
    import java.util.Scanner;

    public class Student_five {
        String name;
        int regno;
        void get(String name,int regno){

            Scanner in=new Scanner(System.in);
            System.out.println("enter the name:");
            this.name=in.nextLine();
            System.out.println("enter the regno:");
            this.regno=in.nextInt();
        }

        public static void main(String s[]) {
            Student_five obj1=new Student_five();
            for(int i=0;i<=5;i++) {
                obj1.get(obj1.name, obj1.regno);
                System.out.println("Name:"+obj1.name);
                System.out.println("regno:"+obj1.regno);
            }

        }
    }




