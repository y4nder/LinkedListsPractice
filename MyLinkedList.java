public class MyLinkedList {
    private Node head;

    //insert
    public void insert(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        Node n = head;
        while(n.getNext()!=null){
            n = n.getNext();
        }
        n.setNext(node);
    }

    //insertAtStart
    public void insertAtStart(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.setNext(head);
        head = node;
    }

    //insertAtIndex
    public void insertAtIndex(int index, int data){
        Node node = new Node(data);

        if(index == 0){
            insertAtStart(data);
            return;
        }

        Node n = head;
        for(int i = 0; i < index - 1; i++){
            if( (n = n.getNext()) == null ){
                return;
            }  
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
    //deletelast
    public void deleteLast(){
        if(head == null){
            return;
        }

        if(head.getNext() == null){
            deleteFirst();
            return;
        }

        Node n = head;
        while(n.getNext().getNext()!=null){
            n = n.getNext();
        }
        n.setNext(null);;
    }
    //deleteAtIndex
    public void deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
            return;
        }

        Node n = head;

        for(int i = 0; i < index - 1; i++){
            if( (n = n.getNext()) == null){
                return;
            }
        }
        n.setNext(n.getNext().getNext());
    }

    //show
    public void show(){
        if(head == null){
            return;
        }

        Node n = head;
        while(n.getNext()!=null){
            System.out.print(n.getData() + " ");
            n = n.getNext();
        }
        System.out.println(n.getData());
    }

}
