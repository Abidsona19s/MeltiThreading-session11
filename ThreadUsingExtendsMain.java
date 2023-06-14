package multithreadin_session_11;

public class ThreadUsingExtendsMain {

	public static void main(String[] args) throws Exception{
        ThreadUsingExtend  threadObj = new ThreadUsingExtend("Thread1",12);

		threadObj.start();
		threadObj.join();

	}

}
