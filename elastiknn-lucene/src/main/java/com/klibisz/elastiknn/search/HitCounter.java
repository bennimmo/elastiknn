package com.klibisz.elastiknn.search;

/**
 * Abstraction for counting hits for a particular query.
 */
public interface HitCounter {

    void increment(int key, short count);

    void increment(int key, int count);

    boolean isEmpty();

    short get(int key);

    int numHits();

    KthGreatest.Result kthGreatest(int k);

    interface Iterator {
        void advance();
        boolean hasNext();
        int docID();
        int count();
    }

    Iterator iterator();
}
