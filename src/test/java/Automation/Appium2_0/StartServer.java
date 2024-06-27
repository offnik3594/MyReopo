package Automation.Appium2_0;

import java.io.File;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class StartServer {
	
	@Test
	void serverSetup() 
	{
		try 
		{
			AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
					.withIPAddress("127.0.0.1").usingPort(4723).build();
			service.start();
			Thread.sleep(5000);
			service.stop();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
	}

}
