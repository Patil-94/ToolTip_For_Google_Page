package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.BrokenLink;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Broken_Link_Test extends BaseClass {


    @Test
    public void broken_Link() throws IOException {
    BrokenLink brokenLink = new BrokenLink(driver);
    String actual = brokenLink.broken_link();
    System.out.println(actual);
    String expected = "https://www.google.com/";
    Assert.assertEquals(actual,expected);
    System.out.println("Broken links have been founded successfully!");

}
}
