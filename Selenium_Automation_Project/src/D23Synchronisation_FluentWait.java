import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D23Synchronisation_FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions op = new EdgeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new EdgeDriver(op);
		//WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver);
		
		//From
		driver.findElement(By.id("src")).sendKeys("ako");
		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"homeV2-root\"]/div[1]/div[1]/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();
		//driver.findElement(By.xpath("//*[@id=\"homeV2-root\"]/div[1]/div[1]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		
		
		//To
		driver.findElement(By.id("dest")).sendKeys("pun");
		driver.findElement(By.xpath("//*[@id=\"homeV2-root\"]/div[1]/div[1]/div/div[3]/div[1]/ul/li[1]/div/text")).click();

		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[5]/span[1]")).click();
	
		
		//search
		driver.findElement(By.id("search_button")).click();
		//driver.close();
	
	


	}

}
