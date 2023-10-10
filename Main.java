public class Main {
    public static void main(String[] args){
        MyLinkedList m = new MyLinkedList();

        m.insert(9);
        m.insert(1);
        m.insert(2);
        m.insert(3);
        m.insertAtStart(1);
        m.insertAtIndex(0, 5);
        m.show();
        m.deleteIndex(3);
        m.show();
    }
}
