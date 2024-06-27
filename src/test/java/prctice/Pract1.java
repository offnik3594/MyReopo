package prctice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Pract1 {
	
	
	@Test
	void login() throws MalformedURLException, InterruptedException {
		UiAutomator2Options u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");

		URL url=new URL("http://127.0.0.1:4723");
		
		AndroidDriver d = new AndroidDriver(url, u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(AppiumBy.accessibilityId("Swaraj AgroTech")).click();
	    Thread.sleep(5000);
		
		
		
		
		
		
		d.findElement(By.xpath("//android.view.View[@content-desc=\"\"]")).click();
		Thread.sleep(5000);
		WebElement e1 = d.findElement(By.xpath("//android.widget.EditText[@resource-id='mobileNo']"));
		e1.clear();
		e1.sendKeys("9096729266");
		WebElement e2 = d.findElement(By.xpath("//android.widget.EditText[@resource-id='password']"));
		e2.clear();
		e2.sendKeys("Nik@1234");
		d.findElement(By.xpath("//android.widget.Button[@text='LOGIN']")).click();
		String text = d.findElement(By.id("android:id/message")).getText();
		Assert.assertEquals("LogIn Done Succefully!", text);
		d.findElement(By.id("android:id/button1")).click();
	
	}
}
