import java.util.Scanner;
public class large {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((a>b)&&(b>c)){
          System.out.println("a is largest");
        }
        else if((b>c)&&(b>a)){
           System.out.println("b is larger");
        }
        else{
           System.out.println("c is largest");
        }
            
        }

    }

    

