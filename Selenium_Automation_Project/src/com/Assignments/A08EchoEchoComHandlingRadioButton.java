package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A08EchoEchoComHandlingRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:/selenium jar files/edgedriver114/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/");
		driver.findElement(By.partialLinkText("Tutorials")).click();
		driver.findElement(By.partialLinkText("HTML")).click();
		driver.findElement(By.partialLinkText("HTML FORMS")).click();
		driver.findElement(By.partialLinkText("RADIO BUTTON")).click();
	
		WebElement MilkBtn = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+MilkBtn.isDisplayed());
		System.out.println("Enabled:"+MilkBtn.isEnabled());
		System.out.println("Selected:"+MilkBtn.isSelected());
		if(MilkBtn.isSelected()==false)
			MilkBtn.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+MilkBtn.isDisplayed());
		System.out.println("Enabled:"+MilkBtn.isEnabled());
		System.out.println("Selected:"+MilkBtn.isSelected());
		
		
		
		WebElement ButterBtn = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[2]"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+ButterBtn.isDisplayed());
		System.out.println("Enabled:"+ButterBtn.isEnabled());
		System.out.println("Selected:"+ButterBtn.isSelected());
		if(ButterBtn.isSelected()==false)
			ButterBtn.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+ButterBtn.isDisplayed());
		System.out.println("Enabled:"+ButterBtn.isEnabled());
		System.out.println("Selected:"+ButterBtn.isSelected());
		
		
		WebElement CheeseBtn = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+CheeseBtn.isDisplayed());
		System.out.println("Enabled:"+CheeseBtn.isEnabled());
		System.out.println("Selected:"+CheeseBtn.isSelected());
		if(CheeseBtn.isSelected()==false)
			CheeseBtn.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+CheeseBtn.isDisplayed());
		System.out.println("Enabled:"+CheeseBtn.isEnabled());
		System.out.println("Selected:"+CheeseBtn.isSelected());
		
		
		WebElement WaterBtn = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[4]"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+WaterBtn.isDisplayed());
		System.out.println("Enabled:"+WaterBtn.isEnabled());
		System.out.println("Selected:"+WaterBtn.isSelected());
		if(WaterBtn.isSelected()==false)
			WaterBtn.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+WaterBtn.isDisplayed());
		System.out.println("Enabled:"+WaterBtn.isEnabled());
		System.out.println("Selected:"+WaterBtn.isSelected());
		
		WebElement BeerBtn = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[5]"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+BeerBtn.isDisplayed());
		System.out.println("Enabled:"+BeerBtn.isEnabled());
		System.out.println("Selected:"+BeerBtn.isSelected());
		if(BeerBtn.isSelected()==false)
			BeerBtn.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+BeerBtn.isDisplayed());
		System.out.println("Enabled:"+BeerBtn.isEnabled());
		System.out.println("Selected:"+BeerBtn.isSelected());
		
		WebElement WineBtn = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[6]"));
		System.out.println("Before Clicking");
		System.out.println("Visible:"+WineBtn.isDisplayed());
		System.out.println("Enabled:"+WineBtn.isEnabled());
		System.out.println("Selected:"+WineBtn.isSelected());
		if(WineBtn.isSelected()==false)
			WineBtn.click();
		System.out.println("After Clicking");
		System.out.println("Visible:"+WineBtn.isDisplayed());
		System.out.println("Enabled:"+WineBtn.isEnabled());
		System.out.println("Selected:"+WineBtn.isSelected());
	}

}
