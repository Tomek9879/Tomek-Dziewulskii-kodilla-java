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

    @DisplayName( "When method exterminate with sample Array of numbers, method should return ArrayList with even numbers")
    @Test
    void testOddNumberExterminatorNormalList(){
        List<Integer> listaLiczb = new ArrayList<>();

        listaLiczb.add(10);
        listaLiczb.add(9);
        listaLiczb.add(6);
        listaLiczb.add(5);
        listaLiczb.add(3);

        List<Integer>listaLiczbParzystych = new ArrayList<>();
        listaLiczbParzystych.add(10);
        listaLiczbParzystych.add(6);

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result=oddNumbersExterminator.exterminate(listaLiczbParzystych);
        System.out.println(result);
        System.out.println(listaLiczbParzystych);
        boolean zmienna=listaLiczbParzystych.equals(result);
        //Then
        Assertions.assertTrue(zmienna);


    }
}
