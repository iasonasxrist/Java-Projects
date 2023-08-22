package model.EnhancedList;


import java.util.Iterator;

class Node<T extends Comparable<T>> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;

    }
}

public class EnhancedList<T extends Comparable<T>> implements Iterable<T> {

    private Node<T> head;

    public EnhancedList() {
        this.head = null;
    }

    public void insert(T data) {
        Node<T> temp = new Node<>(data);

        if (this.head == null || data.compareTo(head.data) < 0) {
            temp.next = head;
            head = temp;
        } else {
            Node<T> current = head;
            while (current.next != null && data.compareTo(current.next.data) >= 0) {
                current = current.next;
            }
            temp.next = current.next;
            current = current.next;
        }
    }

    public void remove(T data) {

        if (head == null) {
            return;
        }
        if (head.data.compareTo(data) == 0) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        Node<T> prev = null;


        while (current != null && current.data.compareTo(data) != 0) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
        }
    }

    public void print() {
        Node<T> curr = head;

        while (curr != null) {

            System.out.println(curr);
            curr = curr.next;

        }
        System.out.println();

    }

    public void printAllInHierarchy(String className) {

        Node<T> current = head;
        while (current != null) {

            try {
                if (Class.forName(className).isInstance(current.data)) {
                    System.out.println(Class.forName(className));
                    System.out.print(current.data + " ");

                }

            } catch (Exception e) {
                System.out.println(e);
            }
            current = current.next;
        }


    }



    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
