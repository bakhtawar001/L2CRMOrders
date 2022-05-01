package CrmTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PageFactoryandTestdata.HelpingFunction;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StartBrowser extends HelpingFunction {


	public static void StartupBrowser(String Suite) throws InterruptedException, AWTException, IOException
		{
							System.setProperty("webdriver.chrome.silentOutput","true");
					        WebDriverManager.chromedriver().setup();
							ChromeOptions options = new ChromeOptions();
							options.addArguments("-incognito");
						  	options.addArguments("--disable-popup-blocking");
						  	options.addArguments("--disable-extensions");
						  	options.addArguments("--disable-dev-shm-usage");
						 	options.addArguments("--start-maximized");
							driver=new ChromeDriver(options);
							ExtentHtmlReporter htmlReporter;
							htmlReporter = new ExtentHtmlReporter(
									System.getProperty("user.dir") + "/Reports/" + Suite + ".html");
							extent = new ExtentReports();
							extent.attachReporter(htmlReporter);
							extent.setSystemInfo("HostName", "Bakhtawar");
							extent.setSystemInfo("Environment", "QA");
							extent.setSystemInfo("UserName", "Bakhtawar Malik");
							extent.setSystemInfo("URL", envirnment);
							htmlReporter.config().setDocumentTitle("Automation Testing Report");
							htmlReporter.config().setReportName("CRM Report");
							htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
							htmlReporter.config().setTheme(Theme.DARK);
							htmlReporter.getStartTime();
							htmlReporter.getEndTime();
							driver.get(envirnment);
							driver.manage().window().maximize();
							driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
							driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
							
		}
	}







