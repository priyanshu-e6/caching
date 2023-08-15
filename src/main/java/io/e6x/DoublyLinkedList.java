package io.e6x;

import java.util.HashMap;

public class DoublyLinkedList<K,V> {
    Node<K,V> head;
    Node<K,V> tail;
    public DoublyLinkedList(){
        head = null;
        tail = null;
    }
    public void addFirst(K key, V value, HashMap<K, Node<K, V>> hashMap){
        Node<K,V> newNode = new Node<>(key, value);
        if (head==null){
            head = newNode;
            tail=  newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        if(!hashMap.containsKey(key)) {
            hashMap.put(key, newNode);
        }
    }

    public void remove(Node<K, V> n){
        if(n == head){
            head = head.next;
            head.prev = null;
        }
        else if(head == tail){
            tail = tail.prev;
            tail.next = null;
        }
        else{
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }

    }
}
