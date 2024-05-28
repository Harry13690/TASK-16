package task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_2 {

    static WebDriver driver;

    //Function to Launch the Chrome Browser
    private static void launchBrowser(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void main(String[] args) {
        //Launching the Chrome Browser and Passing the URL
        launchBrowser("https://www.demoblaze.com/");
        //Storing the Title to Compare
        String title = "STORE";
        //Getting the Title of the Page
        String gettitle = driver.getTitle();
        //Comparing the Both Strings whether its Equal or not
        if (title.equals(gettitle)){
            System.out.println("Page landed on current website");
        }else {
            System.out.println("Page not landed on current website");
        }
    }
}
