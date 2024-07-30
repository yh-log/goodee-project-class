package chap07.ex05;

import chap07.ex03.KeyEvent;
import chap07.ex03.MouseEvent;

public interface Child extends MouseEvent, KeyEvent {
	
	public void testField(String text);
	
	public void selectOne();
	
	public void checkOne();
	
}
