package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AutomateOtp {

	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");
	
		URL url=new URL("http://127.0.0.1:4723");
		
		AndroidDriver d=new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d .findElement(AppiumBy.accessibilityId(""));
		
	}

}
