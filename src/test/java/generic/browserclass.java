package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browserclass {
	
	static WebDriver driver;
	
	public static WebDriver Browsercall(String browser)
	{
		switch (browser) {
		case "chrome":driver=new ChromeDriver();
			
			break;
			
		case "edge":driver=new EdgeDriver();
		break;
		

		default:System.out.println("bye");
			break;
		}
		return driver;
	}

}
