package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomArrayListTest {
   
    @Test
    public void should_add_one_item_to_list(){
        CustomList<Integer> sut = new CustomArrayList<>();

        sut.add(1);
        Integer expectedResult = sut.get(0);
        Integer expectedSize = sut.getSize();

        assertEquals(1, expectedResult);
        assertEquals(1, expectedSize);
    }

    @Test
    public void should_add_40_items_to_list(){
        CustomList<Integer> sut = new CustomArrayList<>();

        for (int i = 1; i < 41; i++){
            sut.add(i);
        }

        for (int i = 0; i < 40; i++){
            assertEquals(i+1, sut.get(i));
        }
        assertEquals(40, sut.getSize());
    }

    @Test
    public void should_add_item_to_index_3(){
        CustomList<Integer> sut = new CustomArrayList<>();

        for (int i = 1; i < 6; i++){
            sut.add(i);
        }

        sut.add(3, 10);

        Integer expectedResult = sut.get(3);

        assertEquals(10, expectedResult);
    }

    @Test
    public void should_add_to_full_list (){
    CustomList<Integer> sut = new CustomArrayList<>();

    for (int i = 1; i < 11; i++){
        sut.add(i);
    }

    sut.add(3, 10);

    Integer expectedResult = sut.get(3);
    Integer expectedLength = sut.getSize();

    assertEquals(10, expectedResult);
    assertEquals(11, expectedLength);
        
    }
    
}
