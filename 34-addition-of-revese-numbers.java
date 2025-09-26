import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        int num, x, sm=0;
        
        System.out.print("Enter The Number :  ");
        num = sc.nextInt();
        
        while(num>0)
        {
            x=num%10;
            sm=sm+x;
            num=num/10;
        }
        
        System.out.print(sm);
    }
}