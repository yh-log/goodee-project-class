package ex02;

public class StmtElse {

	public static void main(String[] args) {

		
//		만약 두부가 있으면 두부를 사고, 없으면 순두부를 산다.
		
		int tofuBox = 1;
		
		System.out.println("가게에 간다.");
		
//		if (tofuBox >= 1) {
//			System.out.println("두부를산다.");
//		} 
//		if (tofuBox <= 0) {
//			System.out.println("순두부를 산다.");
//		}
		
		
		if (tofuBox > 0) {
			System.out.println("두부를산다.");
		} else {
			System.out.println("순두부를 산다.");
		}
		
		System.out.println("집에 온다.");
	}

}
