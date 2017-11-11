/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head==null) return false;

    while(head!=head.next){
    if (head.next==null||head.next.next==null){
        return false;
      }
        head=head.next;
        head.next=head.next.next;
    }
    return true;
    }

