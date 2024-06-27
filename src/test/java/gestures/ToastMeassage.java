package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ToastMeassage {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");
		
		URL url=new URL("http://127.0.0.1:4723");
	
		AndroidDriver d=new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Activity a=new Activity("com.androidsample.generalstore","com.androidsample.generalstore.MainActivity");
		d.startActivity(a);
		Thread.sleep(3000);
		d.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String t = d.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
	
		
		System.out.println(t);
		
		Thread.sleep(5);
        d.pressKey(new KeyEvent(AndroidKey.HOME));
		
		
		
		
		
	}

}
