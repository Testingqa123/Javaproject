package bipackage;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Guestquote {
	  private WebDriver driver;
	  
  

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get("http://log.quad1test.com:2222");
    driver.findElement(By.linkText("START A NEW QUOTE")).click();
    //driver.findElement(By.id("sex_1")).click();
    new Select(driver.findElement(By.id("title"))).selectByVisibleText("Mr");
    driver.findElement(By.id("first_name")).clear();
    driver.findElement(By.id("first_name")).sendKeys("Testingfirst");
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("Lname");
    new Select(driver.findElement(By.id("day"))).selectByVisibleText("24");
    new Select(driver.findElement(By.id("month"))).selectByVisibleText("May");
    new Select(driver.findElement(By.id("year"))).selectByVisibleText("1990");
    //driver.findElement(By.id("smoker_2")).click();
    //driver.findElement(By.id("txtIncreasingBenefit_2")).click();
    driver.findElement(By.id("res_status_1")).click();
    driver.findElement(By.id("existing_mortgage")).click();
    driver.findElement(By.id("mm_repay_2")).clear();
    driver.findElement(By.id("mm_repay_2")).sendKeys("1501");
    driver.findElement(By.id("monthly_gross_income")).clear();
    driver.findElement(By.id("monthly_gross_income")).sendKeys("4000");
    driver.findElement(By.id("monthly_benifit_amount")).clear();
    driver.findElement(By.id("monthly_benifit_amount")).sendKeys("2400");
    //driver.findElement(By.id("ui-id-46")).click();
    //driver.findElement(By.id("industry_type")).clear();
    driver.findElement(By.id("industry_type")).sendKeys("Insurance Advisor");
    Thread.sleep(2000);
    //driver.findElement(By.id("monthly_gross_income")).sendKeys("Insurance");
    //driver.findElement(By.id("occupation_type")).clear();
    driver.findElement(By.id("occupation_type")).sendKeys("Financial Advisor");
    Thread.sleep(2000);
    new Select(driver.findElement(By.id("cover_type"))).selectByVisibleText("Accident & Sickness only");
    new Select(driver.findElement(By.id("excessperiod"))).selectByVisibleText("1 Day");
    driver.findElement(By.id("get_quote")).click();
    assertEquals("Accident & Sickness only", driver.findElement(By.xpath("//form[@id='search_form']/div[3]/div/div/div/div[3]/label")).getText());
    assertEquals("All1 Day1 Week2 Weeks4 Weeks8 Weeks13 Weeks26 Weeks52 Weeks56 Weeks104 Weeks112 Weeks", driver.findElement(By.id("excess_period")).getText());
    assertEquals("2400", driver.findElement(By.id("benifit_amount")).getAttribute("value"));
    assertEquals("Back to day 1", driver.findElement(By.xpath("//table[@id='productslist']/tbody/tr/td[4]")).getText());
  }

  @After
  public void tearDown() throws Exception {
    //driver.quit();
  }

}






