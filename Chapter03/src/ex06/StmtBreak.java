package ex06;

public class StmtBreak {

	public static void main(String[] args) {

//		i 가 3일 경우 중단하고 빠져 나오기
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
