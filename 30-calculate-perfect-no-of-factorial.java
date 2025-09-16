import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        int i=1, num, sum=0;
        
        System.out.print("Enter Number = ");
        num = sc.nextInt();
        
        while(i<num)
        {
            if(num%i==0)
            {
                sum = sum+i;
            }
            
            i++;
        }
        
        if(num==sum)
            {
                System.out.print("Given Number Is Perfect Number");
            }
            
            else
            {
                System.out.print("Given Number Is Not Perfect Number");
            }
    }
}