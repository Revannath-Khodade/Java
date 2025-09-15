import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int time, amt;
        float roi, yearly, monthly, totalI;
        
        System.out.print("Enter Amount :");
        amt = sc.nextInt();
        
        System.out.print("Enter Time In Months  :");
        time = sc.nextInt();
        
        System.out.print("Enter Rate of Interest :");
        roi = sc.nextFloat();
        
        yearly = (float)(roi/100)*amt;
        monthly = yearly/12;
        totalI = monthly*time;
        
        System.out.println("Total Interest :"+totalI);
        System.out.println("Total Payable Amt :"+(totalI+amt));
        
        
    }
}