package chap10.ex06;

public class TimeChecker {
	
	long start;
	long end;
	
	public void timeStart() {
		start = System.currentTimeMillis();
	}
	
	public long timeStop() {
		end = System.currentTimeMillis();
		return end-start;
	}

}
