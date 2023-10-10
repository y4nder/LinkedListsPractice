public class MyLinkedList {
    private Node head;

    //insert (insert last)
    public void insert(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.getNext() != null){
                n = n.getNext();
            }
            n.setNext(node);
        }
    }

    //insert at start
    public void insertAtStart(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
        }
        else{
            node.setNext(head);
            head = node;
        }
    }

    //insert at index
    public void insertAtIndex(int index, int data){
        Node node = new Node(data);
        
        if(index == 0){
            insertAtStart(data);
            return;
        }

        Node n = head;
        for(int i = 0; i < index - 1; i++){
            n = n.getNext();
        }

        node.setNext(n.getNext());
        n.setNext(node);
    }

    //deleteFirst
    public void deleteFirst(){
        if(head == null){
            return;
        }

        head = head.getNext();
    }

    //delete at Index
    public void deleteIndex(int index){
        Node n = head;
        if(index == 0){
            deleteFirst();
        }

        for(int i = 0; i < index - 1; i++){
            if( (n = n.getNext()) == null ){
                System.out.println("index not found");
                return;
            }
        }

        n.setNext(n.getNext().getNext());
    }

    //show all data in linkedlist
    public void show(){
        if(head == null){
            return;
        }
        Node n = head;
        while(n.getNext()!=null){
            System.out.println(n.getData());
            n = n.getNext();
        }
        System.out.println(n.getData());
    }

}
