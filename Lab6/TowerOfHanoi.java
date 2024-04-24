package stack;

import java.util.Stack;

/* @author Amaan Geelani Syed S2191704 */
public class TowerOfHanoi {

    private final Stack<Integer> source;
    private final Stack<Integer> auxiliary;
    private final Stack<Integer> destination;
    private final int numberOfDisks;

    public TowerOfHanoi(int disks) {
        source = new Stack<>();
        auxiliary = new Stack<>();
        destination = new Stack<>();
        this.numberOfDisks = disks;

        // Initialize the source peg with disks in decreasing order
        for (int i = numberOfDisks; i > 0; i--) {
            source.push(i);
        }
    }

    public void solve() {
        displayStacks();
        moveDisks(numberOfDisks, source, destination, auxiliary);
    }

    private void moveDisks(int n, Stack<Integer> src, Stack<Integer> dest, Stack<Integer> aux) {
        if (n > 0) {
            moveDisks(n - 1, src, aux, dest);
            dest.push(src.pop());
            System.out.println("\nMove disk " + n + " from peg " + getName(src) + " to peg " + getName(dest));
            displayStacks();
            moveDisks(n - 1, aux, dest, src);
        }
    }

    private String getName(Stack<Integer> stack) {
        if (stack == source) {
            return "Source";
        } else if (stack == destination) {
            return "Destination";
        } else {
            return "Auxiliary";
        }
    }

    private void displayStacks() {
        System.out.println();
        System.out.printf("%-15s %-15s %-15s\n", "Source", "Auxiliary", "Destination");
        for (int i = numberOfDisks-1; i >= 0; i--) {
            String srcDisk = (source.size() > i) ? Integer.toString(source.get(i)) : "|";
            String auxDisk = (auxiliary.size() > i) ? Integer.toString(auxiliary.get(i)) : "|";
            String destDisk = (destination.size() > i) ? Integer.toString(destination.get(i)) : "|";
            System.out.printf("   %-15s  %-15s  %-15s\n", srcDisk, auxDisk, destDisk);
        }
        System.out.println("--------------------------------------------");
        System.out.println("                   Stacks                   ");
        System.out.println("");
    }

    public static void main(String[] args) {
        TowerOfHanoi hanoi = new TowerOfHanoi(4);
        hanoi.solve();
    }
}
