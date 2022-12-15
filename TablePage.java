package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.ExcelUtility;

public class TablePage {
	WebDriver driver;
	By tableRow=By.xpath("//tr[@class='odd'or@class='even']");
	public TablePage(WebDriver driver) {
		this.driver=driver;
	}
	public void getRow() throws IOException {
		ExcelUtility obj=new ExcelUtility();
		String actualData,expectedData= obj.ReadDataFromExcel(0, 0);
		List<WebElement>row=driver.findElements(tableRow);
		for(WebElement data:row ) {
			if(data.getText().equals(obj.ReadDataFromExcel(0, 0))) {
				//System.out.println(data.getText());
				actualData = data.getText();
				Assert.assertEquals(actualData, expectedData, "Displayed Data IS Not Correct");
			}
		}
		
	}	

}
