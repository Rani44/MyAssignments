package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead_Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		WebElement element1 = driver.findElement(By.id("username"));
		element1.sendKeys("Demosalesmanager");
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
			
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ABC1");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("test1");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("abc1");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Assignment work1");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test_1@gmail.com");
		
		WebElement ele1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec1 = new Select(ele1);
		sec1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
	
		//Edit the fields in Duplicate page
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test2");
		driver.findElement(By.name("submitButton")).click();
		
		//Get the title of the page
		String title = driver.getTitle();
		System.out.println(title);

	}

}
