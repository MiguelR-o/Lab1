package list;

public class Node {
    private Object element;
    private Node nextNode;

    Node(Object element, Node nextNode) {
        this.nextNode = nextNode;
        this.element = element;
    }

    void setNextNode(Node node) {
        this.nextNode = node;
    }

    Node getNextNode() {
        return this.nextNode;
    }

    Object getElement() {
        return this.element;
    }
}
