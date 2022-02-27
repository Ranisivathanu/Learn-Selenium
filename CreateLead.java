package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
      driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 String leadpage=driver.getTitle();
	 System.out.println(leadpage);
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rani");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sabarish");
	 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("sabari");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineering");
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("Music lover");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arssabari143@gmail.com");
	 
	 WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select province =new Select(State);
	 province.selectByVisibleText("New York");
	 
	 
	 driver.findElement(By.className("smallSubmit")).click();
	 
	 String createLead =driver.getTitle();
	 System.out.println("createLead");
	 
}

}
