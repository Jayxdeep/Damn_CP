class Node {
    int data;
    Node next;
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class L {
    private static Node LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    //length of ll
    private static int lenLL(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
    
    //search in LL
    private static int search(Node head,int val){
        Node temp=head;
        while(temp.data==val){
            return 1;
        }
        return 0;    
    }
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data+ " ");
            head=head.next;
        }
        System.out.println();
    }
    //delete of head
    private static Node remoHead(Node head){
        if(head==null) return head;
        head=head.next;
        return head;
    }
    //delete tail
    private static Node remoTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){ //if the null not found the temp changes to next ele
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = LL(arr);
        head= remoTail(head);
        print(head);     
    }
}
