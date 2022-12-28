package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void ServiceReturns1000Zero() {
        int actual = service.remain(0);
        Assert.assertEquals(actual, 1000);
    }

    @Test
    public void ServiceReturns999() {
        int actual = service.remain(1);
        Assert.assertEquals(actual, 999);
    }

    @Test
    public void ServiceReturns500() {
        int actual = service.remain(500);
        Assert.assertEquals(actual, 500);
    }

    @Test
    public void ServiceReturns1000HighBound() {
        int actual = service.remain(1000);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void ServiceReturns1000HughValue() {
        int actual = service.remain(100000000);
        Assert.assertEquals(actual, 1000);
    }
}
