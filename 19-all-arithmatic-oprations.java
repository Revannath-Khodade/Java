import java.util.Scanner;
class Main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        
        System.out.print("Enter A Number =");
        a = sc.nextInt();
        
        System.out.print("Enter B Number =");
        b = sc.nextInt();
        
        //Arithmatic
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        
        //Conditional
        System.out.println("a>b = "+(a>b));
        System.out.println("a<b = "+(a<b));
        System.out.println("a>=b = "+(a>=b));
        System.out.println("a<=b = "+(a<=b));
        System.out.println("a==b = "+(a==b));
        System.out.println("a!=b = "+(a!=b));
        
        
        
        //Increment
        System.out.println("Before Increment  "+(a++));
        System.out.println("Increment  "+(a));
        
        //Decrement
        System.out.println("Before Decrement  "+(b--));
        System.out.println("Decrement  "+(b));
        
        
        //PreIncrement
        System.out.println("PreIncrement A value is 6 then  =  "+(++a));

    
        //PreDecrement
        System.out.println("Decrement  b value  is 2 then =    "+(--b));
        
        
        //Assign
        int c=a+b;
        System.out.println(c);
        
        
        //Short Hand
        a+=b;
        System.out.println("First A value is 7 Then A is   =  "+a);


        b-=a;
        System.out.println("First B value is 1 Then B is   =  "+b);
        
        
        
        //Tilt
        int d=7;
        System.out.println(~d);
        
    }
}