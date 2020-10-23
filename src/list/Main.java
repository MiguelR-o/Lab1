package list;

import list.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println(list.getHead());

        addMems(list);
        visList(list);

    }

    public static void addMems(SinglyLinkedList list) {

        for (int i = 0; i < 3; i++) {
            list.insertFirst("cringe" + i);

        }
    }

    public static void visList(SinglyLinkedList list) {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.printf("%s \n", list.get(i));
        }
    }
}
