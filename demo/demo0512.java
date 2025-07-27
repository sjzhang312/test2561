package demo;

import java.util.Stack;

public class demo0512 {


}



 class SortStack {
    public static void sortStack(Stack<Integer> unsorted, Stack<Integer> sorted) {
        while (!unsorted.isEmpty()) {
            int temp = unsorted.pop();

            // Move elements from sorted to unsorted until we find correct position
            while (!sorted.isEmpty() && sorted.peek() > temp) {
                unsorted.push(sorted.pop());
            }

            // Place the element in sorted stack
            sorted.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> unsorted = new Stack<>();
        Stack<Integer> sorted = new Stack<>();

        // Example input
        unsorted.push(3);
        unsorted.push(1);
        unsorted.push(4);
        unsorted.push(2);

        System.out.println("Before sorting: " + unsorted);
        sortStack(unsorted, sorted);
        System.out.println("After sorting: " + sorted);
    }
}