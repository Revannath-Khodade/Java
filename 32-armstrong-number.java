import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        int num, originalNum, sm=0, x;
        
        System.out.print("Enter Number  : ");
        num = sc.nextInt();
        
        originalNum=num;
        
        while(num>0)
        {
            x=num%10;
            sm = sm+(x*x*x);
            num = num/10;
        }
        
        if(sm==originalNum)
        {
            System.out.print("Armstrong Number ");
        }
        
        else
        {
            System.out.print("Not Armstrong Number ");
        }
    }
}