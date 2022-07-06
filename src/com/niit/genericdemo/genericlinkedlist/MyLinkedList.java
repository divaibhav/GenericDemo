package com.niit.genericdemo.genericlinkedlist;

public class MyLinkedList<E> {
    private Node<E> head;
    public void insert(E data){
        //create node
        //Node<E> node = new Node<E>(data);// till java 1.6 its required
        Node<E> node = new Node<>(data);
    }
}
