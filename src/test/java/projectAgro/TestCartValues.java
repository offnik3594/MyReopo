package projectAgro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class TestCartValues extends BC {
	@Test
	void CartValues() throws InterruptedException
	{
		d.findElement(By.xpath("//android.view.View[@content-desc=\"\"]")).click();
		d.findElement(By.xpath("//android.view.View[@content-desc=\"BUY NOW\"]/android.widget.Button")).click();
		Thread.sleep(5000);

		((JavascriptExecutor) d).executeScript("mobile: scrollGesture", ImmutableMap.of(
				"left", 100, "top", 100, "width", 200, "height", 200,
				"direction", "down",
				"percent", 9.0
				));
	//	d.findElement(By.xpath("//android.view.View")

		Thread.sleep(5000);

		WebElement el=d.findElement(By.xpath("//android.view.View[@text='Lima beans/पावटा']"));
		Boolean swipe;
		
			swipe=(Boolean) ((JavascriptExecutor)d).executeScript("mobile:swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)el).getId(),"direction", "left",
					"percent", 1.0));
		
		
	}

}
