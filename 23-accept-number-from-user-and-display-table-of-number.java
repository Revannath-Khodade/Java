import java.util.Scanner;
class Main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int i=1 , b;
        
        System.out.print("Enter Number of table :");
        b = sc.nextInt();
        
        while(i<=10)
        {
            System.out.println(b*i);
            i++;
            
        }
    }
}