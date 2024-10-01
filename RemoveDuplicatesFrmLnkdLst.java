package AlgorithmsLeetcode;

public class RemoveDuplicatesFrmLnkdLst {

    int size = 0;
    Node head = null;

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void addNode(int element){
        if(isEmpty()){
            head = new Node(element);
        } else {
            Node node = new Node(element);
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void removeDuplicate(){
        if(head == null){
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp != null && temp.next != null){
                if(temp.data == temp.next.data){
                    temp.next = temp.next.next;
                } else{
                    temp = temp.next;
                }
            }
        }
        printList();
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
        RemoveDuplicatesFrmLnkdLst lst = new RemoveDuplicatesFrmLnkdLst();
        lst.addNode(1);
        lst.addNode(1);
        lst.addNode(1);
        lst.addNode(2);
        lst.addNode(3);
        lst.addNode(3);
        lst.addNode(4);
        lst.addNode(4);
        lst.addNode(5);
        lst.addNode(5);
        lst.removeDuplicate();
    }
}
