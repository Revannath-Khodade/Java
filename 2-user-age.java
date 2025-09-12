import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        byte age;
        
        System.out.print("Enter Your Age :");
        age = sc.nextByte();
        
        System.out.print("Your Age Is :"+age);
    }
}