package edu.eci.tacs.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumWebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        WebElement inputWiki = driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
        inputWiki.click();
        inputWiki.sendKeys("universidad demo");

        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();

        String resultBusqueda = driver.findElement(By.xpath("//h1[@id='firstHeading']")).getText();
        System.out.println(resultBusqueda);

        driver.close();

    }
}
