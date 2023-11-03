package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class A09RediffMyBirthDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.partialLinkText("Acco")).click();
		WebElement dayList = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select dts = new Select(dayList);
		List<WebElement>dList = dts.getOptions();
		
		 dts.selectByIndex(1);
		 
		 
		 WebElement monthList = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
			Select mnth = new Select(monthList);
			List<WebElement>mList = mnth.getOptions();
			
			 mnth.selectByIndex(1);
			
			 
			 WebElement yearList = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
				Select year = new Select(yearList);
				List<WebElement>yList = year.getOptions();
				
				year.selectByIndex(24);
				
				System.out.println("My Birthdate is:"+ dts.getFirstSelectedOption().getText()+" " + mnth.getFirstSelectedOption().getText()+" "  + year.getFirstSelectedOption().getText());
	}

}
