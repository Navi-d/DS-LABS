package Lab6;

import java.util.Scanner;
import java.util.Stack;


public class TowerOfHanoi {
    static Stack<Disk> source;
    static Stack<Disk> auxiliary;
    static Stack<Disk> destination;
    static int disks;

    public static void main(String[] args) {
        source = new Stack<>();
        auxiliary = new Stack<>();
        destination = new Stack<>();

        // prompt users for number of disks
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disk(s): ");
        disks = scanner.nextInt();

        // swap D and A poles when number of disks is even
        if (disks % 2 == 0) {
            Stack<Disk> temp = destination;
            destination = auxiliary;
            auxiliary = temp;
        }

        // add disks to the source rod
        for (int i = disks; i > 0; i--) {
            source.push(new Disk(i));
        }

        // determine total number of moves required to get solution
        int moves = (int) Math.pow(2, disks) - 1;
        
        display();
        for (int i = 1; i <= moves; i++) {
            if (i % 3 == 1) { // S <-> D
                moveDisksBetween(source, destination);
            }
            else if (i % 3 == 2) { // S <-> A
                moveDisksBetween(source, auxiliary);
            }
            else if (i % 3 == 0) { // A <-> D
                moveDisksBetween(auxiliary, destination);
            }
            display();
        }
    }

    public static void moveDisksBetween(Stack<Disk> src, Stack<Disk> dest) {
        Disk srcPoleTopDisk = null;
        Disk destPoleTopDisk = null;

        if (!src.isEmpty()) {
            srcPoleTopDisk = src.pop();
        }
        if (!dest.isEmpty()) {
            destPoleTopDisk = dest.pop();
        }

        // source pole is empty
        if (srcPoleTopDisk == null) {
            src.push(destPoleTopDisk);
        }
        // destination pole is empty
        else if (destPoleTopDisk == null) {
            dest.push(srcPoleTopDisk);
        }
        // src pole top disk > dest pole top disk
        else if (srcPoleTopDisk.getSize() > destPoleTopDisk.getSize()) {
            // add the disk back to the original pole
            src.push(srcPoleTopDisk);
            // move from dest to src
            src.push(destPoleTopDisk);
        }
        // src pole top disk < dest pole top disk
        else {
            dest.push(destPoleTopDisk);
            dest.push(srcPoleTopDisk);
        }
    }

    public static void display() {
        System.out.println("Current State of Rods:");
        System.out.println("A: " + source);
        System.out.println("B: " + auxiliary);
        System.out.println("C: " + destination);
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }
    
}
