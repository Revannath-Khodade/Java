class Main 
{
    public static void main(String args[])
    {
        int i=0, od=0, evn=0;
        while (i<=10)
        {
            if(i%2==1)
            {
                od = od +i;
                
            }
            else
            {
                evn = evn + i;
            }
            i++;
            
        }
        System.out.println("Addition Of Odd Numbers = "+od);
        System.out.println("Addition Of Even Numbers  = "+evn);
    }
}