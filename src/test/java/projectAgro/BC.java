package projectAgro;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BC  {
    public UiAutomator2Options u;
    public AndroidDriver d;
    
    
   @BeforeClass
	void Setup() throws MalformedURLException, InterruptedException
	{
		
		u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");

		URL url=new URL("http://127.0.0.1:4723");
		
		d=new AndroidDriver(url, u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(AppiumBy.accessibilityId("Swaraj AgroTech")).click();
	    Thread.sleep(5000);
		
		
		
		
		
		
	}
	
	
	
}
