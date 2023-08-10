package io.e6x;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class lru_cache {
    private Deque<Integer> cache;
    private HashSet<Integer> itemsPresent;
    private int size;
    public lru_cache(int size){
        this.cache = new LinkedList<>();
        this.itemsPresent = new HashSet<>();
        this.size = size;
    }
    public void access(int value){
        if(!itemsPresent.contains(value)){
            if(cache.size() == size){
                int removedVal = cache.removeLast();
                itemsPresent.remove(removedVal);
            }
        }
        else{
            cache.remove(value);
        }
        cache.addFirst(value);
        itemsPresent.add(value);
    }
}
