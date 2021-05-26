package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class CollectionTestSuite {

    private static int test=0;
    @BeforeEach
    public void before() {
        test++;
        System.out.println("Test case"+test+":begin");
    }
    @AfterEach
    public void afeter() {
        System.out.println("Test case"+test+": end");
    }

    @DisplayName( "When methode exrminate with empty list then method should return null" )
    @Test
    void testOddNumbersExterminatorEmptyList(){

        List<Integer> listaPusta = new ArrayList<>();
        listaPusta=null;
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result=oddNumbersExterminator.exterminate(listaPusta);
        //Then
        boolean zmienna1;

        if(result ==null)
            zmienna1=true;
        else
            zmienna1=false;

        Assertions.assertTrue(zmienna1);

    }

    @DisplayName( "When method exterminate with generate numbers method should return ArrayList with even numbers")
    @Test
    void testOddNumberExterminatorNormalList(){
        List<Integer> listaPusta = new ArrayList<>();
        Random generator = new Random();
        for(int i=0; i<1000;i++){
            listaPusta.add(generator.nextInt(99));
        }
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result=oddNumbersExterminator.exterminate(listaPusta);
        //Then
        boolean zmienna=true;
        for(int i =0;i<result.size();i++){
            if(result.get(i)%2!=0)
                zmienna =false;
            return;
        }
        Assertions.assertTrue(zmienna);

    }
}
