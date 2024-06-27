package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class KEyEvents2 {
	public static void main(String[] args) throws MalformedURLException {
		0;
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");

		URL url = new URL("http://127.0.0.1:4723");

		AndroidDriver d = new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.pressKey(new KeyEvent(AndroidKey.BRIGHTNESS_DOWN));
	    d.pressKey(new KeyEvent(AndroidKey.BRIGHTNESS_UP));
	    d.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
	    d.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));
	    
	}
}
