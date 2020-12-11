package Serenity_functions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Step;

public class functions 
{
	static AppiumDriver<MobileElement> driver;
	@Step
	public void setCapability() throws InterruptedException
	{
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

}
