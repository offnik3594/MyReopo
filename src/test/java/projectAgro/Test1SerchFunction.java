package projectAgro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Test1SerchFunction extends BC {
	
	
	@Test
	void Fserach()
	{
		
		
		d.findElements(AppiumBy.className("android.widget.EditText")).get(0).sendKeys("Banana");
		d.findElement(By.xpath("//android.view.View[@content-desc='Banana [ केळी ]']/android.widget.TextView")).click();

		
		
		
	}
	
}
