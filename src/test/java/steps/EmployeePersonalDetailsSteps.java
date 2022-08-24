package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class EmployeePersonalDetailsSteps extends CommonMethods {

    @When("user finds the new employee and clicks on it")
    public void user_finds_the_new_employee_and_clicks_on_it() throws InterruptedException {
        int sizeOfTable=emp.recentAddedEmployeeTable.size();
        for(int i=0; i<sizeOfTable; i++){
          String rowText=emp.recentAddedEmployeeTable.get(i).getText();
          if (!rowText.isEmpty()){
              List<WebElement> checkBoxEmp=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
              checkBoxEmp.get(i).click();
              Thread.sleep(3000);
          }
        }

    }
    @Then("user navigated to Personal Details and user clicks on edit button")
    public void user_navigated_to_personal_details_and_user_clicks_on_edit_button() {
        click(personalDetails.editeAndSaveButton);
    }

    @When("user fills out all of the information")
    public void user_fills_out_all_of_the_information() {
       sendText(personalDetails.otherId, "1223456");
       sendText(personalDetails.driversLicenseNumber, "A234 8876 0976");
       click(personalDetails.licenseExpiryDate);
       Select select= new Select(personalDetails.ddYearForLED);
       select.selectByVisibleText("2026");
       select=new Select(personalDetails.ddMonthForLED);
       select.selectByVisibleText("Jul");
       for(WebElement calenderDates:personalDetails.calenderOfLED){
           if (calenderDates.getText().equals("21")){
               click(calenderDates);
               break;
           }
       }

    }
    @When("user clicks on add attachment")
    public void user_clicks_on_add_attachment() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user attacths file and add comment")
    public void user_attacths_file_and_add_comment() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on upload button")
    public void user_clicks_on_upload_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on save button to save all of the information")
    public void user_clicks_on_save_button_to_save_all_of_the_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user be abled to verify that all information has been added")
    public void user_be_abled_to_verify_that_all_information_has_been_added() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
