package projectAgro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class TestCart extends BC{
	
	
	@Test
	void Cart() throws InterruptedException
	{
		d.findElement(AppiumBy.accessibilityId("FRUITS")).click();
	    Thread.sleep(3000);
//	    d.findElement(AppiumBy.androidUIAutomator
//	    		("new UiScrollabel(new UiSelector()).scrollIntoView(text(\"Apple\"))"));
	    d.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Apple\"))"));
	    Thread.sleep(3000);
	    d.findElement(By.xpath("(//android.view.View[@content-desc=\"ADD TO CART\"])[2]")).click();
	    d.findElement(By.xpath("//android.widget.TextView[2]")).click();
	    d.findElement(By.xpath("//android.widget.Button[@resource-id='addtocart']")).click();
	    d.navigate().back();
//	    Thread.sleep(3000);
//	    d.findElement(By.xpath("(//android.view.View[@content-desc=\"ADD TO CART\"])[4]")).click();
//	    
//	    d.findElement(By.xpath("//android.widget.Button[@resource-id='addtocart']")).click();
	
	
	    d.findElement(By.xpath("//android.view.View[@content-desc=\"\"]")).click();
	}

}
