package Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.junit.Test;

public class MathOperationsStepDefinitions {
    private WebDriver driver;
	@Given("a calculator")
	public void a_calculator() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\launa\\Desktop\\chromedriver.exe");
        try {
        	driver = new ChromeDriver();
		} catch (Exception e) {
			System.out.println("Attention le driver chromedriver n'est pas initialisé");
		}
		
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=calculatrice+enligne&rlz=1C1VDKB_frFR1002FR1002&oq=calculatrice+enligne&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQRRhAMg8IAhAAGAoYgwEYsQMYgAQyCQgDEAAYChiABDIJCAQQABgKGIAEMgkIBRAAGAoYgAQyCQgGEAAYChiABDIJCAcQABgKGIAE0gEINDc1OWowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
}
	@When("I add trois and cinq")
	public void i_add_trois_and_cinq() {
	try {
		 driver.findElement(By.cssSelector(" #L2AGLb > div")).click();
			
		} catch (Exception e) {
			System.out.println("L'élément n'a pas été trouvé : " + e.getMessage());
		}
	try {
		  driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(3) > .A2W7l > .XRsWPe")).click();
			
		} catch (Exception e) {
			System.out.println("L'élément n'a pas été trouvé : " + e.getMessage());
		}	
	try {
		driver.findElement(By.cssSelector("tr:nth-child(5) .mF5fo > .MEdqYd")).click();
				
		} catch (Exception e) {
				System.out.println("L'élément n'a pas été trouvé : " + e.getMessage());
			}	
	try {
		 driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
					
		} catch (Exception e) {
				System.out.println("L'élément n'a pas été trouvé : " + e.getMessage());
			}	
	try {

	    driver.findElement(By.cssSelector(".UUhRt")).click();
	    
					
		} catch (Exception e) {
				System.out.println("L'élément n'a pas été trouvé : " + e.getMessage());
			}   
	}
	@Then("the result should be huit")
	public void the_result_should_be_huit() {
		 //assertEquals(8,result);
		driver.findElement(By.cssSelector(".TIGsTb")).click();
	    assertThat(driver.findElement(By.id("cwos")).getText(), is("8"));
	    if (driver != null) {
            driver.quit();
	}
	
	    }
}
