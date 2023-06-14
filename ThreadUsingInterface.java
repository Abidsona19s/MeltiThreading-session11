package multithreadin_session_11;

public class ThreadUsingInterface implements Runnable{
	@Override
	public void run()
	{
			System.out.println("Thread running with id "+Thread.currentThread().getId());
	}
	
	}

