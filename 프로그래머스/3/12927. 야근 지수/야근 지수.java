import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        // Use a priority queue to manage the workload
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // Use reverse order for max-heap
        for (int work : works) {
            queue.offer(work); // Add each work item to the queue
        }

        // Distribute n units of work
        while (n-- > 0) {
            int w = queue.poll(); // Get the largest work item
            if (w == 0) break; // If the largest work item is 0, stop

            queue.offer(w - 1); // Decrease it by 1 and add it back to the queue
        }

        long answer = 0; // Initialize answer
        // Calculate the sum of squares of the remaining workloads
        for (int i : queue) {
            answer += i * i; // Use multiplication instead of Math.pow
        }

        return answer; // Return the final result
    }
}
