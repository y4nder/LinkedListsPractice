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

    //search methods
    public int search(int data){
        Node n = head;
        int i = 0;
        while(n.getData() != data){
            if( (n = n.getNext()) == null){
                return -1;
            }
            i++;
        }
        return i;
    }

    public void swap(int data1, int data2){
        //check if enough elements
        if(head == null || head.getNext() == null){
            System.out.println("not enough nodes");
            return;
        }

        //create 4 temp nodes
        Node node1, node2, prev1, prev2;
        node1 = node2 = prev1 = prev2 = null;

        //find the datas

        Node n = head;

        while( n != null){
            if( n.getData() == data1 ){
                node1 = n;
                break;
            }
            prev1 = n;
            n = n.getNext();
        }

        n = head;
        while( n != null){
            if( n.getData() == data2 ){
                node2 = n;
                break;
            }
            prev2 = n;
            n = n.getNext();
        }

        //check if datas were found
        if(node1 == null || node2 == null){
            System.out.println("some elements were not found");
            return;
        }

        //check if found elements were heads
        if(prev1 == null){
            head = node2;
        }
        else{
            prev1.setNext(node2);
        }

        if(prev2 == null){
            head = node1;
        }
        else{
            prev2.setNext(node1);
        }

        //swapping of memory addresses
        Node temp = node1.getNext();
        node1.setNext(node2.getNext());
        node2.setNext(temp);
    }

    public int getDataAtIndex(int index){
        if(head == null){
            return -1;
        }
        Node n = head;
        for( int i = 0; i < index; i++){
            if( (n = n.getNext() ) == null ){
                return -1;
            }
        }
        
        return n.getData();
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
