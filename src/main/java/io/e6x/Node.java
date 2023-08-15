package io.e6x;

public class Node<K,V> {
    K key;
    V value;
    Node<K, V> prev ;
    Node<K, V> next;
    public Node(K key, V value){
        this.value = value;
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}
