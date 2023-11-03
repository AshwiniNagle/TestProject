package com.ProjectInsurance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TC_02AutomobileGold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://sampleapp.tricentis.com/101/index.php#");
		
		//Enter Vehicle Data
				driver.findElement(By.partialLinkText("Auto")).click();
				Select make = new Select(driver.findElement(By.id("make")));
				make.selectByIndex(2);
				driver.findElement(By.id("engineperformance")).sendKeys("2000");
				driver.findElement(By.id("dateofmanufacture")).sendKeys("10/08/2022");
				
				Select seats = new Select(driver.findElement(By.id("numberofseats")));
				seats.selectByIndex(2);
				
				Select fuel = new Select(driver.findElement(By.id("fuel")));
				fuel.selectByIndex(1);
				
				driver.findElement(By.id("listprice")).sendKeys("2000");
				driver.findElement(By.id("licenseplatenumber")).sendKeys("MH42AM6168");
				driver.findElement(By.id("annualmileage")).sendKeys("2500");
				
				//Next Button
				driver.findElement(By.id("nextenterinsurantdata")).click();
				
		//Enter Insurant Data
				driver.findElement(By.id("firstname")).sendKeys("Akash");
				driver.findElement(By.id("lastname")).sendKeys("Deshmukh");
				driver.findElement(By.id("birthdate")).sendKeys("12/12/1996");
				
				WebElement gender = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[4]/p[1]/label[1]/span[1]"));
				gender.click();
				
				driver.findElement(By.id("streetaddress")).sendKeys("Bhigwa Road Baramati");
				
				Select country = new Select(driver.findElement(By.id("country")));
				country.selectByValue("India");
				
				driver.findElement(By.id("zipcode")).sendKeys("413102");
				driver.findElement(By.id("city")).sendKeys("Baramati");
				
				Select occu = new Select(driver.findElement(By.id("occupation")));
				occu.selectByValue("Employee");
				
				driver.findElement(By.xpath("//label[normalize-space()='Bungee Jumping']//span[@class='ideal-check']")).click();

				//Next Button
				driver.findElement(By.id("nextenterproductdata")).click();

		//Enter Product Data
				
				driver.findElement(By.id("startdate")).sendKeys("10/08/2023");
				
				Select insum = new Select(driver.findElement(By.id("insurancesum")));
				insum.selectByValue("3000000");
				
				Select mr = new Select(driver.findElement(By.id("meritrating")));
				mr.selectByValue("Bonus 2");
				
				Select dins = new Select(driver.findElement(By.id("damageinsurance")));
				dins.selectByValue("Partial Coverage");
				
				driver.findElement(By.xpath("//label[normalize-space()='Legal Defense Insurance']//span[@class='ideal-check']")).click();
				
				Select cc = new Select(driver.findElement(By.id("courtesycar")));
				cc.selectByValue("Yes");
				
				driver.findElement(By.id("nextselectpriceoption")).click();
				
		//Select Price Options
				
				String expPrice = "756.00",actPrice, expClaim= "Submit",actClaim, expDis = "2", actDis, expCover = "Limited", actCover;
				
				actPrice = driver.findElement(By.id("selectgold_price")).getText();
				actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]")).getText();
				actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]")).getText();
				actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")).getText();
				
				System.out.println("Checking Automobile -> Gold values");
				
				if(expPrice.equals(actPrice))
					System.out.println("Price Matching!!!");
				else
					System.out.println("Price Not Matching");
				if(expClaim.equals(actClaim))
					System.out.println("Online Claim Matching!!!");
				else
					System.out.println("Online Claim Not Matching");
				if(expDis.equals(actDis))
					System.out.println("Discount Match");
				else
					System.out.println("Discount Not Match");
				if(expCover.equals(actCover))
					System.out.println("Cover Match");
				else
					System.out.println("Cover not match");
				
				WebElement opt = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[2]/span[1]"));
				opt.click();
				
				driver.findElement(By.id("nextsendquote")).click();
				
		//Send Quote
				
				driver.findElement(By.id("email")).sendKeys("akdeshmuk12@gmail.com");
				driver.findElement(By.id("phone")).sendKeys("9865325147");
				driver.findElement(By.id("username")).sendKeys("Akash12");
				driver.findElement(By.id("password")).sendKeys("Test@123");
				driver.findElement(By.id("confirmpassword")).sendKeys("Test@123");
				
				driver.findElement(By.id("sendemail")).click();
				
				String Text = driver.findElement(By.xpath("//h2[normalize-space()='Sending e-mail success!']")).getText();
				System.out.println("Txt :"+Text);
				
				driver.findElement(By.xpath("//button[@class='confirm']")).click();
				
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[8]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();


	}

}
