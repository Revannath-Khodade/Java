class Main 
{
    public static void main(String args[])
    {
        int i=1 , sm=0;
        while (i<=10)
        {
            if(i%2==1)
            {
                sm = sm+i;
            }
            
            i++;
        }
        
        System.out.print("Addition Of First 10 Odd Numbers is  = "+sm);
    }
}