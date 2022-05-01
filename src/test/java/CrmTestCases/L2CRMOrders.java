package CrmTestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Functions.Conversions;
import Master.Level2HighLevelCRMOrdersChecks;
import PageFactoryandTestdata.CrmLocatiors;
import PageFactoryandTestdata.CrmTestData;
import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.OrdersLocators;
import PageFactoryandTestdata.OrdersTestdata;
import io.github.bonigarcia.wdm.WebDriverManager;

public class L2CRMOrders extends Level2HighLevelCRMOrdersChecks {
	 public static CrmLocatiors GetData = PageFactory.initElements(driver, CrmLocatiors.class);
	 public static OrdersLocators ordersData = PageFactory.initElements(driver, OrdersLocators.class);
	public static String Projectpath;
	static String parentWindow;
	public static String PurchaseOrderTextPreviewVerification;
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
	
	public static void login() throws InterruptedException, AWTException, IOException {
		
		//test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		Input("Please Enter ASI no", GetData.ASINo, PageFactoryandTestdata.configReader.getASINO());
		Input("Please Enter UserName", GetData.AsiUserName, PageFactoryandTestdata.configReader.getOrdersUser());
		Input("Please Enter Password", GetData.Password, PageFactoryandTestdata.configReader.getOrdersPassword());
		Click("Please click login button", GetData.LoginButton);
		
	}

