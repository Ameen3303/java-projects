package java_with_DSA;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		minHeap.add(20);
		minHeap.add(5);
		minHeap.add(15);
		minHeap.add(10);
		
		System.out.println("MIN Heap Output:");
		//System.out.println(minHeap);
		
		while(!minHeap.isEmpty()){
			System.out.println(minHeap.poll());
		}
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(20);
		maxHeap.add(5);
		maxHeap.add(15);
		maxHeap.add(10);
		
		System.out.println("MAX Heap Output:");
		while(!maxHeap.isEmpty())
		{
			System.out.println(maxHeap.poll());
		}

		
	}
}
