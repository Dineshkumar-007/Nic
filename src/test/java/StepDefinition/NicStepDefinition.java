package StepDefinition;

import Baseclass.BaseClass;
import PageobjectModel.ObjectRepo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NicStepDefinition {
	BaseClass base = new BaseClass();
	ObjectRepo locate= new ObjectRepo();
	@Given("Launch application {string}")
	public void launch_application(String url) {
	    base.launchApplication(url);
	}

	@Then("Validate the Homepage")
	public void validate_the_homepage() throws InterruptedException {
		Thread.sleep(5000);

//	   base.clicks(locate.getClose());
//		base.movetoElements(locate.getClose());
		base.javaScriptClick(locate.getClose());
//				base.explicityWaits(locate.getClose());
	   base.getCurrentUrl();
	}

	@When("User Clicks on About Us option")
	public void user_clicks_on_about_us_option() throws InterruptedException {
		Thread.sleep(5000);
	    base.clicks(locate.getAboutus());
	}

	@Then("Clicks Management option")
	public void clicks_management_option() {
	   base.clicks(locate.getManagement());
	}


	@Then("click Board of Directors option")
	public void click_board_of_directors_option() throws InterruptedException {
		Thread.sleep(3000);

	    base.clicks(locate.getBoardOfDirectors());
	}

	@Then("Click the Top Executives option")
	public void click_the_top_executives_option() throws InterruptedException {
		Thread.sleep(3000);
//		base.javaScriptScrollUp(locate.getNavBoard());
//	    base.explicityWaits(locate.getTopExecutives());
		base.javaScriptClick(locate.getTopExecutives());
	}

	@Then("validate the title of the table")
	public void validate_the_title_of_the_table() {
		base.javaScriptScrollUp(locate.getTextTitle());
	String title = "Contact Details of CMD/General Managers/Deputy General Managers as on 01.09.2023";
	   if(title.equals(locate.getTextTitle())) {
		   System.out.println("Title is equal");
	   }
	}
	
	@When("user clicks Login option")
	public void user_clicks_login_option() {
	    base.clicks(locate.getLogin());
	}

	@When("clicks Customer option")
	public void clicks_customer_option() {
	    base.clicks(locate.getCustomer());
	}

	@Then("validate the login page")
	public void validate_the_login_page() {
	    String currentUrl = base.getCurrentUrl();
	    String url = "https://nicportal.nic.co.in/nicportal/signin/login";
	    
	    if(url.equals(currentUrl)) {
	    	System.out.println("user lands on Login page");
	    }
	}

	@When("user select customer option in User group dropdown")
	public void user_select_customer_option_in_user_group_dropdown() {
		base.multiWindowHandles(1);
	    base.explicityWaits(locate.getUserwGroup());
	    base.explicityWaits(locate.getDropDownCustomer());
	}

	@When("user enters Customer Id {string}")
	public void user_enters_customer_id(String id) {
	    base.sendValue(locate.getCustomerId(), id);
	}

	@When("user enters Password {string}")
	public void user_enters_password(String password) {
	    base.sendValue(locate.getPassword(), password);
	}

	@Then("click Login button")
	public void click_login_button() {
	    base.clicks(locate.getLoginButton());
	}

	@When("Click The Product Module")
	public void click_the_product_module() throws InterruptedException {
		Thread.sleep(3000);
	   base.javaScriptClick(locate.getProduct());
	}


	@When("Click The Explore All Motor Products")
	public void click_the_explore_all_motor_products() {
	    base.javaScriptClick(locate.getExploreAllMotorProducts());
	}

	@When("Click The Private car Know More")
	public void click_the_private_car_know_more() throws InterruptedException {
	   base.javaScriptScrollUp(locate.getPrivateCar());
	   Thread.sleep(2000);
	   base.explicityWaits(locate.getPrivateCareKnowMore());
	}

	@When("Click The Get Quote")
	public void click_the_get_quote() {
	    base.explicityWaits(locate.getGetQuote());
	}

	@Then("Validate Vehicle Details page is navigate in new Tab")
	public void validate_vehicle_details_page_is_navigate_in_new_tab() {
	    base.multiWindowHandles(1);
	    if(base.display(locate.getCalculatePremium())) {
	    	System.out.println("Navigated to vehicle Details page");
	    }
	    
	}

	@When("Click The Vehicle Type and Click New in dropdown")
	public void click_the_vehicle_type_and_click_new_in_dropdown() {
		base.javaScriptScrollUp(locate.getCalculatePremium());
	    base.explicityWaits(locate.getVehicleType());
	    base.explicityWaits(locate.getVehicleTypeNew());
	}

	@When("Click The Plan Type and Click Three Years Long Term Liability in dropdown")
	public void click_the_plan_type_and_click_three_years_long_term_liability_in_dropdown() {
	    base.clicks(locate.getPlanType());
	    base.clicks(locate.getLongTermLiability());
	}

	@When("Click RTO Location and Click Delhi - Central in dropdown")
	public void click_rto_location_and_click_delhi_central_in_dropdown() {
	    base.explicityWaits(locate.getRtoLocation());
	    base.clicks(locate.getDelhiCentral());
	}

	@When("Click Make and Click Bajaj in dropdown")
	public void click_make_and_click_bajaj_in_dropdown() {
	   base.clicks(locate.getMake());
	   base.clicks(locate.getBajaj());
	}

	@When("Click Model and Click  QUTE2018to2020 in dropdown")
	public void click_model_and_click_qute2018to2020_in_dropdown() {
		base.clicks(locate.getModel());
		base.clicks(locate.getDute2018To2020());
	}

	@When("Click Variant and Click Petrol2018to2020 in dropdown")
	public void click_variant_and_click_petrol2018to2020_in_dropdown() {
		base.clicks(locate.getVariant());
		base.clicks(locate.getPetrol2018To2020());
	}

	@When("Click Generate Quick Quote")
	public void click_generate_quick_quote() {
		base.clicks(locate.getGenerateQuickQuote());
	}

	@Then("Validate Payable Premium Breakup is Visible")
	public void validate_payable_premium_breakup_is_visible() {
	 base.display(locate.getPayablePremiumBreakup());  
	}

	@When("Click The Contact Us")
	public void click_the_contact_us() {
	   base.clicks(locate.getContactUs());
	}

	@When("Click Select State Dropdown and Click Tamil Nadu")
	public void click_select_state_dropdown_and_click_tamil_nadu() throws InterruptedException {
		base.javaScriptScrollUp(locate.getConnectWithUs());
		Thread.sleep(2000);
	   base.selectValue(locate.getSelectState(), "103");
	   
	}

	@When("Click Select City Dropdown and Click Chennai")
	public void click_select_city_dropdown_and_click_chennai() throws InterruptedException {
		Thread.sleep(10000);
		base.selectValue(locate.getSelectCity(), "107");
	}

	@When("Click Select Office Name DropDown and Click Chennai Motor")
	public void click_select_office_name_drop_down_and_click_chennai_motor() throws InterruptedException {
		Thread.sleep(10000);

	    base.selectValue(locate.getSelectOfficeName(), "4420");
	}

	@When("Click Select Office Code DropDown and Click Code")
	public void click_select_office_code_drop_down_and_click_code() throws InterruptedException {
		Thread.sleep(10000);

	   base.selectValue(locate.getSelectOfficeCode(), "4420");
	}

	@When("Click Search button")
	public void click_search_button() {
	    base.explicityWaits(locate.getSearchButton());
	}

	@Then("Validate Address is Visible in List")
	public void validate_address_is_visible_in_list() {
	    if(base.display(locate.getAddressInList())) {
	    	System.out.println("Address is visible in list");
	    }
	}

	@When("click on InfoDesk module")
	public void click_on_info_desk_module() {
	   base.clicks(locate.getInfo());
	}

	@Then("Validate Infodesk text")
	public void validate_infodesk_text() {
	  if (base.display(locate.getInfo())) {
		  System.out.println("Infodesk Text is displayed");
	  }
	}

	@When("User click on services module")
	public void user_click_on_services_module() {
	    base.clicks(locate.getServices());
	}

	@Then("User click on E-insurance")
	public void user_click_on_e_insurance() {
		base.clicks(locate.getInsurance());
	}

	@Then("Validate E-application form")
	public void validate_e_application_form() {
		if(base.display(locate.getNIRPage())) {
			System.out.println("E-application form is displayed");
		}
}
}