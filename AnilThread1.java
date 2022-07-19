class AnilThread extends Thread
{
public void run()
{
	try
     {
		for(int i=1;i<=70;i++)
            {
			if(i==44)
			{
				Thread.sleep(5000);
			}
				if(i!=43)
			   {
				System.out.println(i);
			   }
			        else
				{
					System.out.println("43 is called");
					}
					}
}

catch(Exception e)
{

}
}
}
class AnilThread1
{
public static void main(String args[])
{
AnilThread an =new AnilThread();
an.start();
}
}