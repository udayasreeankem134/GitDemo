package stepDefinitions;

import java.util.Iterator;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class GreenKartStepDefinition {
public 	 WebDriver driver;
public String landingproductname;
public String offerProductname;
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
	  System.setProperty("webdriver.chrome.driver", "src//test//java//Driver//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	  driver.manage().window().maximize();
	}

	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(shortname);
		Thread.sleep(2000);
		 landingproductname = driver.findElement(By.cssSelector("h4.product-name")).getText().split("_")[0].trim();
		 driver.findElement(By.cssSelector("a.increment")).click();
	  System.out.println(landingproductname +" is extracted from home page");
	}

	@Then("user searched for {string} shortname in offers page")
	public void user_searched_for_shortname_in_offers_page(String shortname) {
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
		//driver.findElement(By.cssSelector("[alt='Cart']")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//driver.findElement(By.cssSelector("//button[contains(text(),'Place Order')]")).click();
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> t1 = s1.iterator();
		String Parentwindow = t1.next();
		String childwindow=  t1.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(shortname);
		
		//driver.findElement(By.cssSelector(".product-action > button")).click();
		offerProductname=driver.findElement(By.cssSelector("tr  td:nth-child(1)")).getText();
		//Assert.assertEquals(offerProductname, landingproductname);
		driver.quit();
	
	}


}
