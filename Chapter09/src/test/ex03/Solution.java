package test.ex03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution{
	
//	배치를 바꿔서 곱했을 때 최소의 수가 나오는 경우를 리턴해라 (A배열과 B배열의 경우의 수를 바꿔)
//	규칙은 0번 index끼리 1번 index끼리 2번 index까지 곱해서 더하는 것
	
//	A와 B 배열의 길이는 같다.
	
//	내림차순은 클래스타입에만 사용 가능하다. (reverseAll) → 하려면 리스트로 옮겨서 해도 된다.
	
//	Arrats.sort() 는 원본을 변경 시킨다.
	
//	효율성 테스트 : 1.45ms ~ 2.05ms
//	[방법 1] Arrts.sort() 사용
    public int solution(int []A, int []B) {
        int answer = 0;
        
        Arrays.sort(A); // 오름차순
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
//        	System.out.println(A[i] + "*" + B[A.length -1 -i]);
//        	System.out.println(A[i] + "*" + B[B.length -1 -i]);
        	answer += A[i] * B[(B.length - 1) -i]; 
        }

        return answer;
    }
    
//  [방법 2] ★ 효율성 통과 실패
//  Queue에 PriorityQueue는 정렬을 기본적으로 해준다.
//  Comparator.reverseOrder() 는 클래스타입만 가능하다.
    public int solution2(int []a, int []b) {
    	int answer = 0;
    	
    	PriorityQueue<Integer> asc = new PriorityQueue<Integer>(); // 오름차순 정렬
    	PriorityQueue<Integer> desc = new PriorityQueue<Integer>(Comparator.reverseOrder()); // 내림차순 정렬
    	
    	for (int i = 0; i < b.length; i++) {
			asc.add(a[i]);
			desc.add(b[i]); // 둘 다 사용 가능
		
		}
    	
    	
    	for(int i = 0; i < b.length; i++) {
    		answer += asc.poll() * desc.poll();
    	}
    	
    	
//    	출력할 때는 넣은 순서로 보여주지만, 뽑아낼 때 정렬을 시켜준다.
//    	System.out.println(asc + "  " + desc);
//    	
//    	for (int i = 0; i < b.length; i++) {
//			System.out.println(asc.poll() + " * " + desc.poll());
//		}
    	
    	return answer;
    	
    }
    
    
    
}