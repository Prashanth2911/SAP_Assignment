package com.reusable.sap;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot_capture {
	
	public static void takescreenshot(String className) throws IOException {

		File directory = new File(className);
		if (! directory.exists()){
		directory.mkdirs();
		   }
		TakesScreenshot src=(TakesScreenshot)Driver_Class.driver;
		File srcFile=src.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(Constant.Filename_Screenshot+"\\"+className+"\\"+className+"_"+System.currentTimeMillis()+".jpg"));


		} 

}
