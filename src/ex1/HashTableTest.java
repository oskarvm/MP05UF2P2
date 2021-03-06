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
        ht.put("2","3put");
        ht.put("02","4put");
        ht.put("put1","5put");

        // ht.put(ht.getCollisionsForKey("put1"),"5put");
        //ht.getCollisionsForKey("put1",2);
        //ht.put(ht.getCollisionsForKey("put1"),"3put");

        ht.count();
        ht.size();
        ht.toString();
        Assertions.assertEquals(5,ht.count());
        Assertions.assertEquals(16,ht.size());
        Assertions.assertEquals("\n bucket[2] = [put1, 1put] -> [2, 3put] -> [02, 4put] -> [put1, 5put]\n bucket[3] = [put2, 2put]",ht.toString());
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void drop() {
        HashTable ht = new HashTable();

        ht.put("put1","1put");
        ht.put("put2","2put");
        ht.put("2","3put");
        ht.put("02","4put");

        ht.drop("put1");
        ht.drop("2");
        //ht.put(ht.getCollisionsForKey("put1"),"5put");
        //ht.getCollisionsForKey("put1",2);
        //ht.put(ht.getCollisionsForKey("put1"),"3put");
        ht.count();
        ht.size();
        ht.toString();
        Assertions.assertEquals(2,ht.count());
        Assertions.assertEquals(16,ht.size());
        Assertions.assertEquals("\n bucket[2] = [put1, 1put] -> [2, 3put] -> [2, 4put]\n bucket[3] = [put2, 2put]",ht.toString());
    }
}