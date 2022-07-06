package com.niit.genericdemo.genericlinkedlist;

public class Node <E>{
    private E data;// reference type or object
    private Node<E> next;

    //getter for data
    public E getData(){
        return data;
    }
    //setter for data
    public void setData(E data){
        this.data = data;
    }
    //getter for next
    public Node<E> getNext(){
        return next;
    }
    //setter for next
    public void setNext(Node<E> next){
        this.next = next;
    }
    //constructor
    public Node (E data){
        this.data = data;
    }


}
