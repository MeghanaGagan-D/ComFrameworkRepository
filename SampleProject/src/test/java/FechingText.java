import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FechingText {
	@Test
	public void fetchtext()
	 {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String Text = js.executeScript("return document.title").toString();
		System.out.println(Text);
	}
}

