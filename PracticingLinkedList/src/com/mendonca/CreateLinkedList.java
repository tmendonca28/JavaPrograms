package com.mendonca;

import java.util.LinkedList;

public class CreateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        linkedList.addLast("Anthony");
        linkedList.addFirst("Juliet");

        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);
    }
}
