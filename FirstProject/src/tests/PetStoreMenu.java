package tests;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;

import pages.PetStoreMenuPage;public class PetStoreMenu {

	private WebDriver driver;
	private Properties locators;
	private WebDriverWait waiter;

	@BeforeClass
	public void setup() throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.locators = new Properties();
		locators.load(new FileInputStream("config/petstore.properties"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void allLinksVerifyTest() {
		driver.navigate().to(this.locators.getProperty("store_menu_page_url"));
		PetStoreMenuPage petStoreMenuPage = new PetStoreMenuPage(driver, locators, waiter);
		Assert.assertTrue(petStoreMenuPage.allLinksVerify());
	}

	@Test(priority = 2)
	public void linksTakesToCorrectPageTest() {
		driver.navigate().to(this.locators.getProperty("store_menu_page_url"));
		PetStoreMenuPage petStoreMenuPage = new PetStoreMenuPage(driver, locators, waiter);
		Assert.assertTrue(petStoreMenuPage.allLinksWork());
	}

	@Test(priority = 3)
	public void logInBtnTest() {
		driver.navigate().to(this.locators.getProperty("store_menu_page_url"));
		PetStoreMenuPage petStoreMenuPage = new PetStoreMenuPage(driver, locators, waiter);
		Assert.assertTrue(petStoreMenuPage.toLogInPage());
	}

	@AfterClass
	public void afterClass() {
		this.driver.close();
	}

}