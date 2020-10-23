package list;

import list.SinglyLinkedListIterator;
import list.Node;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }
    // Setters

    void setSize(int number) {
        this.size = number;
    }

    void setHead(Node node) {
        this.head = node;
    }

    void setTail(Node node) {
        this.tail = node;
    }

    // Getters
    public int getSize() {
        return this.size;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    ////////////////////////////////
    public Object get(int position) {
        try {
            Node currentNode = getHead();
            for (int i = 0; i < position; i++) {
                currentNode = currentNode.getNextNode();
            }
            return currentNode.getElement();
        } catch (Exception e) {
            return e;
        }
    }

    public void insertFirst(Object element) {
        Node toInsert = new Node(element, null);
        if (getSize() == 0) {
            setHead(toInsert);
            setTail(toInsert);
        } else {
            toInsert.setNextNode(getHead());
            setHead(toInsert);
        }
        setSize(getSize() + 1);
    }

    public void insertLast(Object element) {
        Node toInsert = new Node(element, null);
        if (getSize() == 0) {
            setHead(toInsert);
            setTail(toInsert);
        } else {
            getTail().setNextNode(toInsert);
            setTail(toInsert);
        }
        setSize(getSize() + 1);
    }

    public Object getFirst() {
        try {
            return getHead().getElement();
        } catch (Exception e) {
            return e;
        }
    }

    public Object getLast() {
        try {
            return getTail().getElement();
        } catch (Exception e) {
            return e;
        }
    }

    public void insert(Object element, int position) {
        try {
            if (position == 0) {
                insertFirst(element);
            } else if (position == getSize()) {
                insertLast(element);
            } else {
                Node node = getHead();
                for (int i = 0; i < position - 1; i++) {
                    node = node.getNextNode();
                }
                Node nextNode = node.getNextNode();
                Node toInsert = new Node(element, nextNode);
                node.setNextNode(toInsert);
            }
            setSize(getSize() + 1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // removeFirs()
    // removeLast()
    // remove(int position)

    public void makeEmpty() {
        setHead(null);
        setTail(null);
        setSize(0);
    }

    public SinglyLinkedListIterator iterator() {
        return new SinglyLinkedListIterator(this);
    }
}