	public static void IPAddress_Verification() throws InterruptedException, AWTException, IOException {
		CrmLocatiors GetData = PageFactory.initElements(driver, CrmLocatiors.class);
		Thread.sleep(5000);
		driver.get(CrmTestData.ADR);
		if (driver.getPageSource().contains("10.101.2.22")) {
			Thread.sleep(5000);
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	public static void UploadDSTFile_Orderlevel() throws IOException, InterruptedException, AWTException {
		try {
			SoftAssert softassertion = new SoftAssert();
			Click("a", ordersData.ESPWebHomePage_OrdersTab);
			Thread.sleep(10000);
			ordersData.CreateOrder_SalesOrderOption.click();
			// Select the company first on create order screen
			ordersData.CreateOrderScreen_CompanySearch_Textfield.click();
			Thread.sleep(2000);
			ordersData.CreateOrderScreen_CompanyField_SendData.sendKeys("Auto Supplier ASIQA I");
			Thread.sleep(6000);
			ordersData.CreateOrderScreen_CompanyField_SendData.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			// Select company from company dropdown
			ordersData.CreateOrderScreen_CompanyField_SendData.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			// Press the save button
			Click("Click at save button", ordersData.SampleRequestSaveButton);
			Level2HighLevelCRMOrdersChecks.waitForPageLoadSave();
			Thread.sleep(6000);
			ordersData.PushMenu.click();
			Thread.sleep(2000);
			ordersData.UploadFile.click();
			Thread.sleep(3000);

			Projectpath = System.getProperty("user.dir");
			System.out.println(Projectpath);
			ProcessBuilder pb = new ProcessBuilder(Projectpath + "/Img/upload.exe", Projectpath + "\\Img\\foil.DST");
			Thread.sleep(5000);
			pb.start();
			Thread.sleep(15000);
			waitForPageLoading();
			Thread.sleep(8000);
			Assert.assertTrue(ordersData.DSTFileVerification.isDisplayed());
			softassertion.assertAll();
			ordersData.PushMenu.click();
			Thread.sleep(2000);
			Conversions.OrdernumberRegularExpressionStringConversion();

		} catch (NoSuchElementException e) {
			e.getStackTrace();
		}

	}
	public static void Product_Added_To_Order() throws InterruptedException, IOException {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Thread.sleep(3000);
			// Press Add Product Button
			Click("a", ordersData.CreateOrder_AddProductButton);
			Level2HighLevelCRMOrdersChecks.waitForElementNotVisible(120, driver, ordersData.SpinnerLoader);
			Thread.sleep(2000);
			// Go To Product Search Tab in popup
			ordersData.CreateOrder_AddProductPopup_ProductSearchTab.click();
			Level2HighLevelCRMOrdersChecks.waitForElementNotVisible(120, driver, ordersData.SpinnerLoader);
			// Search the Product which want to associate with order
			ordersData.CreateOrder_AddProductPopup_SearchKeywordField.sendKeys(OrdersTestdata.OrderProduct);
			Level2HighLevelCRMOrdersChecks.waitForElementNotVisible(120, driver, ordersData.SpinnerLoader);
			// Now press Search Button
			ordersData.CreateOrder_AddProductPopup_SearchButton.click();
			wait = new WebDriverWait(driver, 180);
			wait.until(
					ExpectedConditions.elementToBeClickable(ordersData.CreateOrder_AddProductPopup_ProductSelection));
			// Now Select the Product
			ordersData.CreateOrder_AddProductPopup_ProductSelection.click();
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",
					ordersData.CreateOrder_AddProductPopup_AddProductsButton);
			// Press the Add Products Button to complete the process
			ordersData.CreateOrder_AddProductPopup_AddProductsButton.click();
			Level2HighLevelCRMOrdersChecks.waitForElementNotVisible(120, driver, ordersData.SpinnerLoader);
			String ProductAddedToOrderSuccess = ordersData.CreateOrder_ProductAddedToOrder_Successfull.getText();
			Thread.sleep(2000);
			Assert.assertTrue(ProductAddedToOrderSuccess.contains("Success"));

		} catch (NoSuchElementException e) {
			e.getMessage();
		}

	}
	public static void Purchase_Order_Preview_Verification() throws IOException, InterruptedException, ParseException {
		try {

			// Press the Preview Button on order details
			Click("Click Function", ordersData.PreviewButton_Orderdetails);
			waitForPageLoading();
			Thread.sleep(3000);
			// Press the Purchase Order document
			Click("a",ordersData.PreviewPopUp_PurchaseOrder);
			Thread.sleep(3000);
			// Select the Purchase Order Option
			Click("a", ordersData.PreviewPopup_PurchaseOrderSelection);
			waitForPageLoading();
			Thread.sleep(3000);
			// First store parent window to switch back
			parentWindow = driver.getWindowHandle();
			// Press the Preview Button
			ordersData.PreviewPopUp_PreviewButton.click();
			// Switch to new window opened
			for (String winHandle : driver.getWindowHandles()) {
				if (!winHandle.equals(parentWindow)) {
					driver.switchTo().window(winHandle);
				}
			}

			Thread.sleep(10000);
			PurchaseOrderTextPreviewVerification = ordersData.PurchaseOrder_Preview_PurchaseOrderNumberVerification
					.getText();
			System.out.println(PurchaseOrderTextPreviewVerification);
			// Validate the OrderNumber
			Assert.assertTrue(PurchaseOrderTextPreviewVerification.contains("Purchase Order"));

		} catch (NoSuchElementException e) {
			e.getMessage();
		}
	}
	public static void PurchaseOrder_Preview_POSend() throws InterruptedException, IOException {
		try {
			SoftAssert Softassertion = new SoftAssert();
			Thread.sleep(6000);
			// Validating the PO Sending Mail Process to check if the mail sending
			// successfully or not
			ordersData.PO_SendButton.click();
			//
			if (!ordersData.Send_PO_ToandCCRemoveIcon.isDisplayed()) {
				driver.navigate().refresh();
				ordersData.PO_SendButton.click();
			}
			wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions
					.elementToBeClickable(ordersData.Send_PO_ToandCCRemoveIcon));
			ordersData.Send_PO_ToandCCRemoveIcon.click();

			// Insert a new Email address in To Field
			ordersData.SendPO_To_Field.sendKeys("bnazir@asicentral.com");
			Thread.sleep(2000);
			ordersData.SendPO_To_Field.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			// Press the send button and validate as if the Success message displayed or not
			ordersData.PO_SendButton.click();
			Thread.sleep(1000);
			Assert.assertTrue(ordersData.CreateOrder_ProductAddedToOrder_Successfull.getText()
					.contains("Success"));
			Softassertion.assertAll();
			Thread.sleep(5000);
			driver.close();
			Thread.sleep(2000);
			// Switch back to parent window
			driver.switchTo().window(parentWindow);

		} catch (NoSuchElementException e) {
			e.getMessage();
		}

	}
	public static void Email_PurchaseOrder() throws InterruptedException, AWTException, IOException {

		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		Click("Please click at Email button", GetData.NavigateToEmails);
		Thread.sleep(2000);
		Input("Provide Order no", GetData.SearchEmail, Conversions.Orderno);
		Thread.sleep(5000);
		List<WebElement> SearchEmailResult = driver.findElements(By
				.xpath("//div[contains(@ng-click,'::vm.go(email.Id)')]//div[contains(@class,'col-xs-7 word-break')]"));
		int SearchEmailResultSize = SearchEmailResult.size();
		if (SearchEmailResultSize > 0) {
			String SearchEmailResultText = driver.findElement(By.xpath(
					"//div[contains(@ng-click,'::vm.go(email.Id)')]//div[contains(@class,'col-xs-7 word-break')]"))
					.getText();
			System.out.println(SearchEmailResultText);
			Assert.assertTrue(SearchEmailResultText.contains(Conversions.Orderno));
		} else {
			Assert.assertTrue(false);
		}

	}
	public static void Percentage_square_in_Orders_SummaryWidget_ToolTip_Text_Verification()
			throws IOException, InterruptedException, AWTException {
		try {

			// Go to Dashboard Tab
			ordersData.Dasboard_Tab.click();
			Level2HighLevelCRMOrdersChecks.waitForElementToBeClickable_Xpath(120, driver, ordersData.Percentage_Dashboard_Icon);
			Thread.sleep(3000);
			Hover(ordersData.Percentage_Dashboard);
			Thread.sleep(3000);
			Assert.assertTrue(ordersData.YearlySummary_Percentage_ToolTipText_Verification.isDisplayed());

		} catch (NoSuchElementException e) {

			System.err.println("NoSuchElementException: " + e.getMessage());
		}

	}
	public static void Percentage_circle_inOrdersSummary_Widget_ToolTip_Text_Verification()
			throws IOException, InterruptedException, AWTException {
		try {

			Hover(ordersData.Ordersummary_Dashboard_Percentage);
			Thread.sleep(3000);
			Assert.assertTrue(ordersData.OrderSummary_ToolTip_Text_Verification.isDisplayed());

		} catch (NoSuchElementException e) {

			System.err.println("NoSuchElementException: " + e.getMessage());
		}

		finally {
			ordersData.Orders_Title_Tab.click();

			Thread.sleep(3000);
		}

	}
	


}
