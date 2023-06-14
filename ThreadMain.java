package multithreadin_session_11;

public class ThreadMain {

	public static void main(String[] args) throws Exception{
		ThreadTable tt=new ThreadTable();
		tt.start();
		tt.sleep(10000);
		tt.run();
		tt.sleep(1000);
		tt.run();

	}

}
