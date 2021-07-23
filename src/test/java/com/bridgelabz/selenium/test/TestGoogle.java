package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.ToolTip;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestGoogle extends BaseClass {
    @Test
    public void toolTipVerify() throws  InterruptedException {
        ToolTip verifyToolTip = new ToolTip(driver);

        // verifying title using tooltip
        String expectedTooltip = "Search";
        Assert.assertEquals(verifyToolTip.toolTipVerifyTitle(), expectedTooltip);
    }

    @Test
    public void toolTip() throws InterruptedException {
        ToolTip verifyToolTip=new ToolTip(driver);
        verifyToolTip.toolTipTitle();

        // verifying title using tooltip
        String expectedTooltip1="Search by voice";
        Assert.assertEquals(verifyToolTip.toolTipTitle(),expectedTooltip1);

    }
}
