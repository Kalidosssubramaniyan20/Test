package DominosRunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kutty\\eclipse-workspace\\Dominos\\src\\test\\java\\Dominos\\feature\\Dominos.feature",glue = "",dryRun =false)





public class DominosRunner {
	
	public static WebDriver driver1;
	
	
	@BeforeClass
	public static void start() {
		driver1=new FirefoxDriver();

}
	
}
