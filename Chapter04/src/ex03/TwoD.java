package ex03;

public class TwoD {

	public static void main(String[] args) {

//		arr 아파트는 2개층 3개 호로 이루어져 있다.
//		int[][] arr1 = new int [2][3];
		
		int[][] arr = {
				{0, 1, 2, 3}, // 0층
				{10, 11, 12, 13} // 1층
		};
		
//		royal 아파트 4개층 4개호
		String[][] royal = new String[4][4];
		
		royal[0][0] = "0층 0호";
		
		for (int i = 0; i < royal.length; i++) {
//			System.out.println(i + "층");
			for (int j = 0; j < royal[i].length; j++) {
//				System.out.println(i + "층" + j + "호");
				royal[i][j] = i + "층-" + j + "호";
				System.out.println(royal[i][j]);
			}
			System.out.println("-------");
		}
		
//		System.out.println(royal[0][1]);
		
//		for (int i = 0; i < royal.length; i++) {
//			for (int j = 0; j < royal[i].length; j++) {
//				System.out.println(royal[i][j]);
//			}
//			
//		}
		
	}

}
