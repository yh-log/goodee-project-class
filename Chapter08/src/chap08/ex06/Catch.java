package chap08.ex06;


public class Catch {

	public static void main(String[] args) {

		String[] arr = new String[2];
		
		
//		예외를 각각 처리해 주고 싶을 경우
		try {
			arr[0] = "12345";
			arr[1] = "a12345"; 	
			arr[2] = "45678"; 	// ArratIndexOutofBoundException
			
			int val1 = Integer.parseInt(arr[0]);
			int val2 = Integer.parseInt(arr[1]); // NumberFormatException
			
			System.out.println(val1 + val2);	// NumberFormatException			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 확인해 주세요.");
			
			System.out.println(e.toString()); // 예외의 정보를 간단하게 보는 방법
			
		} catch(NumberFormatException e) {
			System.out.println("숫자만 넣으세요");
			
			e.printStackTrace(); // 아주 상세한 예외 정보 보는 방법 (개발시에만 사용하고 이후 주석처리 해야한다.)
		} finally {
			System.out.println("끝"); // finally
		}
		
	}

}
