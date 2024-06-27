package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class PackageNavigation {
	
public static void main(String[] args) throws MalformedURLException 
{
	UiAutomator2Options u = new UiAutomator2Options();
	u.setPlatformName("Android");
	u.setDeviceName("OPPO CPH1933");

	URL url = new URL("http://127.0.0.1:4723");

	AndroidDriver d = new AndroidDriver(url,u);
	//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	Activity ac=new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
//	d.startActivity(ac);
	//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	Activity ac=new Activity("com.whatsapp", "com.whatsapp.HomeActivity");
    d.startActivity(ac);
	//d.pressKey(new KeyEvent(AndroidKey.BACK));
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	

}
