package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
   
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement Create_user_Button;
    @FindBy(name = "username") private WebElement UsernameTB;
    @FindBy(name = "passwordText") private WebElement PasswordTB;
    @FindBy(name = "passwordTextRetype") private WebElement Retype_passwordTB;
    @FindBy(name = "firstName") private WebElement FirstNameTB;
    @FindBy(name = "lastName") private WebElement LastNameTB;
    
    @FindBy(name = "rightGranted[9]")  private WebElement  Enter_Timetrack_checkBox;
    @FindBy(name = "rightGranted[12]") private WebElement   Modify_time_trackforotherUsers;
    @FindBy(name = "rightGranted[2]") private WebElement Manage_Customer_Projects;
    @FindBy(name = "rightGranted[13]") private WebElement Manage_Tasks;
    @FindBy(name = "rightGranted[1]") private WebElement Generate_Reports;
    @FindBy(name = "rightGranted[5]") private WebElement Manage_Users;
    @FindBy(name = "rightGranted[7]") private WebElement Manage_Billing_Type;
    @FindBy(name = "rightGranted[10]") private WebElement Manage_Work_Schedule;
    
    @FindBy(xpath = "//input[@value='   Create User   ']") private WebElement Create_User_Button;
    
    public UsersPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }

	public WebElement getCreate_user_Button() {
		return Create_user_Button;
	}

	public WebElement getUsernameTB() {
		return UsernameTB;
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getRetype_passwordTB() {
		return Retype_passwordTB;
	}

	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}

	public WebElement getLastNameTB() {
		return LastNameTB;
	}

	public WebElement getEnter_Timetrack_checkBox() {
		return Enter_Timetrack_checkBox;
	}

	public WebElement getModify_time_trackforotherUsers() {
		return Modify_time_trackforotherUsers;
	}

	public WebElement getManage_Customer_Projects() {
		return Manage_Customer_Projects;
	}

	public WebElement getManage_Tasks() {
		return Manage_Tasks;
	}

	public WebElement getGenerate_Reports() {
		return Generate_Reports;
	}

	public WebElement getManage_Users() {
		return Manage_Users;
	}

	public WebElement getManage_Billing_Type() {
		return Manage_Billing_Type;
	}

	public WebElement getManage_Work_Schedule() {
		return Manage_Work_Schedule;
	}

	public WebElement getCreate_User_Button() {
		return Create_User_Button;
	}
    
   
    public void createUser()
    {   
    	
              
    	  
    }
    
}  
