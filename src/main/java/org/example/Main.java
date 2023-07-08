package org.example;

public class Main {
    public static void main(String[] args) {
        NodeList list = new NodeList();
        for (int i = 0; i < 10; i++) {
            int r = (int)(Math.random() * 10);
            Node node = new Node(r);
            if (i == 0) {
                list.head = node;
            } else {
                list.head.append(node);
            }
            list.last = node;
        }

        System.out.println(list.toString());
        System.out.println(list.reverse());

    }
}