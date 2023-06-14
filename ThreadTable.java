package multithreadin_session_11;
//Extending the Thread class
public class ThreadTable extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*3);
		}
	}
	

}
