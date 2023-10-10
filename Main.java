public class Main {
    public static void main(String[] args){
        MyLinkedList m = new MyLinkedList();
        m.insert(1);
        m.insert(2);
        m.insert(3);
        m.deleteAtIndex(7);
        m.show();
    }
}
