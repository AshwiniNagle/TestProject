import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com");
				WebElement emailID = driver.findElement(By.name("email"));
				emailID.sendKeys("abc@gail.com");
			    WebElement password = driver.findElement(By.name("pass"));
			    password.sendKeys("test@123");
			    WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"u_0_5_hC\"]"));
			    loginbtn.click();
				driver.close();
	}

}
