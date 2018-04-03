package demo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    private int count = 0;

    public void Insert(Integer num) {
        ++count;
        if(count % 2 == 1) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
    }

    public Double GetMedian() {
        if(count == 0) return null;
        if(count % 2 == 1) return Double.valueOf(maxHeap.peek());
        else return (double) ((maxHeap.peek() + minHeap.peek()) / 2);
    }
}