package com.sap.assingnment.SAP;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.reusable.sap.Constant;
import com.reusable.sap.Datadriven;
import com.reusable.sap.Driver_Class;
import com.reusable.sap.Screenshot_capture;

@Listeners(com.reusable.sap.TestListener.class)
public class TC001_SAP_Platform_Sign_up {
	
	ArrayList<String> data;

	@BeforeMethod
	public void startUP() throws IOException {
	Datadriven d= new Datadriven();
	data= d.getData("TC001_SAP_Platform_Sign_up");


	Driver_Class.getdriver(Constant.BROWSER_NAME);
	
	}
	
	@Test
	public void Platform_Sign_up() throws Exception{
		
		Platform_Sign_up.Platform_Sign_up_Reg(TC001_SAP_Platform_Sign_up.class.toString(), data.get(1).
	toString(), data.get(2).toString(),data.get(3).toString(),data.get(4).toString(),data.get(5).toString(),data.get(6).toString());
		
		
	}
	
	@AfterMethod
	public void teardown() {
	Driver_Class.driver.quit();
	}
		
		
	

}
