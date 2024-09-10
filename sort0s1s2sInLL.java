package AlgorithmsLeetcode;

public class sort0s1s2sInLL {

    int size = 0;
    Node head = null;
    public static class Node{
        int val;
        Node next;
        public Node(){}
        public Node(int val){
            this.val = val;
            next = null;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void add(int element){
        if(isEmpty()){
            head = new Node(element);
        } else{
            Node newNode = new Node(element);
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.val);
            if (temp.next != null) {
                sb.append(", ");
            }
            temp = temp.next;
        }
        sb.append(" ]");
        return sb.toString();
    }

    public void sortSubsequent(sort0s1s2sInLL list){
        Node zeroH = new Node(0);
        Node zero = zeroH;
        Node oneH = new Node(0);
        Node one = oneH;
        Node twoH = new Node(0);
        Node two = twoH;
        Node temp = head;

        int zeroCount = 0, oneCount = 0, twoCount = 0;
        while(temp != null){
            if(temp.val == 0){
                zero.next = temp;
                zero = zero.next;
            } else if (temp.val == 1) {
                one.next = temp;
                one = one.next;
            } else{
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
//        Node newTemp = head;
//        while(newTemp != null){
//            System.out.print(newTemp.val+", ");
//            newTemp = newTemp.next;
//        }
//        System.out.println();
        zero.next = (oneH.next != null) ? oneH.next : twoH.next;
        one.next = twoH.next;
        two.next = null;
        head = zeroH.next;
        Node newHead = head;
        while(newHead != null){
            System.out.print(newHead.val+", ");
            newHead = newHead.next;
        }
    }

    public static void main(String[] args) {
        sort0s1s2sInLL lst = new sort0s1s2sInLL();
        lst.add(0);
        lst.add(1);
        lst.add(0);
        lst.add(2);
        lst.add(1);
        lst.add(2);
        lst.add(1);
        lst.add(0);
        lst.sortSubsequent(lst);
    }
}
