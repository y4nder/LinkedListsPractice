package DoublyLinkedList;

public class ListNode {
    private int data;
    private ListNode previous;   
    private ListNode next;   

    public ListNode(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public ListNode getPrevious(){
        return previous;
    }

    public ListNode getNext(){
        return next;
    }
}
