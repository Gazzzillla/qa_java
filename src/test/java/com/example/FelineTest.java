package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();

        List<String> actualFood = feline.eatMeat();

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyReturnsFeline() {
        Feline feline = new Feline();

        String actualFamily = feline.getFamily();

        Assert.assertEquals("Кошачьи", actualFamily);
    }

    @Test
    public void getKittensWithoutParameterReturnsOne() {
        Feline feline = new Feline();

        int actualKittens = feline.getKittens();

        Assert.assertEquals(1, actualKittens);
    }

    @Test
    public void getKittensWithParameterReturnsGivenCount() {
        Feline feline = new Feline();

        int actualKittens = feline.getKittens(5);

        Assert.assertEquals(5, actualKittens);
    }
}