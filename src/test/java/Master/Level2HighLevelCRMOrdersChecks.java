package Master;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import PageFactoryandTestdata.CrmTestData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.common.base.Predicate;
import PageFactoryandTestdata.OrdersLocators;
import PageFactoryandTestdata.CrmLocatiors;
import PageFactoryandTestdata.HelpingFunction;
import CrmTestCases.L2CRMOrders;
import CrmTestCases.StartBrowser;

public class Level2HighLevelCRMOrdersChecks extends HelpingFunction {

	static String Suite = "Orders_Level2Report";
	static Predicate<WebDriver> pageLoaded;
	@BeforeTest
	public void Startup() throws InterruptedException, AWTException, IOException {
		StartBrowser.StartupBrowser(Suite);
	}

	@Test(priority = 0,description = "Validate that user is able to login with orders application successfully")
	public void LoginIdaho() throws InterruptedException, AWTException, IOException {
		L2CRMOrders.login();
	}

	@Test(priority = 2,description = "Validate that user is able to upload DSTFile successfully")
	public void UploadDSTFiles_Orderlevel() throws IOException, InterruptedException, AWTException {
		OrdersLocators GetData = PageFactory.initElements(driver, OrdersLocators.class);
		GetData.Orders.click();
		Thread.sleep(2000);
		L2CRMOrders.UploadDSTFile_Orderlevel();
	}

	@Test(priority = 3,description = "Validate that user is able to Add product in order")
	public void Product_AddedTo_Order() throws IOException, InterruptedException, AWTException {
		L2CRMOrders.Product_Added_To_Order();
	}

	@Test(priority = 4,description = "Validate that user is able to preview purchase order document successfully")
	public void Purchase_OrderPreview_Verification() throws IOException, InterruptedException, ParseException {
		L2CRMOrders.Purchase_Order_Preview_Verification();
	}

	@Test(priority = 5,description = "Validate that user is able to send purchase order document")
	public void PurchaseOrder_PreviewPOSend() throws IOException, InterruptedException, ParseException {
		L2CRMOrders.PurchaseOrder_Preview_POSend();
	}

	@Test(priority = 6,description = "Validate that user is able to view PO sent email under CRM")
	public void Access_CRM_PurchaseOrderEmailsValidation() throws IOException, InterruptedException, AWTException {
		CrmLocatiors GetData = PageFactory.initElements(driver, CrmLocatiors.class);
		OrdersLocators GetDataOrders = PageFactory.initElements(driver, OrdersLocators.class);
		GetData.ClosePreviewPopup.click();
		Thread.sleep(2000);
		GetDataOrders.Cancel.click();
		Click("a", GetData.CRM);
		Thread.sleep(5000);
		L2CRMOrders.Email_PurchaseOrder();
	}

	@Test(priority = 7,description = "Validate that user is able to view summary widget tooltip in orders")
	public void Percentage_square_in_Orders_SummaryWidget_ToolTip_TextVerification()
			throws IOException, InterruptedException, AWTException {
		OrdersLocators GetData = PageFactory.initElements(driver, OrdersLocators.class);
		Thread.sleep(5000);
		GetData.Orders.click();
		Thread.sleep(2000);
		L2CRMOrders.Percentage_square_in_Orders_SummaryWidget_ToolTip_Text_Verification();
	}

	@Test(priority = 8,description = "Validate the summary widget tooltip text")
	public void Percentage_circle_inOrdersSummary_Widget_ToolTip_TextVerification()
			throws IOException, InterruptedException, AWTException {
		OrdersLocators GetData = PageFactory.initElements(driver, OrdersLocators.class);
		Thread.sleep(5000);
		GetData.Orders.click();
		Thread.sleep(2000);
		L2CRMOrders.Percentage_circle_inOrdersSummary_Widget_ToolTip_Text_Verification();
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		test = extent.createTest(result.getName());
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getMethod().getDescription());
			test.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + "Test Case is Passed", ExtentColor.GREEN));
			extent.flush();
		}
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getMethod().getDescription());
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue",
					ExtentColor.RED));
			test.fail(result.getThrowable());
			extent.flush();
		}

	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}
	public static void waitForPageLoadSave() throws InterruptedException {
		wait = new WebDriverWait(driver, 120);
		pageLoaded = new Predicate<WebDriver>() {

			public boolean apply(WebDriver input) {
				return ((JavascriptExecutor) input).executeScript("return document.readyState").toString()
						.equals("complete");
			}

		};
		System.out.println("Page Loading...");
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//div[contains(@ng-class,'blockUiMessageClass')][contains(text(),'Saving')]"))
				.isDisplayed()) {
			waitForPageLoadSave();
		}
	}
	public static String waitForElementNotVisible(int timeOutInSeconds, WebDriver driver, String elementXPath) {
		if ((driver == null) || (elementXPath == null) || elementXPath.isEmpty()) {

			return "Wrong usage of WaitforElementNotVisible()";
		}
		try {
			(new WebDriverWait(driver, timeOutInSeconds))
					.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementXPath)));
			return null;
		} catch (TimeoutException e) {
			return "Build your own errormessage...";
		}
	}
	public static String waitForElementToBeClickable_Xpath(int timeOutInSeconds, WebDriver driver,
			String elementXPath) {
		if ((driver == null) || (elementXPath == null) || elementXPath.isEmpty()) {

			return "Wrong usage of WaitforElementNotVisible()";
		}
		try {
			(new WebDriverWait(driver, timeOutInSeconds))
					.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXPath)));
			return null;
		} catch (TimeoutException e) {
			return "Build your own errormessage...";
		}
	}
}
