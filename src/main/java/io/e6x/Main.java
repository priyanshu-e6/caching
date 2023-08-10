package io.e6x;


import java.util.*;

import static java.util.Collections.min;

public class Main {
    public static void main(String[] args) {

        //lru_cache implementation
        //cache hit. item present. remove item from queue bring to front of queue which represents most frequently used item
        //cache miss. item absent. put at end of queue representing least accessed item.
        //if cache full. remove from end of queue and put the new item at start.

        lru_cache lru = new lru_cache(4);
        lru.access(1);
        lru.access(2);
        lru.access(1);
        lru.access(3);



        }


    }
