package gestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ScrollBrowser {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		UiAutomator2Options u=new UiAutomator2Options();
		u.setPlatformName("Android");
		u.setDeviceName("OPPO CPH1933");
		u.setChromedriverExecutable("D:\\velocitytraining\\setups\\Eclipse_2022_06\\Eclipse_2022_06_WorkSpace\\ZFrameworkJST\\Drivers\\chromedriver.exe");
	    u.setCapability("browserName", "Chrome");
	    
	    URL url=new URL("http://127.0.0.1:4723");
	    
	    AndroidDriver d=new AndroidDriver(url,u);
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    d.get("https://demo.automationtesting.in/Register.html");
	    
	    Thread.sleep(5000);
	    
	   ((JavascriptExecutor)d).executeScript("window.scrollTo(0,1500)");
	    
	   WebElement e= d.findElement(By.id("yearbox"));
	    Select s=new Select(e);
	    s.selectByValue("1994");
	    Thread.sleep(3000);
	    
	    WebElement em= d.findElement(By.xpath("//select[@placeholder='Month']"));
	    Select sm=new Select(em);
	    sm.selectByValue("May");
	    Thread.sleep(3000);
	    
	    WebElement ed= d.findElement(By.id("daybox"));
	    Select sd=new Select(ed);
        sd.selectByValue("3");
	   
	    
	}

}
