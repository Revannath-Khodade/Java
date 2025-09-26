import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        int i=1, num;
        
        System.out.print("Enter Number Upto Perfect No  :  ");
        num = sc.nextInt();
        
        while(i<=num)
        {
            int j=1, sm=0;
            
            while(j<i)
            {
                if(i%j==0)
                {   
                    sm=sm+j;
                }
                
                j++;
            }
            
            if(i==sm)
            {
                System.out.println(i);
            }
            
            i++;
        }
    }
}