package stepDefinations;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Steps {
	static AppiumDriver<MobileElement> driver;
	@Given("^I want to open the app$")
	public void i_want_to_open_the_app() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid", "32003c5bca5656d5"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("appPackage", "com.eaton.brightlayerindustrial");
		caps.setCapability("appActivity", "com.eaton.brightlayerindustrial.MainActivity");
		caps.setCapability("noReset", "true");
       System.out.println("App Opened");
       Thread.sleep(3000);
      try 
       {
           driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
          
       } 
       catch (MalformedURLException e) 
       {
           System.out.println(e.getMessage());
       }
	
	}

	@Then("^I want to enter the (.*)$")
	public void i_want_to_enter_the_emailid(String emailid) throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Entering email id and password");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")).sendKeys(emailid);
		Thread.sleep(1000);
		
	}

	@And("^I want  enter the (.*)$")
	public void i_want_to_enter_the_password(String password) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n"
				+ "")).sendKeys(password);
	  
	}

	@And("^I want to click on login button$")
	public void i_want_to_click_on_login_button() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Button")).click();
		System.out.println("Login button clicked");

	}
	@And("^I want to remember credentials$")
	public void i_want_to_click_on_remember_button() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]")).click();
		System.out.println("remember the credentials tick");

	}
}
