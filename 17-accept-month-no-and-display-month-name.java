import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        byte monthno;
    
        System.out.print("Enter Month No :");
        monthno =sc.nextByte();
        
        
        if(monthno==1)
        {
            System.out.print("Given Month Number Is January");
        }
        else if(monthno==2)
        {
            System.out.print("Given Month Number Is February");
        }
        
        else if(monthno==3)
        {
            System.out.print("Given Month Number Is March");
        }
        
        
        else if(monthno==4)
        {
            System.out.print("Given Month Number Is April");
        }
        
        
        else if(monthno==5)
        {
            System.out.print("Given Month Number Is May");
        }
        
        
        else if(monthno==6)
        {
            System.out.print("Given Month Number Is June");
        }
        
        
        else if(monthno==7)
        {
            System.out.print("Given Month Number Is Jully");
        }
        
        
        else if(monthno==8)
        {
            System.out.print("Given Month Number Is August");
        }
        
        
        else if(monthno==9)
        {
            System.out.print("Given Month Number Is September");
        }
        
        
        else if(monthno==10)
        {
            System.out.print("Given Month Number Is October");
        }
        
        
        else if(monthno==11)
        {
            System.out.print("Given Month Number Is November");
        }
        
        
        else if(monthno==12)
        {
            System.out.print("Given Month Number Is December");
        }
        
        else
        {
            System.out.print("Given Month Number Is Invalid");
        }
        
    }
    
}