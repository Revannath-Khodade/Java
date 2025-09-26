import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        int n, r, sm=0, originaln, f;
        
        System.out.print("Enter Number :");
        n= sc.nextInt();
        
        originaln=n;
        
        while(n>0)
        {
            r=n%10;
            f=1;
            
            while(r>1)
            {
                f=r*f;
                r--;
            }
            sm=sm+f;
            n=n/10;
        }
        
        if(sm==originaln)
        {
            System.out.print("Strong");
        }
        
        else
        {
            System.out.print("Not Strong");
        }
    }
}