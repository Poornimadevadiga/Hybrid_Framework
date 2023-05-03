package testscript;

import org.testng.annotations.Test;

import generic.FetchTheData;
import generic.GenericClass;
import pom.Pom;

public class LoginScript extends GenericClass
{
	@Test
	public void test()
	{
		String user = FetchTheData.getData("Sheet1", 0, 0);
		String passw = FetchTheData.getData("Sheet1", 0, 1);
		Pom p=new Pom(driver);
		p.username1(user);
		p.password1(passw);
		p.login();
	
	
	
	
	
	
	
	
	}
}

