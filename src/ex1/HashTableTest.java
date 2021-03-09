package ex1;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @org.junit.jupiter.api.Test
    void count() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void put() {
        HashTable ht = new HashTable();
        ht.put("put1","1put");
        ht.put("put2","2put");
        ht.put(ht.getCollisionsForKey("put1"),"3put");
        ht.put(ht.getCollisionsForKey("put1"),"4put");
        ht.put("put2","5put");
        ht.put("put2","6put");
        ht.put("put2","7put");
        //ht.put("12345678","2put");
        ht.count();
        ht.size();
        ht.toString();
        Assertions.assertEquals(7,ht.count());
        Assertions.assertEquals(16,ht.size());
        Assertions.assertEquals("\n bucket[2] = [put1, 1put] -> [2, 3put] -> [2, 4put]\n bucket[3] = [put2, 2put]",ht.toString());
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void drop() {
    }
}