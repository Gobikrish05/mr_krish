$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the booking functionality of the Adactin Hotel Booking application",
  "description": "",
  "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User Checking the functionality of login page",
  "description": "",
  "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-the-functionality-of-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User must launch the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enter the valid username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter the valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User confirming the login and move to next functionality",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-the-functionality-of-login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-the-functionality-of-login-page;;1"
    },
    {
      "cells": [
        "gobikrish",
        "8778875@"
      ],
      "line": 14,
      "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-the-functionality-of-login-page;;2"
    },
    {
      "cells": [
        "Gobikrish",
        "877887584"
      ],
      "line": 15,
      "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-the-functionality-of-login-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "User Checking the functionality of login page",
  "description": "",
  "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-the-functionality-of-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User must launch the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enter the valid username \"gobikrish\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter the valid password \"8778875@\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User confirming the login and move to next functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_must_launch_the_login_page()"
});
formatter.result({
  "duration": 70793317500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gobikrish",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 131063000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8778875@",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 1358615500,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "User Checking the functionality of login page",
  "description": "",
  "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-the-functionality-of-login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User must launch the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enter the valid username \"Gobikrish\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter the valid password \"877887584\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User confirming the login and move to next functionality",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_must_launch_the_login_page()"
});
formatter.result({
  "duration": 795869500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gobikrish",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 94025100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "877887584",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 2647503900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 21,
  "name": "User checking all the necessary fields to search a hotel using valid datas",
  "description": "",
  "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-all-the-necessary-fields-to-search-a-hotel-using-valid-datas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "User should  press the login button",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User  select a location from the dropdown box",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User  pick the specific hotel using the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User select the roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User  choose particular number of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User  fill the Check-in date in the check-in field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User  enter the Check-out dates ,in the check-out field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User select the number of adults per room using dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User pick  number of children per room under the dropdown area",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User Confirm the datas and naviate to the select hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_should_press_the_login_button()"
});
formatter.result({
  "duration": 1785700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_a_location_from_the_dropdown_box()"
});
formatter.result({
  "duration": 427229100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_pick_the_specific_hotel_using_the_dropdown()"
});
formatter.result({
  "duration": 288086400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_the_roomtype()"
});
formatter.result({
  "duration": 277027600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_choose_particular_number_of_rooms()"
});
formatter.result({
  "duration": 409969600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_fill_the_Check_in_date_in_the_check_in_field()"
});
formatter.result({
  "duration": 36300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_Check_out_dates_in_the_check_out_field()"
});
formatter.result({
  "duration": 353730900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_the_number_of_adults_per_room_using_dropdown()"
});
formatter.result({
  "duration": 28600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_pick_number_of_children_per_room_under_the_dropdown_area()"
});
formatter.result({
  "duration": 28500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Confirm_the_datas_and_naviate_to_the_select_hotel_page()"
});
formatter.result({
  "duration": 30100,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User Checking the functionality for selecting a hotel",
  "description": "",
  "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-the-functionality-for-selecting-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "User must press the search button",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "user click the checkbox to select a hotel",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User confirm it and navigate to book a hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_must_press_the_search_button()"
});
formatter.result({
  "duration": 878127400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_checkbox_to_select_a_hotel()"
});
formatter.result({
  "duration": 115663300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_confirm_it_and_navigate_to_book_a_hotel_page()"
});
formatter.result({
  "duration": 40300,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "user checking book a hotel functionality using various valid information",
  "description": "",
  "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-book-a-hotel-functionality-using-various-valid-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "User must click the continue button",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User enter the firstname in the firstname field",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User fill the lastname  in the lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User feed the address in that billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User enter the card number in credit card no field",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User select the credit card from select credit card dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "User pick the expiry month from select month dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User choose the expiry year from select year dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User enter CCV number in the CVV Number field",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User confirm all the fields and get through booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_must_click_the_continue_button()"
});
formatter.result({
  "duration": 1197996000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_firstname_in_the_firstname_field()"
});
formatter.result({
  "duration": 245979200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_fill_the_lastname_in_the_lastname_field()"
});
formatter.result({
  "duration": 116403300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_feed_the_address_in_that_billing_address_field()"
});
formatter.result({
  "duration": 163854000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_card_number_in_credit_card_no_field()"
});
formatter.result({
  "duration": 132051900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_select_the_credit_card_from_select_credit_card_dropdown()"
});
formatter.result({
  "duration": 259500100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_pick_the_expiry_month_from_select_month_dropdown()"
});
formatter.result({
  "duration": 301406400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_choose_the_expiry_year_from_select_year_dropdown()"
});
formatter.result({
  "duration": 273208800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_CCV_number_in_the_CVV_Number_field()"
});
formatter.result({
  "duration": 125729500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_confirm_all_the_fields_and_get_through_booking_confirmation_page()"
});
formatter.result({
  "duration": 44400,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "User checking the functionality of logout page",
  "description": "",
  "id": "testing-the-booking-functionality-of-the-adactin-hotel-booking-application;user-checking-the-functionality-of-logout-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "User must click the BookNow button",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "User Must press the logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_must_click_the_BookNow_button()"
});
formatter.result({
  "duration": 88497200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Must_press_the_logout_button()"
});
formatter.result({
  "duration": 57661100,
  "status": "passed"
});
});