import java.util.Scanner;
class Main
{
    public static void main (String args[])
    {
        int monthno;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Month Number :");
        monthno = sc.nextInt();
        
        if(monthno==1)
        {
            System.out.print("Total Number Of Days In Month(1) January Is = 31");
        }
        
        else if(monthno==2)
        {
            System.out.print("Total Number Of Days In Month(2) February Is = 28");
        }
        
        else if(monthno==3)
        {
            System.out.print("Total Number Of Days In Month(3) March Is = 31");
        }
        
        else if(monthno==4)
        {
            System.out.print("Total Number Of Days In Month(4) April Is = 30");
        }
        
        else if(monthno==5)
        {
            System.out.print("Total Number Of Days In Month(5) May Is = 31");
        }
        
        else if(monthno==6)
        {
            System.out.print("Total Number Of Days In Month(6) June Is = 30");
        }
        
        else if(monthno==7)
        {
            System.out.print("Total Number Of Days In Month(7) Jully Is = 31");
        }
        
        else if(monthno==8)
        {
            System.out.print("Total Number Of Days In Month(8) August Is = 31");
        }
        
        else if(monthno==9)
        {
            System.out.print("Total Number Of Days In Month(9) Septmber Is = 30");
        }
        
        else if(monthno==10)
        {
            System.out.print("Total Number Of Days In Month(10) October Is = 31");
        }
        
        else if(monthno==11)
        {
            System.out.print("Total Number Of Days In Month(11) November Is = 30");
        }
        
        else if(monthno==12)
        {
            System.out.print("Total Number Of Days In Month(12) December Is = 31");
        }
        
        else
        {
            System.out.print("Given Number Of Month Is Invalid");
        }
        
        
    }
}