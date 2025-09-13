import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Enter Side A Of Triangle : ");
        a = sc.nextInt();
        
        System.out.print("Enter Side B Of Triangle : ");
        b = sc.nextInt();
        
        System.out.print("Enter Side C Of Triangle : ");
        c = sc.nextInt();
        
        if(a+b>c && b+c>a && a+c>b)
        {
            System.out.print("Valid Triangle");
        }
        else
        {
            System.out.print("Invalid Triangle");
        }
        
    }
}