package task_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_3 {

    static WebDriver driver;

    //Function to Launch the Chrome Browser
    private static void launchBrowser(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void main(String[] args) {
        //Launching the Chrome Browser and Passing the URL
        launchBrowser("https://www.wikipedia.org/");
        //Finding the Locator of thr Search Box and Inserting the Data
        driver.findElement(By.xpath("//input[@id=\"searchInput\"]")).sendKeys("Artifical Intelligence");
        //Finding the Locator of the Search Button and Clicking it
        driver.findElement(By.xpath("//i[@class=\"sprite svg-search-icon\"]")).click();
        //Finding the Locator of the "History" Content and Clicking it
        driver.findElement(By.xpath("(//div[@class=\"vector-toc-text\"])[42]")).click();
        //Finding the Locator of the Topic of the Content and Getting the Text from it
        String text = driver.findElement(By.xpath("//span[@id=\"History\"]")).getText();
        //Printing the Text
        System.out.println(text);
    }
}
