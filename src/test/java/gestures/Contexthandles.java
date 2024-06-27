                                                                                                                      package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Contexthandles {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");
	
		URL url=new URL("http://127.0.0.1:4723");
		
		AndroidDriver d=new AndroidDriver(url,u);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(AppiumBy.accessibilityId("GeneralStore")).click();
        d.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        Thread.sleep(3000);
        WebElement ele = d.findElement(AppiumBy.androidUIAutomator
        ("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Albania\"))"));
        ele.click();
        Thread.sleep(3000);
        d.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("nsk");
	    d.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
	    d.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    
	    Thread.sleep(3000);
	    d.findElement(By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")).click();
	    d.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	    d.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	    Thread.sleep(4000);
	    
	    Set<String> con = d.getContextHandles();
	    int s=con.size();
	    System.out.println(s);
	    
	    for(String c:con)
	    {
	    	System.out.println(c);
	    }
	    
	    Thread.sleep(4000);
	    d.context("WEBVIEW_com.androidsample.generalstore");	    
	    Thread.sleep(4000);
	    d.findElement(By.name("q")).sendKeys("My photo");
	    d.findElement(By.id("q")).sendKeys(Keys.ENTER);
	    d.pressKey(new KeyEvent(AndroidKey.BACK));
	   
	
	}
}
