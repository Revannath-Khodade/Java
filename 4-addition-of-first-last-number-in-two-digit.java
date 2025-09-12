import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int num , first , last , total;
        
        System.out.print("Enter Two Digit Number :");
        num = sc.nextInt();
        
        first = num/10;
        last = num%10;
        total = first+last;
        
        System.out.println("First Number :" +first );
        System.out.println("Last Number :" +last);
        System.out.println("Addition Of First And Last Number :" +total);
    }
}