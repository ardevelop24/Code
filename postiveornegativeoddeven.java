import java.util.Scanner;
public class postiveornegativeoddeven {
   
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0&&n%2==0){
        System.out.println("Positive Even");
        }
        else if(n<0&&n%2==0){
        System.out.println("Negative Even");
        }
    }
    
}
