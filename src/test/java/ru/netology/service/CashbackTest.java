package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackTest {

    Cashback service = new Cashback();

    @Test
    public void shouldReturnNull() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn200() {
        int actual = service.remain(700);
        int expected = 300;
        Assert.assertEquals(expected,actual);
    }
}