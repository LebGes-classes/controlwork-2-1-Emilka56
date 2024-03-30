package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.naming.SizeLimitExceededException;
public class ArraylistTest {
    List list;
    int capacity;
    @Test
    void add() {
        list.add(12);
        list.add(12);
        list.add(12);
        Assertions.assertEquals(12, list.findByIndex(0));
    }
    //честно у меня ничего не получается я нулина

}
