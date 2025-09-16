import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int i=1,num;
        
        System.out.print("Enter Number = ");
        num = sc.nextInt();
        
        System.out.println("Total Number Of Factor Is");
        
        while(i<=num)
        {
            if(num%i==0)
            {
                
                System.out.println(i);
                
            }
            
            i++;
        }
        
    }
}