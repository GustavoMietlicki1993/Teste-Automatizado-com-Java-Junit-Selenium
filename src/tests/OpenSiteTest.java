package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSiteTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gustavo.mietlicki\\Documents\\DEV\\TESTES\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		assertTrue("Valor incorreto", driver.getTitle().contentEquals("My Store"));
		WebElement searchbox = driver.findElement(By.id("searchbox"));
		searchbox.sendKeys("calça");
		Thread.sleep(5000);
	}

}
