package com.github.zipcodewilmington;

public class Node {
    String value;

    String key;
    Node next;

    public Node (String key, String value){
        this.value = value;
        this.key = key;
        this.next = null;
    }


    public String getData() {
        return value;
    }

    public void setData(String data) {
        this.value = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }





}
