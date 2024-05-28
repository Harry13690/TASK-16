package task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question_1 {

    static WebDriver driver;

    //Function to Launch the Firefox Browser
    private static void launchBrowser(String url){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void main(String[] args) {
        //Launching the FireFox Browser and Passing the URL
        launchBrowser("https://google.com");

        //Printing the Current URL of the Page
        System.out.println(driver.getCurrentUrl());

        //Refreshing the Current Page
        driver.navigate().refresh();

        //Closing the Firefox Browser
        driver.close();
    }
}
