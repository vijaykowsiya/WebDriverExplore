package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {

	
	@Given("Existing User registered in Amazon.in")
	public void existing_user_registered_in_amazon_in() {
	  System.out.println("Existing User registered in Amazon.in");
	}


	@Given("User is on login page")
	public void user_is_on_login_page() {
		 System.out.println("User is on login page");
	}
	@When("User entered Username and Password and Clicked Login button")
	public void user_entered_username_and_password_and_clicked_login_button() {
		System.out.println("User entered Username and Password and Clicked Login button");
	}
	@When("User clicked Returns and Orders and navigates to Orders page")
	public void user_clicked_returns_and_orders_and_navigates_to_orders_page() {
		System.out.println("User clicked Returns and Orders and navigates to Orders page");
	}
	@Then("Order tab is selected by default and order details displayed")
	public void order_tab_is_selected_by_default_and_order_details_displayed() {
		System.out.println("Order tab is selected by default and order details displayed");
	}
	
	@When("User clicked Buy Again tab")
	public void user_clicked_buy_again_tab() {
		System.out.println("User clicked Buy Again tab");
	}


	@Then("Previous Ordered Products displayed")
	public void previous_ordered_products_displayed() {
		System.out.println("Previous Ordered Products displayed");
	}

	@When("User clicked Not Yet Shipped tab")
	public void user_clicked_not_yet_shipped_tab() {
		System.out.println("User clicked Not Yet Shipped tab");
	}

	@Then("Pending orders displayed")
	public void pending_orders_displayed() {
		System.out.println("Pending orders displayed");
	}

	@When("User clicked Cancelled Orders tab")
	public void user_clicked_cancelled_orders_tab() {
		System.out.println("User clicked Cancelled Orders tab");
	}

	@Then("Cancelled orders displayed")
	public void cancelled_orders_displayed() {
		System.out.println("Cancelled orders displayed");
	}
}
