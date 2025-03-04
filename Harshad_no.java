public class Harshad_no {
    public static void main(String[] args) {
        for(int i=100;i<=150;i++){
            int num=i;
            int temp=num;
            int sum=0;
            int total_h;
            while(temp>0){
                int digits=temp%10;
                sum=sum+digits;
                temp=temp/10;}
                total_h=num%sum;

            if(total_h==0){
                System.out.println(num+"  is harshad number");
            }
        }
    }
}
