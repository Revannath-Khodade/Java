class Main 
{
    public static void main(String args[])
    {
        int a=3 , b=5 , c=7 , d;
        System.out.println("A=  "+a+"\tB=  "+b+"\tC=  "+c);
        d=a;
        a=b;
        b=c;
        c=d;
        System.out.println("A=  "+a+"\tB=  "+b+"\tC=  "+c);
    }
}