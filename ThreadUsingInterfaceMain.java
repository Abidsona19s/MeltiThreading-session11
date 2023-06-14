package multithreadin_session_11;

public class ThreadUsingInterfaceMain {

	public static void main(String[] args) {
	   ThreadUsingInterface ti=new ThreadUsingInterface();
       Thread th1 = new Thread(ti);
		th1.start();
		
		

	}

}
