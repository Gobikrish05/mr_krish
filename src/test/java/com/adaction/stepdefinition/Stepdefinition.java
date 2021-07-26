package com.adaction.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.AdactinCucumber5.AdactinPom1;
import com.adactin.baseclass.BaseWebelements;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Stepdefinition extends BaseWebelements {
	public static WebDriver driver=Runner.driver;
	
	
	public static PageObjectManager pom= new PageObjectManager(driver);   // pageobjectmanager)
	
	
	//AdactinPom1 aP = new AdactinPom1(driver);
@Given("^User must launch the login page$")
public void user_must_launch_the_login_page() throws Throwable {
	String url = FileReaderManager.getInstanceFR().getInstanceCR().url();
	openurl(url);
    
}
@When("^User enter the valid username \"([^\"]*)\"$")
public void user_enter_the_valid_username(String arg1) throws Throwable {
	inputValues(pom.getInstancepom1().getUsername(), arg1);
  
}

@When("^User enter the valid password \"([^\"]*)\"$")
public void user_enter_the_valid_password(String arg1) throws Throwable {
    inputValues(pom.getInstancepom1().getPass(), arg1);

}


//@When("^User enter the valid username in the username field$")
//public void user_enter_the_valid_username_in_the_username_field() throws Throwable {
//	inputValues(aP.getUsername(), "Gobikrish");
//}
//
//@When("^User enter the valid password in the password field$")
//public void user_enter_the_valid_password_in_the_password_field() throws Throwable {
//	inputValues(aP.getPass(), "877887584");
//}

@Then("^User confirm it and navigate to the search page$")
public void user_confirm_it_and_navigate_to_the_search_page() throws Throwable {
	methodforclick(pom.getInstancepom1().getLogin());
}

@Given("^User should  press the login button$")
public void user_should_press_the_login_button() throws Throwable {
    
}
com.AdactinCucumber5.AdactinPom2 ak = new com.AdactinCucumber5.AdactinPom2(driver);
@When("^User  select a location from the dropdown box$")
public void user_select_a_location_from_the_dropdown_box() throws Throwable {
	methodforclick(ak.getLoaction());
	dropdownMethod(ak.getLoaction(), "value", 0, "London", null);
}

@When("^User  pick the specific hotel using the dropdown$")
public void user_pick_the_specific_hotel_using_the_dropdown() throws Throwable {
	methodforclick(ak.getHotel());
	dropdownMethod(ak.getHotel(), "text", 0, null, "Hotel Hervey");
}

@When("^User select the roomtype$")
public void user_select_the_roomtype() throws Throwable {
	methodforclick(ak.getRoom());
	dropdownMethod(ak.getRoom(), "value", 0,"Super Deluxe", null);
}

@When("^User  choose particular number of rooms$")
public void user_choose_particular_number_of_rooms() throws Throwable {
	methodforclick(ak.getNos());
	dropdownMethod(ak.getNos(), "index", 3, null, null);
}

@When("^User  fill the Check-in date in the check-in field$")
public void user_fill_the_Check_in_date_in_the_check_in_field() throws Throwable {

}

@When("^User  enter the Check-out dates ,in the check-out field$")
public void user_enter_the_Check_out_dates_in_the_check_out_field() throws Throwable {
	methodforclick(ak.getAdult());
	dropdownMethod(ak.getAdult(),"index", 3, null, null);
}

@When("^User select the number of adults per room using dropdown$")
public void user_select_the_number_of_adults_per_room_using_dropdown() throws Throwable {
    
}

@When("^User pick  number of children per room under the dropdown area$")
public void user_pick_number_of_children_per_room_under_the_dropdown_area() throws Throwable {
    
}

@Then("^User Confirm the datas and naviate to the select hotel page$")
public void user_Confirm_the_datas_and_naviate_to_the_select_hotel_page() throws Throwable {
    
}

@Given("^User must press the search button$")
public void user_must_press_the_search_button() throws Throwable {
	methodforclick(ak.getSearch());
}

@When("^user click the checkbox to select a hotel$")
public void user_click_the_checkbox_to_select_a_hotel() throws Throwable {
	methodforclick(ak.getRadio());
}

@Then("^User confirm it and navigate to book a hotel page$")
public void user_confirm_it_and_navigate_to_book_a_hotel_page() throws Throwable {
    
}

@Given("^User must click the continue button$")
public void user_must_click_the_continue_button() throws Throwable {
	methodforclick(ak.getContinous());

}
com.AdactinCucumber5.Adctinpom3 al =new com.AdactinCucumber5.Adctinpom3(driver);
@When("^User enter the firstname in the firstname field$")
public void user_enter_the_firstname_in_the_firstname_field() throws Throwable {
	inputValues(al.getFirstname(), "GOBIKRISHNAN");
}

@When("^User fill the lastname  in the lastname field$")
public void user_fill_the_lastname_in_the_lastname_field() throws Throwable {
	 inputValues(al.getLastname(), "MUTHUVEL");
}

@When("^User feed the address in that billing address field$")
public void user_feed_the_address_in_that_billing_address_field() throws Throwable {
	inputValues(al.getAddress(), "D-2Thaluka police line Thanjavur-613001");
}

@When("^User enter the card number in credit card no field$")
public void user_enter_the_card_number_in_credit_card_no_field() throws Throwable {
	inputValues(al.getAccountnumber(), "7894561233216547");

}

@When("^User select the credit card from select credit card dropdown$")
public void user_select_the_credit_card_from_select_credit_card_dropdown() throws Throwable {
	methodforclick(al.getAcctype());
	dropdownMethod(al.getAcctype(), "text", 0, null, "VISA");
}

@When("^User pick the expiry month from select month dropdown$")
public void user_pick_the_expiry_month_from_select_month_dropdown() throws Throwable {
	methodforclick(al.getExpmonth());
	dropdownMethod(al.getExpmonth(), "value", 0, "8", null);
}

@When("^User choose the expiry year from select year dropdown$")
public void user_choose_the_expiry_year_from_select_year_dropdown() throws Throwable {
	methodforclick(al.getExpyear());
	dropdownMethod(al.getExpyear(), "value", 0, "2021", null);	
}

@When("^User enter CCV number in the CVV Number field$")
public void user_enter_CCV_number_in_the_CVV_Number_field() throws Throwable {
	inputValues(al.getCcv(), "277");
}

@Then("^User confirm all the fields and get through booking confirmation page$")
public void user_confirm_all_the_fields_and_get_through_booking_confirmation_page() throws Throwable {
	
}

@Given("^User must click the BookNow button$")
public void user_must_click_the_BookNow_button() throws Throwable {
	methodforclick(al.getBook());
}

@Then("^User Must press the logout button$")
public void user_Must_press_the_logout_button() throws Throwable {
	methodforclick(al.getLogut());
}



}
