package com.sap.assingnment.SAP;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusable.sap.Driver_Class;
import com.reusable.sap.Screenshot_capture;

public class Platform_Sign_up {
	
	@FindBy(xpath =  "//div[@class='btn--content'][contains(text(),'Sign up')]")
	public static WebElement SingupButton;
	
	@FindBy(xpath = "//div[text()='OK']")
	public static WebElement Okbuton;
	
	
	@FindBy(xpath = "//h2[contains(.,'Revolutionize user experiences with chatbots by SAP')]")
	public static WebElement Landingpageverification;
	
   @FindBy(xpath="//iframe[@id='IDS_UI_Window']")
	public static WebElement Switchframe;
   
   @FindBy(xpath="//h1[@class='ids-heading-1']")
   	public static WebElement Registrationpageverification;
	
	@FindBy(xpath="//input[@id='firstName']")
	public static WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	public static WebElement LastName;
	
	@FindBy(xpath = "//input[@id='mail']")
	public static WebElement email;
	
	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public static WebElement Password;
	
	@FindBy(xpath = "//input[@id='retypeNewPasswordInput']")
	public static WebElement Reenterpassword;
	
	@FindBy(xpath = "//input[@id='pdAccept']")
	public static WebElement AgreeCheckbox;
	
	@FindBy(xpath = "//input[@id='touAccept']")
	public static WebElement TermsandCondition;
	
	@FindBy(id = "sapStoreRegisterFormSubmit")
	public static WebElement RegisterButton;
	
	@FindBy(xpath="//iframe[@id='IDS_UI_Window']")
	public static WebElement switchframe2;
	
	@FindBy(xpath="//h1[@class='ids-heading-1']")
	public static WebElement Regsuccess;
	
	
	public static void Platform_Sign_up_Reg(String Filename, String ExlFirstName, String ExlLastName, String ExlEmail, String ExlPassword,
			String ExlReEnterPassword, String PageNameverify) throws InterruptedException, IOException {
		
		PageFactory.initElements(Driver_Class.driver, Platform_Sign_up.class);
		
		Screenshot_capture.takescreenshot(Filename);
		
		
		String text = Landingpageverification.getText();
		
		if(text.equalsIgnoreCase(PageNameverify)) {
			
			System.out.println("Sign up page verified successfully");
		}
		
		else {
			
			throw new Error("Check Internet connection or enter correct url");
		}
		
		Screenshot_capture.takescreenshot(Filename);
		
		Thread.sleep(5000);
		Actions action = new Actions(Driver_Class.driver);
	
		action.moveToElement(Okbuton).click().build().perform();
		Thread.sleep(5000);
		action.moveToElement(SingupButton).click().build().perform();
		
		Thread.sleep(5000);
		Driver_Class.driver.switchTo().frame(Switchframe);
		
		if(Registrationpageverification.isDisplayed()) {
			
			System.out.println("New Registration page verified successfully");
		}
		
		else {
			
			throw new Error("Check Internet connection");
		}
		

	
		
		FirstName.sendKeys(ExlFirstName);
		LastName.sendKeys(ExlLastName);
		email.sendKeys(ExlEmail);
		Password.sendKeys(ExlPassword);
		Reenterpassword.sendKeys(ExlReEnterPassword);
		AgreeCheckbox.click();
		TermsandCondition.click();
		
		Screenshot_capture.takescreenshot(Filename);
		
		RegisterButton.click();
		
		 
	   Driver_Class.driver.switchTo().defaultContent();
	       
	       Thread.sleep(10000);
	       
	  Driver_Class.driver.switchTo().frame(switchframe2);
		
		if(Regsuccess.isDisplayed()) {
			
			System.out.println("Registered successfully");
			Screenshot_capture.takescreenshot(Filename);
		}
		
		else {
			
			throw new Error("Check Internet connection or enter correct details");
		}
		Thread.sleep(5000);
		
		
	}
	

	
	
	
	
	
	

}
