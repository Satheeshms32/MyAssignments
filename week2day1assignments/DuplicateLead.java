package week2day1assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver2 = new EdgeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
		//driver.get( "https://www.facebook.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to enter user name
			//to maximize
			driver.manage().window().maximize();
			
		//WebElement eleUsername = driver.findElement(By.id("username"));
	///	eleUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//click leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//click CreateLead Link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//enter local firstname
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Subra");
		
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("IT description");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kumar.satheesh75@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement StateProvinceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec2 = new Select(StateProvinceDD );
		sec2.selectByVisibleText("New York");
		
		//Click CreateLead Button
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		
		//to verify with title
		
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Satheesh");
		driver.findElement(By.name("submitButton")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
