package SetupClass.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class sli_search extends Set{
	
	WebDriverWait wait = new WebDriverWait(driver,50);


	@Given("^Open the website URL\\.$")
	public void open_the_website_URL() throws Throwable {
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1200);
	}

	@Then("^enter a keyword to search\\.$")
	public void enter_a_keyword_to_search() throws Throwable {
		
		driver.get("https://www.slideteam.net/");
		Thread.sleep(3000);
		  WebElement search_btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("search")));
		  Thread.sleep(2000);
		  search_btn.sendKeys("HR"); 
		  Thread.sleep(4000);
		  
		  
		  
		  WebElement search_1 =wait.until(ExpectedConditions.elementToBeClickable(By.id("sli_ac_section_products"))); 
		  Thread.sleep(2000); 
		  String text1=search_1.getText(); 
		  System.out.println(text1); 
		  Thread.sleep(3000);
		  
		  String actual_text1="Product Suggestions for Hr Interview ";
		  
		  if(text1.equalsIgnoreCase(actual_text1)) {
		  log.info("product suggestion tab header is displayed correctly "); }
		  
		  WebElement prod_sugg =wait.until(ExpectedConditions.elementToBeClickable(By.id("sli_raclist_products"))); 
		  Thread.sleep(2000); 
		  String pro_sugg_loc=prod_sugg.getText();
		  System.out.println("product suggestion list name is ----"+pro_sugg_loc);
		  
		  WebElement parent_product =wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list"))); 
		  Thread.sleep(2000);
		  System.out.println("classname  of parent is ----------------------->"+parent_product);
		  
		  WebElement child1_product = wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_product"))); 
		  Thread.sleep(1000); 
		  child1_product.click();
		  Thread.sleep(2500);
		  
		  WebElement download_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'][contains(.,'Download this presentation')]"))); 
		  Thread.sleep(1500); 
		  download_ppt.click(); 
		   Thread.sleep(2000);
		  
		  driver.navigate().refresh(); Thread.sleep(3800);
		  
		  WebElement old_paid_email = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		  old_paid_email.sendKeys("himanshi.sharma@slidetech.in");
		  
		  WebElement old_paid_pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		  old_paid_pass.sendKeys("123456");
		  
		  WebElement old_paid_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.login > span:nth-child(1)")));
		  old_paid_login_btn.click();
		  
		  
		  WebElement download_ppt1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'][contains(.,'Download this presentation')]"))); 
		  Thread.sleep(1500); 
		  download_ppt1.click(); 
		  Thread.sleep(2000);
		  
		  driver.navigate().refresh(); 
		  Thread.sleep(5000);
		 
		driver.get("https://www.slidegeeks.com");
		
		Thread.sleep(5400);
		
		WebElement gk_search_btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("search-input")));
		Thread.sleep(2000);
		gk_search_btn.sendKeys("hr");
		Thread.sleep(4000);
		
		 WebElement g_search_1 =wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sli_autocomplete > div > div.sli_ac_products > h4"))); 
		 Thread.sleep(2000); 
		 String g_text1=g_search_1.getText(); 
		 System.out.println(g_text1); 
		 Thread.sleep(3000);
		 
		 WebElement g_search =wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_product"))); 
		 Thread.sleep(2000); 
		 g_search.click();
		 Thread.sleep(6300);
		 
		 
		 WebElement geek_download_1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(.,'Download this Presentation')])[2]"))); 
		 Thread.sleep(2700);
		 geek_download_1.click();
		 Thread.sleep(2200);
		 
		 WebElement login_email = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-login-form-username > input:nth-child(1)")));
		 Thread.sleep(3000);
		 login_email.sendKeys("himanshi.sharma+pgeeks@slidetech.in");
		 Thread.sleep(3000);
		 
		 WebElement login_password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.pg-login-form-password > input:nth-child(1)")));
		 Thread.sleep(3000);
		login_password.sendKeys("123456");
		 Thread.sleep(3000);
		 
		 WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-button-login")));
		 Thread.sleep(3000);
		 login_btn.click();
		 Thread.sleep(3000);
		 
		 
		 WebElement geek_download_12 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(.,'Download this Presentation')])[2]"))); 
		 Thread.sleep(2700);
		 geek_download_12.click();
		 Thread.sleep(2200);
		
	}
	


	
}
