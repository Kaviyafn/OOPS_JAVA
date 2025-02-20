import java.util.Scanner;
    public class Student {
        String name;
        int regno;
        void get(String name,int regno){

            Scanner in=new Scanner(System.in);
            System.out.println("enter the name:");
            this.name=in.nextLine();
            System.out.println("enter the regno:");
            this.regno=in.nextInt();
        }

        public void main(String s[]) {
            Student obj=new Student();
            obj.get(this.name, this.regno);
            System.out.println("Name:"+obj.name);
            System.out.println("regno:"+obj.regno);

        }
    }


