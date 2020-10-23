package list;

import list.SinglyLinkedList;
import list.Node;

public class SinglyLinkedListIterator {
    private SinglyLinkedList list;
    private Node position;

    SinglyLinkedListIterator(SinglyLinkedList list) {
        this.list = list;
        this.position = null;
        rewind();
    }

    public boolean hasNext() {
        return this.position == null;
    }

    public Object next() {
        if (hasNext()) {
            Object ele = this.position.getElement();
            this.position = this.position.getNextNode();
            return ele;
        }
    }

    public void rewind() {
        if (this.list.getSize() == 0) {
            this.position = null;
        } else {
            this.position = this.list.getHead();
        }
    }
}
