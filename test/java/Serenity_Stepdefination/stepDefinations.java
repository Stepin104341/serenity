package Serenity_Stepdefination;

import Serenity_functions.functions;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class stepDefinations 
{
	@Steps
	functions f=new functions();
	@Given("I want to open the app")
	public void i_want_to_open_the_app() throws InterruptedException 
	{
	    f.setCapability();
	}

}
