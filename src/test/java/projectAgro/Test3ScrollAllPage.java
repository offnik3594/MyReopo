package projectAgro;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class Test3ScrollAllPage extends BC {
	
	@Test
	void scrollhomepage()
	{
		((JavascriptExecutor)d).executeScript("mobile: scrollGesture",
				ImmutableMap.of("left",100,"top",100,
						"width",200,"height",200,"direction","down","percent",5.0));
		
		
		
		
		
		
		
	}

}
