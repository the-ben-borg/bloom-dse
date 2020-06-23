package MakeCar;

public class List {
    private Node head;
    private Node tail;

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    // To check if the list is empty:

    public boolean isEmpty(){
        return (head == null);
    }

    public void add(Node newNode){
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }
//  Get a certain node at a certain index:

    public Node get(int index){
        Node current = head;

        while(index > 0){
            current = current.getNext();
            index--;
        }

        return current;
    }

    // replace a node at a certain index with element
    // return the original node

    public Node set(int index, Node element){
        if(index == 0){
            Node temp = head;
            head = element;
            return temp;
        }
        Node current = head.getNext();
        Node previous = head;
        index--;

        while(index > 0){
            previous = current;
            current = current.getNext();
            index--;
        }

        Node temp = current;
        element.setNext(current.getNext());
        previous.setNext(element);
        return temp;
    }

    public boolean contains(String value){
        Node current = head;
        while(current != null){
            if(current.getValue().compareTo(value) == 0){
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    // remove a node at a given index:
    public Node remove(int index){
        if(index == 0){
            Node temp = head;
            head = head.getNext();
            return temp;
        }

        Node current = head.getNext();
        Node previous = head;
        index--;
        while (index > 0){
            previous = current;
            current = current.getNext();
            index--;
        }

        Node temp = current;
        previous.setNext(current.getNext());
        return temp;
    }

}
