package stepDefinitions.Admin.AdminAccounts;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static stepDefinitions.CoreStepDefinition.driver;

public class AdminAccounts {
   // WebDriver driver;

    @Then("^user clicks on login button1$")
    public void user_clicks_on_login_button1() {
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

    }

    @Then("On click Account$")
    public void user_clicks_on() {

        driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/div[2]/div[7]/div/div[3]/span")).click();



    }

    @Then("On click New Account$")
    public void user_clicks_NewAccount() {

        driver.findElement(By.xpath("//*[@class='btn btn-primary-r m-t-5']")).click();



    }

    @Then("^user enters account details \"(.*)\" and \"(.*)\"$")
    public void user_enters_contacts_details(String firstname, String lastname) throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"add-act-name\"]")).sendKeys(firstname);
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"add-act-name\"]")).sendKeys(Keys.TAB);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"add-act-name\"]")).sendKeys(Keys.TAB);







        //driver.findElement(By.xpath("//*[text()='Select Segment *']//following::input[1]")).click();

        //driver.findElement(By.xpath("//*[text()='Select Segment *']//following::input[1]")).sendKeys(Keys.TAB);








      //  driver.findElement(By.xpath("//*[@id=\"ul-115\"]/li[1]/md-autocomplete-parent-scope/span")).click();
      //driver.findElement(By.xpath("//*[@id=\"add-segment\"]/md-autocomplete-wrap")).sendKeys(lastname);
       // driver.findElement(By.xpath("//*[text()='Select Segment *']//following::input[1]")).click();
      // driver.findElement(By.xpath("//*[text()='Select Segment *']//following::input[1]")).sendKeys(lastname);
        driver.findElement(By.xpath("(//*[@class='md-autocomplete-suggestions'])[3]/li[1]")).click();

        // driver.findElement(By.xpath("//*[@id=\"ul-284\"]/li[1]")).click();

       // driver.findElement(By.xpath("//*[@id=\"ul-3\"]")).click();
        //driver.findElement(By.id("company_position")).sendKeys(position);
      // driver.findElement(By.xpath("(//*[@type='submit'])[4]")).click();




    }


    @Then("On click Submit$")
    public void user_clicks_Submit_Button() {

        driver.findElement(By.xpath("(//*[@type='submit'])[4]")).click();
    }

    @Then("On click Assign Users$")
    public void user_clicks_AssignUsers_Button() {

        driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[8]")).click();
    }

    @Then("On click Assign Team")
    public void user_clicks_AssignTeam_Button() {

        driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[9]")).click();
    }

}
