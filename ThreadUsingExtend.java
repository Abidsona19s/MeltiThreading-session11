package multithreadin_session_11;

public class ThreadUsingExtend extends Thread{
	private String threadName;
	private int id;

	public ThreadUsingExtend(String threadName,int id) {
		super();
		this.threadName = threadName;
		this.id=id;
	}
      public void run()
      {
    	  for(int i=1; i<=10; i++) {
  			//System.out.println("Thread with name "+Thread.currentThread().getName()+" : "+i);
  			//System.out.println("Thread with id "+Thread.currentThread().getId()+" : "+i);
  			System.out.println("Thread with name "+threadName+" : "+i);
  			System.out.println("Thread with id "+id+" : "+i);
  			
      }
	
      }

}
