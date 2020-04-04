package pages;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
	private WebDriver driver;
	private Properties locators;
	private WebDriverWait waiter;

	public HomePage(WebDriver driver, Properties locators, WebDriverWait waiter) {
		this.driver = driver;
		this.locators = locators;
		this.waiter = waiter;
	}

	public WebElement getEnterStoreLink() {
		return this.driver.findElement(By.xpath(this.locators.getProperty("enter_the_store")));
	}

	public void setEnterStoreLink() {
		this.getEnterStoreLink().click();
	}

	public WebElement getSignIn() {
		return this.driver.findElement(By.xpath(this.locators.getProperty("menu_page_sign_in")));
	}

	public boolean isInShop() {
		boolean inShop = false;
		if (getSignIn().getText().contains("Sign In")) {
			inShop = true;
		}
		return inShop;
	}
}
