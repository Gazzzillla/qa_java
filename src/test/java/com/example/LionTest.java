package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensReturnsFelineKittens() throws Exception {
        when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);

        int actualKittens = lion.getKittens();

        Assert.assertEquals(1, actualKittens);
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Lion lion = new Lion("Самец", feline);

        List<String> actualFood = lion.getFood();

        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test(expected = Exception.class)
    public void constructorWithInvalidSexThrowsException() throws Exception {
        new Lion("Неизвестно", feline);
    }
}