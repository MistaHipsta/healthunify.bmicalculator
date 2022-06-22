/*
package org.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    WebDriver driver;
    String test;
    String test2;
    String test3;
    String test4;
    String test5;
    String test6;

    @Test
    public void bmiCalculatorWeightEmptyData(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        test = driver.switchTo().alert().getText();
        Assert.assertEquals(test,"Enter the value for weight");
        driver.switchTo().alert().accept();
        driver.close();
    }

    @Test
    public void bmiCalculatorWeightValidData(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        test2 = driver.switchTo().alert().getText();
        Assert.assertEquals(test2,"Height should be taller than 33cms");
        driver.switchTo().alert().accept();
        driver.close();
    }

    @Test
    public void bmiCalculatorWeightLoverThanValid(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        test3 = driver.switchTo().alert().getText();
        Assert.assertEquals(test3,"Weight should be greater than 10kgs");
        driver.switchTo().alert().accept();
        driver.close();
    }

    @Test
    public void cmsNotValidData(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        test3 = driver.switchTo().alert().getText();
        Assert.assertEquals(test3,"Height should be taller than 33cms");
        driver.switchTo().alert().accept();
        driver.close();
    }

    @Test
    public void cmsValidDataSiUnits(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("33");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        test4 = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(test4,"101.01");
        driver.close();
    }

    @Test
    public void cmsValidDataUsUnits(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("33");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        test5 = driver.findElement(By.name("us")).getAttribute("value");
        Assert.assertEquals(test5,"102.71");
        driver.close();
    }

    @Test
    public void cmsValidDataUkUnits(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("33");
        driver.findElement(By.xpath("//input[@name='cc']")).click();
        test6 = driver.findElement(By.name("uk")).getAttribute("value");
        Assert.assertEquals(test6,"641.41");
        driver.close();
    }

}
*/
