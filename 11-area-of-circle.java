import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float radius , area;
        
        System.out.print("Enter Radius Of Circle :");
        radius = sc.nextFloat();
        
        area = (float)(3.14*radius*radius);
        System.out.print("Area Of Circle :"+area);
    }
}