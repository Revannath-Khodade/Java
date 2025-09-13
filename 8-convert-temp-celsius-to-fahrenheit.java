import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float cel , total;
        
        System.out.print("Enter temprature Degree Cel :");
        cel = sc.nextFloat();
        
        total = (float)(cel*1.8+32);
        System.out.print("F tem Is Equal to : "+total);
        
    }
}