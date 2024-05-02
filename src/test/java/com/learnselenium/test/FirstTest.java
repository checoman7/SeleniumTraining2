package com.learnselenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    @Test
    public void primerTest() throws InterruptedException {
        // Open website, tick radio boxes and close
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radio1 = driver.findElement(By.cssSelector("input.radioButton[value=radio1]"));
        WebElement radio2 = driver.findElement(By.cssSelector("input.radioButton[value=radio2]"));
        WebElement radio3 = driver.findElement(By.cssSelector("input.radioButton[value=radio3]"));
        radio1.click();
        Thread.sleep(1000);
        radio2.click();
        Thread.sleep(1000);
        radio3.click();
        Thread.sleep(1000);

        driver.quit();
    }

    @Test
    public void segundoTest() throws InterruptedException {
        // Open website, tick check boxes and close
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='option1']"));
        WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
        WebElement checkbox3 = driver.findElement(By.name("checkBoxOption3"));

        checkbox1.click();
        Thread.sleep(1000);
        checkbox2.click();
        Thread.sleep(1000);
        checkbox3.click();
        Thread.sleep(1000);

        driver.quit();
    }

    @Test
    public void tercerTest() {
        // Open website, type Mexico in the text box and close
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement typeCountries = driver.findElement(By.cssSelector("input[placeholder = \"Type to Select Countries\"]"));
        typeCountries.sendKeys("Mexico");
        typeCountries.clear();

        driver.quit();
    }

    @Test
    public void cuartoTest() {
        // Open website, print Title, Current URL and Source code and close
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }

    @Test
    public void quintoTest() throws InterruptedException {
        // Open website, select elements from dropdown box and close
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement dropDownBox = driver.findElement(By.cssSelector("select[id=dropdown-class-example]"));
        Select mydropdown = new Select(dropDownBox);
        mydropdown.selectByIndex(1);
        Thread.sleep(1000);
        mydropdown.selectByVisibleText("Option2");
        Thread.sleep(1000);
        mydropdown.selectByValue("option3");
        Thread.sleep(1000);

        driver.quit();
    }

    @Test
    public void sextoTest() {
        // Open website, do some validations on the radio boxes and close
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement radio1 = driver.findElement(By.cssSelector("input.radioButton[value=radio1]"));
        WebElement radio2 = driver.findElement(By.cssSelector("input.radioButton[value=radio2]"));

        radio1.click();
        System.out.println(radio1.isSelected());
        radio2.click();
        System.out.println(radio1.isSelected());

        // Expected result: true, then false

        driver.quit();
    }

}
