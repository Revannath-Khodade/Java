import java.util.Scanner;
class Main 
{
    public static void main(String args[])
    {
        int monthNo;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Month Number : ");
        monthNo=sc.nextInt();
        
        switch(monthNo)
        {
            case 1:System.out.print("Jan");break;
            case 2:System.out.print("Feb");break;
            case 3:System.out.print("Mar");break;
            case 4:System.out.print("Apr");break;
            case 5:System.out.print("May");break;
            case 6:System.out.print("Jun");break;
            case 7:System.out.print("Jully");break;
            case 8:System.out.print("Aug");break;
            case 9:System.out.print("Sep");break;
            case 10:System.out.print("Oct");break;
            case 11:System.out.print("Nov");break;
            case 12:System.out.print("Dec");break;
            default:System.out.print("Invalid Month No");break;
        }
    }
}