package expwebdrvjava;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test(priority = -1)
	public void gmailLogIn()
	{
		System.out.println(10/2);
	}
	
	@Test(priority = 0, dependsOnMethods = "gmailLogIn")
	
	public void composeEmail()
	{
		System.out.println("composeEmail is PASS");
	}
	
	@Test (priority = 1 , groups="Progression")
	public void sentItems()
	{
		System.out.println("sentItems is PASS");
	}
	
	@Test (priority = 2 )
	public void gmailInbox()
	{
		System.out.println("gmailInbox is PASS");
	}
	
	@Test (priority = 3 )
	public void gmailDraft()
	{
		System.out.println("gmailDraft is PASS");
	}
	@Test (priority = 3 )
	public void gmailLogOut()
	{
		System.out.println("gmailLogOut is PASS");
	}
}
