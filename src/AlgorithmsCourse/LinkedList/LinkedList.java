package AlgorithmsCourse.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    public Node head;

    public void appendToTail(int value){
        if(head==null){
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(value);
    }
    public void print(){
        if(head == null){
            System.out.println("END");
            return;
        }
        Node current = head;
        while (current.next != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println(current.value + " -> END");
    }
    public void deleteNode(int value){
        if(head.value==value){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null){
            if(current.next.value == value){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public void removeDuplicates(){
        Set<Integer> set = new HashSet<>();
        Node current = head;
        set.add(current.value);
        while(current.next != null){
            if(!set.add(current.next.value)){ // add function return false if the insert action was not possible
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }
    }
    public void removeDuplicateNoExtraMemory() {
        if(head == null){
            return;
        }
        Node current = head;
        while(current.next != null){
            current.next = removeFromPointer(current.next,current.value);
            current = current.next;

        }
    }
    public Node removeFromPointer(Node newHead, int duplicate){
        if(newHead.value == duplicate){
            return newHead.next;
        }
        Node current = newHead;
        while (current.next != null){
            if(current.next.value == duplicate){
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }
        return newHead;
    }
    public static Node mergeTwoLists(Node list1, Node list2){
        Node aux = new Node(-1);
        Node current = aux;
        while(list1!=null && list2!=null){
            if(list1.value <= list2.value){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1==null){
            appendList(current,list2);
        }else{
            appendList(current,list1);
        }
        return aux.next;
    }

    private static void appendList(Node current, Node list) {
        current.next = list;
    }
    public static Node nthNodeToLast(Node head, int n){
        Node current = head;
        Node pointer = head.next;
        while (pointer!=null){
            System.out.println("Current " + current.value);
            System.out.println("Pointer " + pointer.value);
            if(pointer.next == null){
                return current;
            }
            current = current.next;
            pointer = pointer.next;
        }
        return null;
    }
    public static Node addTwoNumbers(Node list1, Node list2){
        Node result = new Node(-1);
        Node current = result;
        int carry = 0;

        while(list1!=null || list2!=null){
            current.next = new Node(-1);
            current = current.next;
            int digit = carry;

            if(list1!=null){
                digit+=list1.value;
                list1=list1.next;
            }
            if(list2!=null){
                digit+=list2.value;
                list2=list2.next;
            }

            carry = digit / 10;
            digit = digit % 10;

            current.value = digit;
        }
        if(carry>0){
            current.next = new Node(carry);
        }
        return result.next;
    }
    public static Node swapNodesInPairsNewList(Node head){
        Node current = head;
        LinkedList list = new LinkedList();

        while(current != null ) {
            if(current.next != null){
                list.appendToTail(current.next.value);
                list.appendToTail(current.value);
                current = current.next.next;
                continue;
            }
            list.appendToTail(current.value);
            current = current.next;
        }
        return list.head;
    }
/*    public static Node swapNodesInPairs(Node head){
        Node startList = head;
        Node current = startList;

        while(current != null ) {
            if(current.next != null){
                Node temp = current.next.next;
                Node n = current.next;
                n.next = current;
                n.next.next = temp;
                current =

            }
        }
        return startList.next;
    }*/

}
