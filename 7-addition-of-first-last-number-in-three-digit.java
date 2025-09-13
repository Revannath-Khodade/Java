import java.util.Scanner;
class Main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num , first , last , total;
        System.out.print("Enter Three Digit Number :");
        num = sc.nextInt();
        
        first = num/100;
        last = num%10;
        
        total = first+last;
        System.out.println("Firat Number Is :"+first);
        System.out.println("Last Number Is :"+last);
        System.out.print("Addition Of First And Last Number :"+total);
        
       
    }
}