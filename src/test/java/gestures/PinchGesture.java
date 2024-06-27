package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class PinchGesture {

	@Test
	void pinchOpenClose() throws MalformedURLException, InterruptedException
	{
		UiAutomator2Options u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");

		URL url = new URL("http://127.0.0.1:4723");

		AndroidDriver d = new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		d.findElement(By.xpath("//android.widget.TextView[@content-desc=\"File Manager\"]")).click();
		Thread.sleep(3000);
		d.findElements(AppiumBy.className("android.widget.RelativeLayout")).get(4).click();
		Thread.sleep(3000);

		d.findElements(AppiumBy.className("android.widget.RelativeLayout")).get(0).click();
		Thread.sleep(5000);


		WebElement ele = d.findElements(AppiumBy.className("android.view.ViewGroup")).get(1);

		((JavascriptExecutor) d).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) ele).getId(),
				"percent", 1.0,"endX",360,"endY",1074
				));
		
		Thread.sleep(5000);
		
		((JavascriptExecutor) d).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) ele).getId(),
				"percent", 0.75
				));


	}

}
