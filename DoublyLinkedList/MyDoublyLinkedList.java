package DoublyLinkedList;

public class MyDoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public MyDoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int getLength(){
        return length;
    }
}
