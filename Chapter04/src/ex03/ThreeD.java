package ex03;

public class ThreeD {

	public static void main(String[] args) {

//		royal 아파트는 4개층 4개호 방 3개 짜리 아파트 이다.
		
		String[][][] royal = new String[4][4][3];
		
//		2층 3호 2번방은 철수의 방이다.
		royal[2][3][2] = "철수의 방";
		
//		0층 0호 0번방은 영희의 방이다.
		royal[0][0][0] = "영희의 방";
		
		royal[3][3][2] = "마지막 방";
		
		
//		null = 정보의 부재, 공백과는 다르다. (null 인 상태에서는 건드리면 안된다. = 진공과 같은 상태 -> null을 이용하려고 하면 nullpointException? 이 발생한다.)
//		진공상태와 같아.
		
		for (int i = 0; i < royal.length; i++) {
//			System.out.println( i + "층 =========");
			for (int j = 0; j < royal[i].length; j++) {
				for (int z = 0; z < royal[i][j].length; z++) {
					if (royal[i][j][z] == null) {
						royal[i][j][z] = "빈 방";
					}
					
					System.out.println(i + "층 " + j + "호 = " + royal[i][j][z]);
				}
			}
		}
		
	}

}
