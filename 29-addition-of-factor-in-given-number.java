import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        int i=1, num, sum=0;
        
        System.out.print("Enter The Number = ");
        num = sc.nextInt();
        
        while (i<=num)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
            
            i++;
        }
        
        System.out.print("Total Addition Of Factor Is = "+sum);
    }
}