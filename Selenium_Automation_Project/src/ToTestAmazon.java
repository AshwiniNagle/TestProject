import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToTestAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
				driver.findElement(By.id("nav-search-submit-button")).click();
				driver.get("https://www.amazon.in/Apple-iPhone-14-128GB-Blue/dp/B0BDK62PDX/ref=sr_1_1_sspa?crid=MVDMCSF6NB7C&keywords=iphone&qid=1696408368&sprefix=iphone%2Caps%2C358&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				
	}

}
