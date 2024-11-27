public class commandlineadd {
    public static void main(String[] args) {
        if(args.length==2)
        {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int k=a+b;
            System.out.println(" Sum of "+a+"and"+b+ " is "+k);

        }
        else
        System.out.print("wrong number of arguments");

        
    }
    
}
