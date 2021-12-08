package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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
    public void shouldReturn300() {
        int actual = service.remain(700);
        int expected = 300;
        Assert.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnNullV2() {
        int actual = service.remain(1000);
        Assertions.assertEquals(0, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldReturn300v2() {
        int actual = service.remain(700);
        Assertions.assertEquals(300, actual);
    }

}