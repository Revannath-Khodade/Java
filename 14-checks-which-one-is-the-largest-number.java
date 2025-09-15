import java.util.Scanner;
class Main 
{
    public static void main(String arg[])
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter A Number :");
        a = sc.nextInt();
        
        System.out.print("Enter B Number :");
        b = sc.nextInt();
        
        System.out.print("Enter C Number :");
        c = sc.nextInt();
        
        if(a>b && a>c)
        {
            System.out.print("A is Large Number :"+a);
        }
        else if(b>a && b>c)
        {
            System.out.print("B is Large Number :"+b);
        }
        else if(c>a && c>b)
        {
            System.out.print("C is Large Number :"+c);
        }
        
    }
}