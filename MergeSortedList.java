package AlgorithmsLeetcode;

public class MergeSortedList {

    int size = 0;
    Node head = null;
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void add(int val){
        if(isEmpty()){
            head = new Node(val);
        } else{
            Node newNode = new Node(val);
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void mergeSortList(MergeSortedList lst1, MergeSortedList lst2){
        Node temp1 = lst1.head;
        Node temp2 = lst2.head;
        Node newHead = new Node(-101);
        Node current = newHead;

        while(temp1 != null && temp2 != null){
            if(temp1.data <= temp2.data){
                current.next = temp1;
                temp1 = temp1.next;
            } else{
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }

        if(temp1 != null){
            current.next = temp1;
        } else{
            current.next = temp2;
        }

        newHead = newHead.next;
        while(newHead != null){
            System.out.print(newHead.data+", ");
            newHead = newHead.next;
        }
    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? ", " : ""));
            temp = temp.next;
        }
        System.out.println(); // New line after printing the list
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append(", ");
            }
            temp = temp.next;
        }
        sb.append(" ]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeSortedList lst1 = new MergeSortedList();
        MergeSortedList lst2 = new MergeSortedList();
        lst1.add(1);
        lst1.add(2);
        lst1.add(4);
        lst2.add(1);
        lst2.add(3);
        lst2.add(4);
        lst1.mergeSortList(lst1, lst2);

    }
}
