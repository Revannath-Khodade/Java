class Main
{
    public static void main(String arg[])
    {
        int a=3, b=5 ;
        System.out.println("A=  "+a+"\tB  "+b);
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("A=  "+a+"\tB  "+b);
    }
}