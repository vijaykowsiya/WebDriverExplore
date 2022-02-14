package expwebdrvjava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrderDemo {

	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {

		System.out.println("beforeMethod is Executed");
	}

	@Test (groups="Progression")
	public void f() {
		System.out.println("@Test is Executed");
	}

	@AfterMethod (alwaysRun = true)
	public void afterMethod() {

		System.out.println("afterMethod is Executed");
	}

	@BeforeClass (alwaysRun = true)
	public void beforeClass() {

		System.out.println("beforeClass is Executed");
	}

	@AfterClass (alwaysRun = true)
	public void afterClass() {

		System.out.println("afterClass is Executed");
	}

	@BeforeTest (alwaysRun = true)
	public void beforeTest() {

		System.out.println("beforeTest is Executed");
	}

	@AfterTest (alwaysRun = true)
	public void afterTest() {

		System.out.println("afterTest is Executed");
	}

	@AfterSuite (alwaysRun = true)
	public void afterSuite() {

		System.out.println("afterSuite is Executed");
	}

	@BeforeGroups (alwaysRun = true)
	public void beforeGroups() {

		System.out.println("beforeGroups is Executed");
	}

	@AfterGroups (alwaysRun = true)
	public void afterGroups() {

		System.out.println("afterGroups is Executed");
	}

	@BeforeSuite (alwaysRun = true)
	public void beforeSuite() {

		System.out.println("beforeSuite is Executed");
	}

}
