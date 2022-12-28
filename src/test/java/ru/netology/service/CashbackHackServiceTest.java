package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test (description = "zero check")
    public void ServiceReturns1000Zero() {
        int actual = service.remain(0);
        Assert.assertEquals(actual, 1000);
    }

    @Test (description = "low bound check")
    public void ServiceReturns999() {
        int actual = service.remain(1);
        Assert.assertEquals(actual, 999);
    }

    @Test (description = "middle value check")
    public void ServiceReturns500() {
        int actual = service.remain(500);
        Assert.assertEquals(actual, 500);
    }

    @Test (description = "high bound check")
    public void ServiceReturns1000HighBound() {
        int actual = service.remain(1000);
        Assert.assertEquals(actual, 1000);
    }

    @Test (description = "hugh value check")
    public void ServiceReturns1000HughValue() {
        int actual = service.remain(100000000);
        Assert.assertEquals(actual, 1000);
    }

    }
