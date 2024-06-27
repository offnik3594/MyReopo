package projectAgro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Pinchtheimage extends BC{
	
	
	
	@Test
	void Zoomout() throws InterruptedException
	{

		d.findElements(AppiumBy.className("android.widget.EditText")).get(0).sendKeys("Banana");
		d.findElement(By.xpath("//android.view.View[@content-desc='Banana [ केळी ]']/android.widget.TextView")).click();
		Thread.sleep(5000);
		//d.findElement(By.id("item-two-tab"));
		WebElement ele =d.findElements(AppiumBy.className("android.widget.TextView")).get(1);
		Thread.sleep(3000);
		((JavascriptExecutor) d).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) ele).getId(),
				"percent", 1.0,"endX",430,"endY",563
				));
				
	}


}
