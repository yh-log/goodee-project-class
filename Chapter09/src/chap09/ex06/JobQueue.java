package chap09.ex06;

import java.util.LinkedList;
import java.util.Queue;

public class JobQueue {

	public static void main(String[] args) {

		Queue<Job> queue = new LinkedList<Job>();
		
//		큐에 할 일을 넣는다.
		queue.offer(new Job("send SMS", "Alice"));
		queue.offer(new Job("send Mail", "Bryan"));
		queue.offer(new Job("sned KATALK", "Criss"));
		queue.offer(new Job("send Mail", "Denis"));
		queue.offer(new Job("send SMS", "Erick"));
		
//		send SMS 가 Alice 4 -> 이게 나와야 하는데 send SMS 가 Alice 3
//		poll() 이 2번 반복되니까 2개가 빠져버린다.
//		System.out.println(queue.poll().getCommand() + " to " + queue.poll().getTo() + " " + queue.size());

		Job job = queue.poll();
		
//		poll()은 한번만 사용할 수 있도록
		System.out.println(job.getCommand() + " to " + job.getTo() + " size : " + queue.size());
		
//		while(!queue.size() < 0) { -> while문 안에서 job이 정의되어 있어야 하고, 그렇지 않으면 무한반복이 된다.(job은 poll을 담고 있으므로)
//			System.out.println(job.getCommand() + " to " + job.getTo() + " size : " + queue.size());
//		}
		
		while(!queue.isEmpty()) {
			job = queue.poll();
			System.out.println(job.getCommand() + " to " + job.getTo() + " size : " + queue.size());
		}
		
	}

}
