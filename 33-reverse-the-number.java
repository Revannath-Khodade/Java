import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        int num, x;
        
        System.out.print("Enter Number  : ");
        num = sc.nextInt();
        
        while(num>0)
        {
            x=num%10;
            System.out.print(x);
            num = num/10;
        }
    }
}