import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class Solution {
 
    public static void main(String[] args) {
        /*
        MyQueue<Integer> queue = new MyQueue<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();// # of quieries

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }*/
         Queue<Integer> queue = new LinkedList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();// # of quieries

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.add(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.remove();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

