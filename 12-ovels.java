import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    
        char ch;
    
        System.out.print("Enter Charector : ");
        ch = sc.next().charAt(0);
    
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
        {
            System.out.print("Given Charector is Ovel");
        }
        else
        {
            System.out.print("Given Charector is Not Ovel");
        }
    }
    
}