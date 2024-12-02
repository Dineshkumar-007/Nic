package PageobjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class ObjectRepo {
	BaseClass base = new BaseClass();
	

	public ObjectRepo() {
		PageFactory.initElements(base.driver, this);
	}
	@FindBy(xpath ="//button[@class=\"btn-close\"]")
	private WebElement close;
	
	@FindBy(xpath ="//a[contains(text(),' About Us')]")
	private WebElement aboutus;
	
	@FindBy(xpath ="//a[contains(text(),'   Management')]")
	private WebElement management;
	
	@FindBy(xpath ="//div[text()='Board of Directors']")
	private WebElement boardOfDirectors;
	
	@FindBy(xpath ="(//nav[@role=\"navigation\"])[2]")
	private WebElement navBoard;
	
	public WebElement getNavBoard() {
		return navBoard;
	}
	@FindBy(xpath ="(//a[text()='Top Executives'])[1]")
	private WebElement topExecutives;
	
	@FindBy(xpath ="//b[contains(text(),'Contact Details of CMD/General Managers')]")
	private WebElement textTitle;
	
	@FindBy(xpath ="//a[contains(text(),' Login')]")
	private WebElement login;
	
	@FindBy(xpath ="//a[contains(text(),'Customer')]")
	private WebElement Customer;
	
	@FindBy(xpath="//div[@class='mat-select-value']")
	private WebElement userwGroup;
	
	@FindBy(xpath="//mat-option[@value='Customer']")
	private WebElement dropDownCustomer;
	
	
	@FindBy(xpath="//input[@name=\"log_txtfield_iUsername_01\"]")
	private WebElement customerId;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath ="(//a[contains(text(),'Products')])[1]")
	private WebElement product;

	@FindBy(xpath ="//div[@class=\"product-explore-links\"]//a[text()='EXPLORE ALL MOTOR PRODUCTS ']")
	private WebElement exploreAllMotorProducts;

	@FindBy(xpath ="//span[text()='Private Car']")
	private WebElement privateCar;
	
	@FindBy(xpath ="//div[@class=\"custom-banner-title-desc col-lg-7\"]//following::a[text()='Get Quote']")
	private WebElement getQuote;

	@FindBy(xpath ="(//div[@class=\"node__content clearfix\"]//following::div[@class=\"know-more-link\"])[1]")
	private WebElement privateCareKnowMore;

	@FindBy(xpath ="//h5[text()='Calculate Premium']")
	private WebElement calculatePremium;
	
	@FindBy(xpath ="//span[text()='Vehicle Details']")
	private WebElement vehicleDetails;

	@FindBy(xpath ="(//div[@class=\"mat-select-trigger\"])[1]")
	private WebElement vehicleType;

	@FindBy(xpath ="//span[text()=' New ']")
	private WebElement vehicleTypeNew;

	@FindBy(xpath ="(//div[@class=\"mat-select-trigger\"])[2]")
	private WebElement planType;

	@FindBy(xpath ="//span[text()='3 Years Long Term Liability ']")
	private WebElement longTermLiability;

	@FindBy(xpath ="//div[@class=\"mat-form-field-infix\"]/following::input[@id=\"mat-input-0\"]")
	private WebElement rtoLocation;

	@FindBy(xpath ="//span[text()=' Delhi - Central - DL 06 ']")
	private WebElement delhiCentral;

	@FindBy(xpath ="//div[@class=\"mat-form-field-infix\"]/following::input[@name=\"pc_dropdown_make_01\"]")
	private WebElement make;

	@FindBy(xpath ="//span[text()=' BAJAJ ']")
	private WebElement bajaj;

	@FindBy(xpath ="//div[@class=\"mat-form-field-infix\"]/following::input[@id=\"mat-input-2\"]")
	private WebElement model;

	@FindBy(xpath ="//span[text()=' QUTE (2018-2020) ']")
	private WebElement dute2018To2020;

	@FindBy(xpath ="//div[@class=\"mat-form-field-infix\"]/following::input[@id=\"mat-input-3\"]")
	private WebElement variant;
	
	@FindBy(xpath ="//span[text()=' PETROL (2018-2020) ']")
	private WebElement petrol2018To2020;
	
	@FindBy(xpath ="//span[text()=' Generate Quick Quote ']")
	private WebElement generateQuickQuote;
	
	@FindBy(xpath ="//h5[text()='Payable Premium Breakup ']")
	private WebElement payablePremiumBreakup;
	
	@FindBy(xpath ="(//a[contains(text(),'Contact Us')])[1]")
	private WebElement contactUs;
	
	@FindBy(xpath ="//h2[text()='Connect With Us']")
	private WebElement connectWithUs;
	
	@FindBy(xpath ="//select[@class=\"state_select form-select required\"]")
	private WebElement selectState;
	
	@FindBy(xpath ="//label[@class=\"js-form-required form-required\"]/following::select[@class=\"city_select form-select required\"]")   
	private WebElement selectCity;
	
	@FindBy(xpath ="//select[@data-drupal-selector=\"edit-branch\" and @class=\"office_select form-select\"]")   	
	private WebElement selectOfficeName;     
	
	@FindBy(xpath ="//select[@data-drupal-selector=\"edit-office-code\" and @class=\"office_code_select form-select\"]")
	private WebElement selectOfficeCode;
	
	@FindBy(xpath ="//input[@data-drupal-selector=\"edit-search\" and @class=\"btn btn-primary mb-3 connect-submit-button office-filter-submit button js-form-submit form-submit btn btn-primary form-control\"]")
	private WebElement searchButton;
	
	@FindBy(xpath ="(//div[@class=\"views-view-responsive-grid__item-inner\"])[1]")
	private WebElement addressInList;
	
	@FindBy(xpath="//a[normalize-space()='Info Desk']")
	private WebElement info;
	
	@FindBy(xpath="//a[normalize-space()='Services']")
	private WebElement services;
	
	@FindBy(xpath="//div[normalize-space()='E-insurance']")
	private WebElement insurance;
	
	@FindBy(xpath ="//div[@class=\"bg-default\"]")
	private WebElement NIRPage;
	
	public WebElement getNIRPage() {
		return NIRPage;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getCustomer() {
		return Customer;
	}

	public WebElement getUserwGroup() {
		return userwGroup;
	}

	public WebElement getDropDownCustomer() {
		return dropDownCustomer;
	}

	public WebElement getVehicleDetails() {
		return vehicleDetails;
	}

	public WebElement getCustomerId() {
		return customerId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getExploreAllMotorProducts() {
		return exploreAllMotorProducts;
	}

	public WebElement getPrivateCar() {
		return privateCar;
	}

	public WebElement getGetQuote() {
		return getQuote;
	}

	public WebElement getPrivateCareKnowMore() {
		return privateCareKnowMore;
	}

	public WebElement getCalculatePremium() {
		return calculatePremium;
	}

	public WebElement getVehicleType() {
		return vehicleType;
	}

	public WebElement getVehicleTypeNew() {
		return vehicleTypeNew;
	}

	public WebElement getPlanType() {
		return planType;
	}

	public WebElement getLongTermLiability() {
		return longTermLiability;
	}

	public WebElement getRtoLocation() {
		return rtoLocation;
	}

	public WebElement getDelhiCentral() {
		return delhiCentral;
	}

	public WebElement getMake() {
		return make;
	}

	public WebElement getBajaj() {
		return bajaj;
	}

	public WebElement getModel() {
		return model;
	}

	public WebElement getDute2018To2020() {
		return dute2018To2020;
	}

	public WebElement getVariant() {
		return variant;
	}

	public WebElement getPetrol2018To2020() {
		return petrol2018To2020;
	}

	public WebElement getGenerateQuickQuote() {
		return generateQuickQuote;
	}

	public WebElement getPayablePremiumBreakup() {
		return payablePremiumBreakup;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getConnectWithUs() {
		return connectWithUs;
	}

	public WebElement getSelectState() {
		return selectState;
	}

	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getSelectOfficeName() {
		return selectOfficeName;
	}

	public WebElement getSelectOfficeCode() {
		return selectOfficeCode;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getAddressInList() {
		return addressInList;
	}

	public WebElement getInfo() {
		return info;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getInsurance() {
		return insurance;
	}

	public BaseClass getBase() {
		return base;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getAboutus() {
		return aboutus;
	}

	public WebElement getManagement() {
		return management;
	}

	public WebElement getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public WebElement getTopExecutives() {
		return topExecutives;
	}

	public WebElement getTextTitle() {
		return textTitle;
	}
	
}
