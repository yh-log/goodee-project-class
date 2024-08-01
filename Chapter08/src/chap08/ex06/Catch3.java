package chap08.ex06;

public class Catch3 {

	public static void main(String[] args) {

		String[] arr = new String[2];
		
		
//		모든 예외를 한번에 처리를 해주고 싶은 경우 사용 (다형성을 활용)
		try {
			arr[0] = "12345";
			arr[1] = "a12345"; 	
			arr[2] = "45678"; 	// ArratIndexOutofBoundException
			
			int val1 = Integer.parseInt(arr[0]);
			int val2 = Integer.parseInt(arr[1]); // NumberFormatException
			
			System.out.println(val1 + val2);	// NumberFormatException			
			
		} catch (Exception e) {
			
			System.out.println("예외가 발생되었습니다.");
			e.printStackTrace();
			
		} finally {
			System.out.println("끝"); // finally
		}
		
	}

}
