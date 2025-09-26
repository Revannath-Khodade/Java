import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month Number : ");
        month=sc.nextInt();
        
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.print("Total Number Of Days 31 ");break;
            
            case 4:
            case 6:
            case 9:
            case 11:System.out.print("Total Number Of Days 30 ");break;
            
            case 2:System.out.print("Total Number Of Days 28/29 ");break;
            
            default:System.out.print("Invalid Month ");break;
        }
    }
}