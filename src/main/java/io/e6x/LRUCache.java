package io.e6x;

import java.util.HashMap;
import java.util.NoSuchElementException;


public class LRUCache<K,V> {
    private DoublyLinkedList<K, V> cache;
    private HashMap<K, Node<K, V>> hashMap;
    private int size;
    public LRUCache(int size){
        this.cache = new DoublyLinkedList<>();
        this.hashMap = new HashMap<>(size);
        this.size = size;
    }
    public V get(K key) {
        if (hashMap.containsKey(key)){
            Node<K, V> node = hashMap.get(key);
            cache.remove(node);
            cache.addFirst(node.key, node.value, hashMap);
            return (node.value);
        } else {
            return null;
        }
    }
    public void remove(K key){
        if(hashMap.containsKey(key)){
            cache.remove(hashMap.get(key));
            hashMap.remove(key);
        }
        else{
            throw new NoSuchElementException("Key " + key + " not found in the hashmap");
        }
    }
    public void put(K key, V value){
        if(hashMap.containsKey(key)){
            cache.remove(hashMap.get(key));
            cache.addFirst(key, value, hashMap);
        }
        else{
            cache.addFirst(key, value, hashMap);
        }
    }


}
