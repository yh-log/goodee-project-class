package chap08.ex06;

public class Catch2 {

	public static void main(String[] args) {

		String[] arr = new String[2];
		
		
//		예외를 묶어서 처리해주고 싶은 경우
		try {
			arr[0] = "12345";
			arr[1] = "a12345"; 	
//			arr[2] = "45678"; 	// ArratIndexOutofBoundException
			
			int val1 = Integer.parseInt(arr[0]);
			int val2 = Integer.parseInt(arr[1]); // NumberFormatException
			
			System.out.println(val1 + val2);	// NumberFormatException			
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("배열의 인덱스를 확인하거나 숫자를 입력하세요");
			
			e.printStackTrace();
		} finally {
			System.out.println("끝"); // finally
		}
		
	}

}
