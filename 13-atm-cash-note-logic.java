import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int amt, fh, th, h;
        
        System.out.print("Enter Amount :");
        amt = sc.nextInt();
        
        fh = amt/500;
        amt = amt%500;
        
        th = amt/200;
        amt = amt%200;
        
        h = amt/100;
        
        System.out.println("500 Notes :"+fh);
        System.out.println("200 Notes :"+th);
        System.out.print("100 Notes :"+h);
        
    }
}