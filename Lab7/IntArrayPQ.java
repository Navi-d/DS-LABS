package Lab7;

import java.util.PriorityQueue;

public class IntArrayPQ {
    public static void main(String[] args) {
        int[] array = {4, 8, 1, 2, 9, 6, 3, 7};

        // Insert integers into priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int num : array) {
            priorityQueue.offer(num);
        }
        
        System.out.println("We are gonna simply print the pq:");
        System.out.println(priorityQueue);


        // Peek at the top element (minimum)
        System.out.println("Top element: " + priorityQueue.peek());

        // Remove the top element
        System.out.println("Removing top element: " + priorityQueue.poll());

        // Peek at the top element again
        System.out.println("Top element after removal: " + priorityQueue.peek());

        // Insert a new element
        priorityQueue.offer(5);

        // Peek at the top element after insertion
        System.out.println("Top element after insertion: " + priorityQueue.peek());

        System.out.println("Current size of priority queue: " + priorityQueue.size());


        // Convert priority queue to array
        int[] sortedArray = new int[priorityQueue.size()];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = priorityQueue.poll();
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Current size of priority queue: " + priorityQueue.size());


        System.out.println("\nPriority queue is empty: " + priorityQueue.isEmpty());

        

    }
}
