package Automation.Appium2_0;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	public UiAutomator2Options u;
	public URL url;
	public AndroidDriver d;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void configuration() throws MalformedURLException, InterruptedException
	{
	    service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		service.start();
	
		
        u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO");

		url=new URL("http://127.0.0.1:4723");

		d=new AndroidDriver(url,u);

	}
	
	@AfterClass 
	public void CloseConnection() throws IOException
	{
		d.close();
		service.close();
		
		
	
	}


}
