package projectAgro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Test4CartValue extends BC {
	
	@Test
	void cartAddingAddition() throws InterruptedException
	{
    d.findElement(AppiumBy.accessibilityId("FRUITS")).click();
    Thread.sleep(3000);
    d.findElement(By.xpath("(//android.view.View[@content-desc=\"ADD TO CART\"])[2]")).click();
	
	}
}
