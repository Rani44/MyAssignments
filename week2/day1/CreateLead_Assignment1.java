package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement element1 = driver.findElement(By.id("username"));
		element1.sendKeys("Demosalesmanager");
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
			
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(ele);
		sec.selectByVisibleText("Direct Mail");
		sec.selectByValue("LEAD_COLDCALL");
		
		WebElement industryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		Select sec2 = new Select(industryDropDown);
		sec2.selectByIndex(5);

	}

}
