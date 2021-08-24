package controller;

public class ThreadId extends Thread{
	
	private int id;
	public ThreadId(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println(this.id);
	}
	
}
