package PageFactoryandTestdata;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//public class CrmLocatiors extends CRMExecution{
public class CrmLocatiors {

	@FindBy(id = "txtAsiNum")
	public WebElement ASINo;
	@FindBy(id = "txtUserName")
	public WebElement AsiUserName;
	@FindBy(id = "txtPassword")
	public WebElement Password;
	@FindBy(xpath = "//input[contains(@onclick,'LoginUser()')]")
	public WebElement LoginButton;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public WebElement LogoutButton;

	@FindBy(linkText = "CRM")
	public WebElement CRM;
	@FindBy(xpath = "//a[contains(text(),'ESP Web')]")
	public WebElement ESPWeb;

//Company Creation
	@FindBy(xpath = "//tfoot/tr[1]/td[3]/strong" + "[0]")
	public WebElement a;

	@FindBy(xpath = "//a[contains(@class,'btn btn-primary')]")
	public WebElement AddComp;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.currentCompany.Name')]")
	public WebElement CompName;
	@FindBy(xpath = "//input[contains(@ng-model, 'phone.Number')]")
	public WebElement PhoneNo;
	@FindBy(xpath = "//input[contains(@ng-model, 'email.Address')]")
	public WebElement EmailAddress;
	@FindBy(xpath = "//input[contains(@ng-model, 'website.Url')]")
	public WebElement Website;
	@FindBy(xpath = "//input[contains(@value, 'Everyone')]")
	public WebElement DefaultVisi1;
	@FindBy(xpath = "//input[contains(@value, 'Owner')]")
	public WebElement UpdateVisibility;
	@FindBy(xpath = "//a[contains(text(), 'Billing Information')]")
	public WebElement BillingInformation;
	@FindBy(xpath = "//div[contains(@ng-model, 'CreditTerm')]/div/span")
	public WebElement OpenTerms;
	@FindBy(xpath = "//div[contains(text(), 'Net 15')]")
	public WebElement SelectTerms;
	@FindBy(xpath = "//div[contains(@ng-model, 'PaymentMethod')]/div/span")
	public WebElement OpenPayWith;
	@FindBy(xpath = "//div[contains(text(), 'MasterCard')]")
	public WebElement SelectPayWith;
	@FindBy(xpath = "//div[contains(@ng-model, 'shippingAccount.Type')]/div/span")
	public WebElement OpenShipVia;

	@FindBy(xpath = "//div[contains(text(), 'Ground')]")
	public WebElement SelectShipVia;
	@FindBy(xpath = "//input[contains(@ng-model, 'shippingAccount.Number')]")
	public WebElement ShipAccountNo;

	@FindBy(xpath = "//input[contains(@ng-model, 'searchParams.selectAll')]")
	public WebElement SelectCompanies;
	@FindBy(xpath = "//button[contains(text(), 'Actions')]")
	public WebElement Actions;
	@FindBy(xpath = "//ng-content[contains(text(), 'Change Record Owner')]")
	public WebElement ChangeRecordsOwner;
	@FindBy(xpath = "//ng-content[contains(text(), 'Set Visibility')]")
	public WebElement SetVisibility;

	@FindBy(xpath = "//span[contains(@ng-hide, '$select.isEmpty() && !showEmpty')]")
	public WebElement SelectedUser;
	@FindBy(xpath = "//button[contains(@ng-click, 'vm.save()')]")
	public WebElement SaveRecordOwner;

	@FindBy(xpath = "//label[contains(@ng-repeat, 'role in vm.companyRoles')]")
	public WebElement CompanyRoles;
	@FindBy(xpath = "//span[contains(text(), '")
	public WebElement CompanySupplierRoleFpart;
	@FindBy(xpath = "')]//../input[contains(@type, 'checkbox')]")
	public WebElement CompanySupplierRoleLpart;

	@FindBy(xpath = "//input[contains(@ng-model, 'searchParams.selectAll')]")
	public WebElement SelectAllCheckbox;

	@FindBy(xpath = "//a[contains(@ui-sref, 'companies.company.view')][contains(text(), 'Orders')]")
	public WebElement CompanyOrder;
	@FindBy(xpath = "//ng-content[contains(@translate, 'BUTTONS.CREATE_ORDER')]")
	public WebElement CreateCompanyOrder;

	@FindBy(xpath = "//button[contains(@id,'close-order')]")
	public WebElement CloseOrder_Icon;

	@FindBy(xpath = "//uib-tab-heading[contains(text(), 'All Companies')]")
	public WebElement AllCompanies;
	@FindBy(xpath = "//uib-tab-heading[contains(text(), 'Customers')]")
	public WebElement Customer;
	@FindBy(xpath = "//uib-tab-heading[contains(text(), 'Suppliers')]")
	public WebElement Supplier;
	@FindBy(xpath = "//uib-tab-heading[contains(text(), 'Decorators')]")
	public WebElement Decorators;
	@FindBy(xpath = "//uib-tab-heading[contains(text(), 'Prospects')]")
	public WebElement Prospects;
	@FindBy(xpath = "//*[contains(@placeholder, 'Enter or Select')]/span/i")
	public WebElement OpenRecordDD;
	/*
	 * @FindBy(xpath="//span[contains(@aria-label, 'Choose a User activate')]/i")
	 * public WebElement OpenRecordDD;
	 * 
	 * @FindBy(xpath="//span[contains(@aria-label, 'Select a Link activate')]")
	 * public WebElement SelectALink;
	 */

	@FindBy(xpath = "//*[contains(@id, 'ui-select-choices-row')]")
	public List<WebElement> GetNoOfRecords;
	@FindBy(xpath = "//*[contains(@id, 'ui-select-choices-row')]")
	public WebElement Getid;
	@FindBy(xpath = "//*[contains(@aria-label, 'Choose a User activate')]/span[2]")
	public WebElement GetSelectedROwn;

//	@FindBy(xpath="//span[contains(text(), 'Record Owner:')]") public WebElement ROwner;
//	@FindBy(xpath="//ng-content[contains(text(), 'Record Owner')]/following-sibling::text()[1]") public WebElement ROwner;
	@FindBy(xpath = "//ng-content[contains(text(), 'Record Owner')]/parent::span | //span[contains(text(), 'Record Owner')]")
	public WebElement ROwner;

	String test = "ui-select-choices-row-3-3";

//	@FindBy(xpath="//button[contains(@ng-click, 'vm.confirmSaveCompany')]") public WebElement SaveComp;
// Add company Address
	@FindBy(xpath = "//a[contains(@href, '/addressbook')]")
	public WebElement AddressBook;
	@FindBy(xpath = "//button[contains(@ng-click, 'vm.openAddressModal()')]")
	public WebElement AddAdress;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.address')]")
	public WebElement AddressName;
//	@FindBy(xpath="//input[contains(@ng-model, 'vm.address.Line1')]") public WebElement Address;
	@FindBy(xpath = "//input[contains(@placeholder, 'Enter or Choose Address')]")
	public WebElement Address;

	@FindBy(xpath = "//input[contains(@type, 'tel')]")
	public WebElement AddressPhone;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.address.IsPrimary')]")
	public WebElement MakePrimary;

	@FindBy(xpath = "//*[contains(text(), 'Save')]")
	public WebElement SaveAddress;
	@FindBy(xpath = "//a[contains(@ng-click, 'vm.save(')]")
	public WebElement SaveSettingsAddress;

//	@FindBy(xpath="//div[contains(@ng-show, 'address.Line')]") public WebElement GetPriAdd;
	@FindBy(xpath = "//div[contains(@ng-show, '.Line')][@class='ng-binding']")
	public WebElement GetPriAdd;

	@FindBy(xpath = "//*[contains(text(), 'Companies')]")
	public WebElement NavigatetoCompanies;
	@FindBy(xpath = "//input[contains(@ng-model, 'searchTerm')]")
	public WebElement CompaniesSearchField;
	@FindBy(xpath = "//div[contains(@class, 'item-title white-space-pre word-break ng-binding')]")
	public WebElement ClickCompanyName;
	@FindBy(xpath = "//a[contains(text(), 'Billing Information')]")
	public WebElement BillingInfoLink;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.currentCompany.IsTaxExempt')]")
	public WebElement ExemptCheckbox;

	/*
	 * @FindBy(xpath="//a[contains(@href, 'tel:')]") public WebElement
	 * GetCompanyPhone;
	 * 
	 * @FindBy(xpath="//a[contains(@href, 'mailto:')]") public WebElement
	 * GetCompanyEmail;
	 * 
	 * @FindBy(xpath="//a[contains(@target, '_website')]") public WebElement
	 * GetCompany;
	 */

	@FindBy(xpath = "//i[contains(@class, 'fa fa-pencil')]")
	public WebElement EditComp;

// Sales Tax Settings

	@FindBy(xpath = "//img[contains(@src, 'https://www.gravatar.com')]")
	public WebElement aviator;
	@FindBy(xpath = "//a[contains(@ui-sref, 'settings')]")
	public WebElement settings;
	@FindBy(xpath = "//a[contains(@href, '/account/logoff')]")
	public WebElement logout;

	@FindBy(xpath = "//a[contains(@href, '/settings/sales-tax')]")
	public WebElement salestax;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.autoCalculateRates')]")
	public WebElement autotax;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.chargeTaxesOnShipping')]")
	public WebElement shiptax;
	@FindBy(xpath = "//div[contains(@class, 'row margin-top-10')]")
	public WebElement getalladdresses;

	@FindBy(xpath = "//a[contains(@href, '/settings/relationships')]")
	public WebElement Relationships;
	@FindBy(xpath = "//tr[contains(@ng-repeat, 'relationship in LinkRelationshipTypes')]")
	public List<WebElement> GetNoOfRshipRows;

	@FindBy(xpath = "//button[contains(@title, 'Delete')]/i")
	public List<WebElement> GetNoOfAddress;
	@FindBy(xpath = "//button[contains(@title, 'Delete')]/i")
	public WebElement DelIcon;
	@FindBy(xpath = "//button[contains(@ng-class, 'vm.confirmButtonClass')]")
	public WebElement ConfirmDel;

	@FindBy(xpath = "//a[contains(@ng-click, 'addRelationship()')]")
	public WebElement AddRelatonShip;
	@FindBy(xpath = "//input[contains(@name, 'forward')]")
	public WebElement RShipFarward;
	@FindBy(xpath = "//input[contains(@name, 'forwardTitle')]")
	public WebElement RShipFarwardTitle;
	@FindBy(xpath = "//input[contains(@name, 'reverse')]")
	public WebElement RShipReverse;
	@FindBy(xpath = "//input[contains(@name, 'reverseTitle')]")
	public WebElement RShipReverseTitle;
	@FindBy(xpath = "//input[contains(@id, 'forPerson')]")
	public WebElement RShipForContact;
	@FindBy(xpath = "//input[contains(@id, 'forCompany')]")
	public WebElement RShipForCompany;
	@FindBy(xpath = "//button[contains(@ng-click, 'save(relationshipForm.$valid)')]")
	public WebElement SaveRship;

	@FindBy(xpath = "//a[contains(@href, '/settings/teams')]")
	public WebElement Teams;
	@FindBy(xpath = "//tr[contains(@ng-repeat, 'team in vm.resultList.items')]")
	public List<WebElement> GetNoOfTeamRows;

	@FindBy(xpath = "//button[contains(@ng-click, 'vm.openTeamModal()')]")
	public WebElement AddteamButton;
	@FindBy(xpath = "//input[contains(@placeholder, 'Team Name')]")
	public WebElement TeamName;
	@FindBy(xpath = "//button[contains(@ng-click, 'vm.save(memberForm.$valid)')]")
	public WebElement SaveTeam;
	@FindBy(xpath = "//input[contains(@ng-model,'vm.teams.searchTerm')]")
	public WebElement VerifyTeam;

	@FindBy(xpath = "//a[contains(text(), 'Default Tasks')]")
	public WebElement DefaultTasks;
	@FindBy(xpath = "//button[contains(@ng-click,'vm.editDefaultTasks()')]")
	public WebElement AddDefaultTask;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.defaultTask.Name')]")
	public WebElement DefaultTaskName;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.defaultTask.DueInBusinessDays')]")
	public WebElement DefaultTaskDueDate;
	@FindBy(xpath = "	//*[contains(text(), 'Cancel')]")
	public WebElement CancelTask;

	@FindBy(xpath = "//input[contains(@ng-model, 'vm.defaultTask.SalesOrder')]")
	public WebElement DefaultTaskSalesOrderCheckbox;
	@FindBy(xpath = "//i[contains(@class,'fa fa-calendar-check-o')]")
	public WebElement OpenTaskInSidebar;

	@FindBy(xpath = "//div[contains(@class,'modal-footer ng-scope')]/button[contains(@translate,'BUTTONS.SAVE')]")
	public WebElement SaveTask_OrderTaskbar;

	@FindBy(xpath = "//select[contains(@ng-model,'vm.defaultTask.Visibility')]/option[contains(@selected,'selected')]")
	public WebElement DefaultTaskForm_Visibility_Private;
	@FindBy(xpath = "//select[contains(@ng-model,'vm.defaultTask.Visibility')]/option[contains(@selected,'selected')]")
	public WebElement DefaultTaskForm_Visibility_Public;
	@FindBy(xpath = "//select[contains(@ng-model,'vm.model.Visibility')]/option[contains(@selected,'selected')]")
	public WebElement DefaultTaskForm_Visibility_Private_Order;
	@FindBy(xpath = "//select[contains(@ng-model,'vm.model.Visibility')]/option[contains(@selected,'selected')]")
	public WebElement DefaultTaskForm_Visibility_Public_Order;
	@FindBy(xpath = "//Select[contains(@ng-model,'vm.model.Visibility')]")
	public WebElement DefaultTaskForm_SelectVisibility;
	@FindBy(xpath = "//a[contains(text(),'Default Item Visibility')]")
	public WebElement DefaultItemVisibilty;
	@FindBy(xpath = "//td[contains(@class,'col-xs-6')]//label[contains(text(),'Private')]")
	public WebElement TaskDefaultItemVisibilty_Private;
	@FindBy(xpath = "//td[contains(@class,'col-xs-6')]//label[contains(text(),'Public')]")
	public WebElement TaskDefaultItemVisibilty_Public;
	@FindBy(xpath = "	//a[contains(text(),'Save')]")
	public WebElement TaskDefaultItemVisibilty_Save;
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement TaskDefaultItemVisibilty_Cancel;
	@FindBy(xpath = "//tbody/tr[11]/td/div/label[contains(text(),'Creator Only')]")
	public WebElement PresentationDefaultVisibility;
	@FindBy(xpath = "//tbody/tr[11]/td/div/label[contains(text(),'Everyone')]")
	public WebElement PresentationEveryoneVisibility;

//Inactive Company

	@FindBy(xpath = "//ng-content[contains(@class, 'ng-scope ng-binding')]")
	public WebElement ActiveDropDown;
	@FindBy(xpath = "//ng-content[contains(@translate, 'STATUS_INACTIVE')][contains(@class, 'ng-scope ng-binding')]")
	public WebElement InactiveLink;

	@FindBy(xpath = "//ng-content[contains(@class, 'ng-scope ng-binding')][text()='All']")
	public WebElement AllFilter;
	@FindBy(xpath = "//ng-content[contains(text(), 'Active')]")
	public WebElement ActiveFilter;
	@FindBy(xpath = "//ng-content[contains(text(), 'Inactive')]")
	public WebElement InactiveFilter;
	@FindBy(xpath = "//ng-content[contains(text(), 'Status')]")
	public WebElement Status;

	@FindBy(xpath = "//a[contains(@ng-click, 'changeStatusOfSelected(status)')]/ng-content[contains(text(), 'Inactive')]")
	public WebElement InactiveFromDB;

	@FindBy(xpath = "//div[contains(@class, 'well well-sm text-center ng-scope')]")
	public WebElement ResultFound;

	@FindBy(xpath = "//tfoot/tr/td[2]/p[3]")
	public WebElement CalculatedTax;

	@FindBy(xpath = "//i[contains(@class, 'caret pull-right')]")
	public WebElement testing;

	// Add company Notes

//	@FindBy(xpath="//a[contains(@href, 'notes')][@ng-bind-html='tab.title']") public WebElement Notes;
//	@FindBy(xpath="//a[contains(@href, 'notes')][@class='ng-binding']") public WebElement Notes;
	@FindBy(xpath = "//a[contains(@class, 'ng-binding')][contains(@href, 'notes')]")
	public WebElement Notes;

//	@FindBy(xpath="//a[contains(text(), 'Orders')][@class='ng-binding']") public WebElement Orders;
	@FindBy(xpath = "//a[contains(text(), 'Orders')]")
	public WebElement Orders;

	@FindBy(xpath = "//div[contains(@class,'btn-group dropdown')]/a")
	public WebElement CreateOrder;

	@FindBy(xpath = "//a[contains(@href, 'orders')][@class='ng-binding']")
	public WebElement Ordertab;
	@FindBy(xpath = "//button[contains(text(), 'Create Order')]")
	public WebElement CreateOrderButton;
	@FindBy(xpath = "//li[contains(@ng-model,'vm.companyTabs')]/descendant::span[contains(text(),'Orders')]")
	public WebElement CompanyOrdertab;

	// Add Product

	@FindBy(xpath = "//button[contains(text(),'Add Product')]")
	public WebElement CreateOrder_AddProductButton;

	@FindBy(xpath = "//a[contains(text(),'Product Search')]")
	public WebElement CreateOrder_AddProductPopup_ProductSearchTab;

	@FindBy(name = "keywords")
	public WebElement CreateOrder_AddProductPopup_SearchKeywordField;

	@FindBy(xpath = "//i[contains(@class,'fa fa-search')]")
	public WebElement CreateOrder_AddProductPopup_SearchButton;

	@FindBy(css = "body > div.modal.modal-xl.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.modal-body-scroll.ng-scope > div > div > div.tab-pane.ng-scope.active > div.product-container.ng-scope > div > div > div > div:nth-child(1) > div")
	public WebElement CreateOrder_AddProductPopup_ProductSelection;

	@FindBy(xpath = "//button[contains(text(),'Add Products')]")
	public WebElement CreateOrder_AddProductPopup_AddProductsButton;

	@FindBy(xpath = "//div[contains(text(),'Loading')] | //div[contains(text(),'Saving')]")
	public String SpinnerLoader;

	@FindBy(xpath = "//div[contains(*,'Loading ...')]")
	public String DesignSpinnerLoader;

	@FindBy(css = "#toast-container")
	public WebElement CreateOrder_ProductAddedToOrder_Successfull;

	// Configuration Locators

	@FindBy(xpath = "//button[contains(@ng-click, 'vm.back(vm.fromLocation)')]")
	public WebElement Backbutton1;

	@FindBy(xpath = "//button[contains(@ng-click,'vm.cancel()')]")
	public WebElement ClosePreviewPopup;

	@FindBy(xpath = "//button[contains(text(),'Configure')]")
	public WebElement OrdersDetails_Configure;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	public WebElement Continuebutton;

	@FindBy(xpath = "//button[contains(@ng-click,'vm.openProductModal')]")
	public WebElement OrdersDetails_EditButton;

	@FindBy(xpath = "//a[contains(text(),'Decoration')]")
	public WebElement Orderdetails_DecorationTab;
	@FindBy(xpath = "//span[contains(@class,'btn btn-default form-control ui-select-toggle')]//span[contains(text(),'Select')]")
	public WebElement DecorationDropDown;

	@FindBy(xpath = "	//button[contains(@ng-click,'vm.cancel()')]")
	public WebElement CloseProductWindow;

	@FindBy(xpath = "//button[contains(@ng-click,'vm.close()')]")
	public WebElement Cancelorder;
	// button[contains(@ng-click,'vm.cancel()')]

	// button[contains(text(),'Configure')]
	@FindBy(xpath = "//button[contains(@ng-click,'addServiceCharge')]")
	public WebElement ProductConfiguration_AddChargeLinkText;

	@FindBy(xpath = "//input[contains(@ng-model,'column.Variant.Quantity')]")
	public WebElement ProductConfiguration_AddCharge_QTY;

	@FindBy(css = "body > div:nth-child(1) > div > div > div.modal-body.ng-scope > form > div > div.col-sm-9.col-md-9 > div > div > div.tab-pane.ng-scope.active > div > fieldset > service-charges > div > table > tbody > tr > td.item-cost > input")
	public WebElement ProductConfiguration_AddCharge_NetCost;

	@FindBy(xpath = "//div[contains(@class,'action')]//button[contains(text(),'Save')]")
	public WebElement ProductConfiguration_AddCharge_SaveButton;

	@FindBy(xpath = "//button[contains(@ng-click,'vm.save(false, true)')]")
	public WebElement SampleRequestSaveButton;

	@FindBy(xpath = "//li[contains(@ui-sref-active, 'active')][4]/a")
	public WebElement MainNotes;
	@FindBy(xpath = "//button[contains(@ng-click, 'vm.addNote()')]")
	public WebElement AddCompNoteButton;
	@FindBy(xpath = "//button[contains(@ng-click, 'vm.editNote(note)')]/i")
	public WebElement EditCompNoteButton;
	@FindBy(xpath = "//button[contains(@confirm-method,'vm.removeNote(note)')]")
	public WebElement RemoveCompNoteButton;
	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	public WebElement OK;

	@FindBy(xpath = "//a[contains(@class, 'btn btn-primary')]")
	public WebElement AddNoteButtonFromMain;
	@FindBy(xpath = "//textarea[contains(@name, 'content')]")
	public WebElement NoteContent;
	@FindBy(xpath = "//button[contains(text(), 'Save')]")
	public WebElement SaveNote;
	@FindBy(xpath = "//div[contains(@class, 'word-break item-title multiline-note-content ng-binding')]")
	public WebElement GetNoteCont;
	@FindBy(xpath = "//div[contains(@class, 'word-break item-title cursor-pointer multiline-note-content ng-binding')]")
	public WebElement GetMainNoteContent;

	// Default Task

	@FindBy(xpath = "//a[contains(@id, 'userInfo')]")
	public WebElement OrderListing_UserInfoIcon;
	@FindBy(xpath = "//a[contains(@href,'/settings/import')]")
	public WebElement UserInfoIcon_Settings;
	@FindBy(xpath = "//a[contains(text(),'Default Tasks')]")
	public WebElement default_tasks;
	@FindBy(xpath = "//button[contains(@ng-click,'vm.editCommonTasks()')]")
	public WebElement AddCommon_tasks;
	@FindBy(xpath = "//input[contains(@ng-model,'vm.commonTask.Name')]")
	public WebElement taskname;
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement savetask;
	@FindBy(xpath = "//tr[contains(@ng-repeat,'task in vm.commonTasks')]")
	public List<WebElement> commontasktable;
	@FindBy(xpath = "//label/input[contains(@type,'radio')]")
	public WebElement NoDueDate;
	@FindBy(xpath = "//ng-content[contains(text(),'Due Same Day')]")
	public WebElement DueSameDate;
	@FindBy(xpath = "//ng-content[contains(text(),'Due In')]")
	public WebElement DueINDays;
	@FindBy(xpath = "//input[contains(@disabled,'disabled')]")
	public WebElement DueINTextField;
	@FindBy(xpath = "//input[contains(@ng-model,'vm.dueInBusinessDays')]")
	public WebElement EnableDueINTextField;
	// Add Task

	@FindBy(xpath = "//button[contains(@ng-click, 'vm.openTaskModal()')]")
	public WebElement AddTaskButton;
	@FindBy(xpath = "//button[contains(@ng-click, 'vm.openTaskModal(vm.task)')]/i")
	public WebElement EditTask;
	@FindBy(xpath = "//input[contains(@ng-model,'vm.model.Name')]")
	public WebElement EditTaskName;
	@FindBy(xpath = "//li[contains(@ui-sref-active, 'active')][5]/a")
	public WebElement AddTaskFromMain;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.searchTerm')]")
	public WebElement TaskSearchField;
	@FindBy(xpath = "//span[contains(@class, 'text-left cursor-pointer ng-binding')]")
	public WebElement GetMainTaskContent;
	@FindBy(xpath = "//uib-tab-heading[contains(text(),'My Tasks')]")
	public WebElement MyTask;
	@FindBy(xpath = "//h5[contains(text(), 'Categories')]/parent::div/parent::div/div[2]/ul/li/div/div/label/input")
	public List<WebElement> GetCategoriesTypes;
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement CloseTaskWindow;

	// Designs Decorations

	@FindBy(xpath = "//a[contains(@ui-sref,'companies.company.view({ tab: key })')][contains(text(),'Designs')]")
	public WebElement Designs;
	@FindBy(xpath = "//a[contains(text(),'Decorations')]")
	public WebElement Decorations;
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
	public WebElement AddDecorations;
	@FindBy(xpath = "//input[contains(@ng-model,'vm.decoration.Name')]")
	public WebElement DecorationName;
	@FindBy(xpath = "//select[contains(@class,'form-control ng-pristine ng-valid ng-empty ng-touched')]")
	public WebElement ImprintMethod;
	@FindBy(xpath = "//option[contains(text(),'Embossed')]")
	public WebElement SelectImprintMethod;
	@FindBy(xpath = "//ng-content[contains(text(),'Attach Files')]")
	public WebElement Decoration_ArtWorkImageUploadButton;
	@FindBy(xpath = "//button[contains(text(),'Save')][contains(@translate,'BUTTONS.SAVE')]")
	public WebElement SaveDecoration;
	@FindBy(xpath = "//input[contains(@placeholder,'Search for Decorations')]")
	public WebElement SearchDecoration;
	@FindBy(xpath = "//a[contains(text(),'View')]")
	public WebElement ViewDecoration;
	@FindBy(xpath = "//h4[contains(text(),'Edit Decoration')]")
	public WebElement VerifyViewDecorationScreen;
	@FindBy(xpath = "//ng-content[contains(text(),'Delete Decoration')]")
	public WebElement DeleteDecoration;
	@FindBy(xpath = "//ng-content[contains(text(),'No Decorations Found')]")
	public WebElement VerifyDeleteDecoration;

	// Settings
	@FindBy(xpath = "//a[contains(text(),'Companies')]")
	public WebElement companies;
	@FindBy(xpath = "//input[contains(@ng-model,'vm.searchTerm')]")
	public WebElement searchcomp;
	@FindBy(xpath = "//div[contains(@class,'col-lg-7')]")
	public WebElement compdetail;
	@FindBy(xpath = "//input[contains(@ng-model,'vm.commonTask.Name')]")
	public WebElement TaskName;
	@FindBy(xpath = "//span[contains(text(),'Enter or Select Team or Individual')]")
	public WebElement CommonTaskAssignedToDropDown;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter or Select Team or Individual')]")
	public WebElement CommonTaskAssignedTo;
	@FindBy(xpath = "//div[contains(@placeholder,'Enter or Select Team or Individual')]")
	public WebElement CommonTaskAssignedToText;

	@FindBy(xpath = "//select[contains(@ng-model,'vm.commonTask.TaskType')]")
	public WebElement CommonTaskTypeDropDown;
	@FindBy(xpath = "//select[contains(@ng-model,'vm.commonTask.TaskType')]/option[contains(@selected,'selected')]")
	public WebElement CommonTaskType;
	@FindBy(xpath = "//select[contains(@ng-model,'vm.commonTask.Priority')]")
	public WebElement CommonTaskPriorityDropDown;
	@FindBy(xpath = "//select[contains(@ng-model,'vm.commonTask.Priority')]/option[contains(@selected,'selected')]")
	public WebElement CommonTaskPriority;

	@FindBy(xpath = "//span[contains(@class,'btn btn-default form-control ui-select-toggle')]")
	public WebElement CompanyDetailTaskname;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter or select')]")
	public WebElement ProvideCommonTaskname;
	@FindBy(xpath = "//button[contains(@translate,'BUTTONS.CANCEL')]")
	public WebElement Cancel;
//	@FindBy(xpath="//span[contains(text(),'"+CrmTestData.Task+"')]") public WebElement selecttaskname ;

	// @FindBy(xpath="//input[contains(@ng-model, 'vm.model.Name')]") public
	// WebElement TaskName;
//	@FindBy(xpath="//button[contains(@ng-click, 'vm.save')]") public WebElement SaveTask;

	@FindBy(xpath = "//div[contains(@class,'modal-footer ng-scope')]/descendant::button[contains(@ng-mousedown,'vm.save(!vm.taskForm.name.$invalid)')]")
	public WebElement SaveTask;
	@FindBy(xpath = "//i[contains(@class, 'fa fa-calendar')]")
	public WebElement OpenCalender;
	@FindBy(xpath = "//span[contains(@class,'ellipsis ng-binding ng-scope')]/parent::span")
	public WebElement AssignedTo;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter or Select Team or Individual')]")
	public WebElement SearchTeam;
	@FindBy(xpath = "//div[contains(@title,'automation nonadmin')]")
	public WebElement Selectnonadmin;
	@FindBy(xpath = "//button[contains(text(), 'More Details')]")
	public WebElement MoreDetail;
	@FindBy(xpath = "//ng-content[contains(text(), 'Additional Information')]")
	public WebElement AdditionalInformation;
	@FindBy(xpath = "//select[contains(ng-model, 'vm.model.Priority')]")
	public WebElement Priority;
	@FindBy(xpath = "//select[contains(@ng-model, 'vm.model.Status')]")
	public WebElement TaskStatus;

	@FindBy(xpath = "//button[contains(text(), 'Save')]")
	public WebElement Save;
	@FindBy(xpath = "//button[contains(text(), 'Save')]")
	public List<WebElement> SaveOrders;

	// @FindBy(xpath="//span[contains(@class, 'task-date-black')]") public
	// WebElement VerifyTask;
	@FindBy(xpath = "//span[contains(@class, 'color-black')]/strong")
	public WebElement VerifyTask;

	@FindBy(xpath = "//a[contains(text(), 'Appointments')]")
	public WebElement Appointment;
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary dropdown-toggle')]")
	public WebElement Appointmentdropdown;

	@FindBy(xpath = "//button[contains(text(), 'Month')]")
	public WebElement MonthView;
	@FindBy(xpath = "//button[contains(text(), 'Week')]")
	public WebElement WeekView;
	@FindBy(xpath = "//button[contains(text(), 'Day')]")
	public WebElement DayView;

	@FindBy(xpath = "//button[contains(@class, 'btn btn-primary dropdown-toggle')]")
	public WebElement ToggleButton;
	@FindBy(xpath = "//a[contains(text(), 'New Task')]")
	public WebElement NewTask;

	@FindBy(xpath = "//ng-content[contains(text(), 'Completed Date')]")
	public WebElement CompletedDate;
	@FindBy(xpath = "//i[contains(@class, 'fa fa-user text-med')]")
	public WebElement CompletedBy;

	@FindBy(xpath = "//i[contains(@class, 'fa fa-check-circle-o text-baseline font-20')]")
	public WebElement CompleteTask;
	@FindBy(xpath = "//i[contains(@class, 'fa fa-trash-o')]")
	public WebElement DeleteTask;

	@FindBy(xpath = "//div[contains(@class, 'toast-title')]")
	public WebElement Success;
	@FindBy(xpath = "//div[contains(text(), 'Error!')]")
	public WebElement Error;

	@FindBy(xpath = "//a[contains(text(), 'Open')]")
	public WebElement OpenTaskFilter;
	@FindBy(xpath = "//ng-content[contains(@translate, 'LABELS.OPEN')]")
	public WebElement OpenFilterlist;

	@FindBy(xpath = "//a[contains(text(), 'Completed')]")
	public WebElement CompletedTaskFilter;

	// Add company Contact
	@FindBy(xpath = "//li[contains(@ui-sref-active, 'active')][2]/a")
	public WebElement NavigatetoContacts;
	@FindBy(xpath = "//a[contains(@class, 'btn btn-primary')]")
	public WebElement AddContact;
	@FindBy(xpath = "//input[contains(@placeholder,'Search for address, phone, etc.')]")
	public WebElement SearchContact;
	@FindBy(xpath = "//div[contains(@ng-click,'::selectContact(contact.Id)')]")
	public WebElement ContactDetail;

	@FindBy(xpath = "//ng-content[contains(text(),'Actions')]/parent::button")
	public WebElement ClickAtAction;
	@FindBy(xpath = "//a[contains(@ui-sref, 'contacts.add')]")
	public WebElement CreateContactLink;
	@FindBy(xpath = "//a[contains(text(),'Merge Contact')]")
	public WebElement MergeContact;
	@FindBy(xpath = "//a[contains(@ng-click, 'vm.delete()')]")
	public WebElement DeleteComp;

	@FindBy(xpath = "//input[contains(@name, 'firstName')]")
	public WebElement ContactFName;
	@FindBy(xpath = "//input[contains(@ng-model, 'vm.currentContact.FamilyName')]")
	public WebElement ContactLName;
	@FindBy(xpath = "//input[contains(@type, 'tel')]")
	public WebElement ContactPhone;
	@FindBy(xpath = "	//a[contains(text(),'Add Phone')]")
	public WebElement AddPhone;

	@FindBy(xpath = "//input[contains(@ng-model, 'email.Address')]")
	public WebElement ContactEMail;
	@FindBy(xpath = "//a[contains(text(),'Add Email')]")
	public WebElement AddEMail;
	@FindBy(xpath = "//a[contains(text(),'Add Website')]")
	public WebElement AddWebsite;

	@FindBy(xpath = "//input[contains(@name, 'website')]")
	public WebElement ContactWebsite;
	@FindBy(xpath = "//button[contains(@ng-click, 'vm.confirmSave')]")
	public WebElement SaveButton;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter or Choose Address')]")
	public WebElement ContactAddress;

	@FindBy(xpath = "//a[contains(@ng-if, 'relationship.To.IsVisible')]")
	public WebElement RshipVericationbetContandComp;

//Company Verification
	@FindBy(css = "#pad-wrapper > div.page-header.clearfix > div.profile-title > h2 > span")
	public WebElement CompVerify;

	@FindBy(xpath = "//a[contains(@href, 'tel')]")
	public WebElement PhnVerify;
	@FindBy(xpath = "//span[contains(@class,'ng-binding')]/parent::h2")
	public WebElement ContactVerify;

	@FindBy(xpath = "//a[contains(@href, 'mailto:')]")
	public WebElement EmailVerify;
	@FindBy(xpath = "//a[contains(@target, '_website')]")
	public WebElement WebVerify;
	@FindBy(xpath = "//*[contains(@class, 'item-title white-space-pre word-break ng-binding')]")
	public WebElement CompDetails;

	@FindBy(xpath = "//*[contains(text(), 'Enter or Select Link')]")
	public WebElement AddNewLink;
	@FindBy(xpath = "//*[contains(@class, 'fa text-med fa-building')]")
	public WebElement AddNewLinkSelect;
	@FindBy(xpath = "//*[contains(@class, 'form-control ng-pristine ng-valid ng-empty ng-touched')]")
	public WebElement RshipDD;

	@FindBy(className = "form-control ng-pristine ng-valid ng-valid-maxlength ng-touched")
	public WebElement searchfield;

	///////////// Export////////////////////////

	@FindBy(xpath = "//div[contains(@class, 'badge pull-right ng-binding ng-scope')]")
	public WebElement exportnoti;

	@FindBy(xpath = "//ng-content[contains(text(), 'Export')]")
	public WebElement ExportButton;
	@FindBy(xpath = "//*[@id='pad-wrapper']/div[4]/div[2]/div[1]/div/span/div[2]/div/ul/li[1]/a")
	public WebElement CSV;

	@FindBy(xpath = "//i[contains(@class, 'icon esp-icon icon-alert')]")
	public WebElement ClickNotification;
	@FindBy(xpath = "//div[contains(@ng-bind-html, '::notification.Message')]/a")
	public WebElement DownloadCSV;
	@FindBy(xpath = "//ng-content[contains(text(), 'QuickBooks')]")
	public WebElement QB;
	@FindBy(xpath = "//button[contains(text(), 'Export to CSV')]")
	public WebElement ExportContactCSV;
	@FindBy(xpath = "//i[contains(@class, 'fa fa-ellipsis-v')]")
	public WebElement VcardIcon;

	@FindBy(xpath = "//a[contains(text(), 'Export to vCard')]")
	public WebElement ExportVcard;

	@FindBy(xpath = "//a[contains(text(), 'Emails')]")
	public WebElement NavigateToEmails;
	@FindBy(xpath = "//uib-tab-heading[contains(text(), 'All Emails')]")
	public WebElement MoveToAllEmails;
	@FindBy(xpath = "//uib-tab-heading[contains(text(), 'Spam')]")
	public WebElement MoveToSpamEmails;
	@FindBy(xpath = "//input[contains(@ng-checked, 'vm.isSelected(email.Id)')]")
	public WebElement SelectEmailCheckbox;
	@FindBy(xpath = "//input[contains(@ng-checked, 'vm.isSelected(email.Id)')]")
	public List<WebElement> GetEmailCount;
	@FindBy(xpath = "//input[contains(@placeholder,'Search')]")
	public WebElement SearchEmail;
	@FindBy(xpath = "//div[contains(@ng-click,'::vm.go(email.Id)')]//div[contains(@class,'col-xs-7 word-break')]")
	public WebElement SearchEmailResults;

	@FindBy(xpath = "//ng-content[contains(text(), 'Spam')]")
	public WebElement EmailSpamButton;
	@FindBy(xpath = "//button[contains(text(), 'Spam')]")
	public WebElement EmailSpamButton1;

	@FindBy(xpath = "//ng-content[contains(text(), 'Not Spam')]")
	public WebElement EmailNotSpamButton;

//	@FindBy(xpath="//*[contains(text(), 'Delete Email')]") public WebElement EmailDeleteButton;
	@FindBy(xpath = "//ng-content[contains(text(), 'Delete')] | //button[contains(text(), 'Delete Email')]")
	public WebElement EmailDeleteButton;
	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	public WebElement confirmationdelete;
	@FindBy(xpath = "//button[contains(@ng-click, 'vm.okay()')]")
	public WebElement EmailConfirmButton;
	@FindBy(xpath = "//div[contains(@class, 'media cursor-pointer pull-up')]")
	public WebElement EmailDetail;

	@FindBy(xpath = "//input[contains(@ng-model,'vm.orderNumber.Prefix')]")
	public WebElement Prefix;
	@FindBy(xpath = "//input[contains(@ng-model,'vm.orderNumber.Suffix')]")
	public WebElement PostFix;
	@FindBy(xpath = "//i[contains(@class, 'fa fa-pencil')]")
	public List<WebElement> EditOrderNo;

//  ----------------------------------------Virtual Sample-------------------------------------------------------------------

	@FindBy(linkText = "Advanced Search")
	public WebElement AdvanceSearch;
	@FindBy(xpath = "//ng-content[contains(text(),'With Virtual Samples')]")
	public WebElement VirtualSampleLabel;
	@FindBy(xpath = "//ng-content[contains(text(),'With Virtual Samples')]/ancestor::label/input")
	public WebElement VirtualSampleCheckbox;
	@FindBy(xpath = "//button[contains(@id,'productSearchSubmitBtn')]")
	public WebElement SearchButton;
	@FindBy(xpath = "//div[contains(@ng-repeat,'product in items track by product.TrackingId')]/descendant::i")
	public WebElement VirtualSampleIcon;
	@FindBy(xpath = "//img[contains(@class,'design-image img-responsive')]")
	public WebElement VirtualSampleImage;

	@FindBy(xpath = "//div[contains(@class,'text-center ng-scope col-xs-6')]/descendant::div[contains(@ng-click,'vm.activateTab(tab)')]")
	public WebElement AddText;
	@FindBy(xpath = "//ng-content[contains(text(),'Save | Share')]")
	public WebElement VSSaveButton;
	@FindBy(xpath = "//input[contains(@ng-model,'vm.design.Name')]")
	public WebElement VSName;
	@FindBy(xpath = "//span[contains(text(),'Enter or Select Company')]")
	public WebElement CustomerName;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter or Select Company')]")
	public WebElement ProvideCustomerName;

	@FindBy(xpath = "//button[contains(text(),'Save Design')]")
	public WebElement SaveDesign;
	@FindBy(xpath = "//a[contains(@title,'Designs')]")
	public WebElement DesignTab;
	@FindBy(xpath = "//input[contains(@placeholder,'Search for Designs')]")
	public WebElement SearchDesign;
	@FindBy(xpath = "//uib-tab-heading[contains(text(),'My Designs')]")
	public WebElement MyDesign;
	@FindBy(xpath = "//div[contains(@class,'col-xs-7')]")
	public WebElement UserName;

	@FindBy(xpath = "//span[contains(@translate,'CRM.CONTACTS.RECORD_OWNER')]")
	public WebElement RecordOwner;
	@FindBy(xpath = "//div[contains(@ng-mouseenter,'vm.hoveredItem = design.Id')]")
	public WebElement VSImg;
	@FindBy(xpath = "//a[contains(text(),'Virtual Sample')]")
	public WebElement CRMCompanyDesign;
	@FindBy(xpath = "//input[contains(@placeholder,'Search for Designs')]")
	public WebElement CRMCompanySearchDesign;

	@FindBy(xpath = "//span[contains(@class,'btn btn-default form-control ui-select-toggle')]")
	public WebElement CompFilterDropDown;

	@FindBy(xpath = "//span[contains(text(),'My Designs')]")
	public WebElement MyDesignFilter;

	// span[contains(text(),'My Designs')]

	// -------------------------------------Merge
	// Contact----------------------------------------------------------------
	@FindBy(xpath = "//a[contains(text(),'Websites Admin')]")
	public WebElement WebsitesAdmin;
	@FindBy(partialLinkText = "https://125748-")
	public WebElement WebsitesLink;
	@FindBy(xpath = "//a[contains(text(),'Create Account')]")
	public WebElement CreateAccount;
	@FindBy(xpath = "//input[contains(@id,'ctl02_ctl09_txtFirstName')]|//input[contains(@id,'ctl02_ctl00_txtFirstName')]")
	public WebElement FirstName;
	@FindBy(xpath = "//input[contains(@id,'ctl02_ctl09_txtLastName')]|//input[contains(@id,'ctl02_ctl00_txtLastName')]")
	public WebElement LastName;
	@FindBy(xpath = "//input[contains(@id,'ctl02_ctl09_txtCompanyName')]|//input[contains(@id,'ctl02_ctl00_txtCompanyName')]")
	public WebElement CompanyName;
	@FindBy(xpath = "//input[contains(@id,'ctl02_ctl09_txtUserName1')]|//input[contains(@id,'ctl02_ctl00_txtUserName1')]")
	public WebElement Email;
	@FindBy(xpath = "//input[contains(@id,'ctl02_ctl09_txtPassword1')]|//input[contains(@id,'ctl02_ctl00_txtPassword1')]")
	public WebElement WebsitesPassword;
	@FindBy(xpath = "//input[contains(@id,'ctl02_ctl09_txtConfirmPassword')]|//input[contains(@id,'ctl02_ctl00_txtConfirmPassword')]")
	public WebElement ConfirmPasseord;
	@FindBy(xpath = "//a[contains(@id,'ctl02_ctl09_lnkCreateAccount')]|//a[contains(@id,'ctl02_ctl00_lnkCreateAccount')]")
	public WebElement CreateAccountButton;
	@FindBy(xpath = "//a[contains(@id,'ctl02_ctl04_lnkLogo')]|//a[contains(@id,'ctl02_ctl05_lnkLogo')]")
	public WebElement CreateAccountVerification;
	@FindBy(xpath = "//a[contains(text(),'Profile')]")
	public WebElement AccountVerification;

	@FindBy(xpath = "//span[contains(text(),'Select Contact')]")
	public WebElement MergeSelectContactBDropdown;
	@FindBy(xpath = "//input[contains(@placeholder,'Select Contact')]")
	public WebElement MergeSearchContactB;
	@FindBy(xpath = "//button[contains(text(),'Merge Contacts')]")
	public WebElement MergeContactButton;
	@FindBy(xpath = "//button[contains(text(),'Yes, merge contacts')]")
	public WebElement ConfirmMergeContactButton;
	@FindBy(xpath = "//div[contains(@class,'toast-title')]")
	public WebElement MessageVerification;
	@FindBy(xpath = "//div[contains(@ng-show,'vm.currentCompany.getPrimaryAddress().Name')]")
	public WebElement PrimaryAddressComapnyName;
	@FindBy(xpath = "//div[contains(@ng-show,'vm.currentCompany.getPrimaryAddress().Line1')]")
	public WebElement PrimaryAddressName;
	@FindBy(xpath = "//div[contains(@ng-show,'vm.currentCompany.getPrimaryAddress().City.length + vm.currentCompany.getPrimaryAddress().State.length + vm.currentCompany.getPrimaryAddress().PostalCode.length')]")
	public WebElement StatePostalName;
	@FindBy(xpath = "//div[contains(@ng-show,'vm.currentCompany.getPrimaryAddress().Country')]")
	public WebElement PrimaryAddressCountryName;
	@FindBy(xpath = "//div[contains(@ng-hide,'!vm.currentContact.getPrimaryAddress() && !vm.currentContact.getPrimaryPhone() && !vm.currentContact.getPrimaryEmail() && !vm.currentContact.getPrimaryWebsite()')]")
	public WebElement PrimaryConatctDetails;

	@FindBy(xpath = "//div[contains(@ng-show,'$ctrl.ngModel.Address.Line1')]")
	public WebElement OrdersPrimaryAddressName;
	@FindBy(xpath = "//div[contains(@ng-show,'$ctrl.ngModel.Address.City.length + $ctrl.ngModel.Address.State.length + $ctrl.ngModel.Address.PostalCode.length')]")
	public WebElement OrdersStatePostalName;
	@FindBy(xpath = "//div[contains(@ng-show,'$ctrl.ngModel.Address.CountryType')]")
	public WebElement OrdersPrimaryAddressCountryName;

//  ----------------------------------------Edit Virtual Sample-------------------------------------------------------------------
	@FindBy(xpath = "//button[contains(@title,'Edit')]")
	public WebElement EditMyDesign;
	@FindBy(xpath = "//button[contains(text(),'Save Design')]")
	public WebElement SaveMyDesign;
	@FindBy(xpath = "//input[contains(@value,'Owner')]")
	public WebElement SelectOnlytheRecordCreator;
	@FindBy(xpath = "//i[contains(@class,'fa fa-trash')]")
	public WebElement DeleteDesign;
	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	public WebElement ConfirmOk;
	@FindBy(xpath = "//span[contains(text(),'Send')]//ancestor::button")
	public WebElement SendDesignButton;
	@FindBy(xpath = "//span[contains(@class,'close ui-select-match-close')]")
	public WebElement CloseIcon;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter or Select User')]")
	public WebElement ToEmailAddress;
	@FindBy(xpath = "//ng-content[contains(text(),'Send Design')]")
	public WebElement SendDesign;
	@FindBy(xpath = "//span[contains(text(),'Order')]//ancestor::button")
	public WebElement VirtualSampleOrder;
	@FindBy(xpath = "//input[contains(@ng-if,'vm.allowSelect')]")
	public WebElement SelectVirtualSample;
	@FindBy(xpath = "//button[contains(text(),'Create Order')]")
	public WebElement CreateOrderSelectVirtualSample;

	// public WebDriver driver;
	/*
	 * public CrmLocatiors(WebDriver driver){
	 * 
	 * 
	 * // this.driver = driver; }
	 */

}

// Dynamic Xpath
//$($x("//strong[contains(text(),'Less than Minimum Charge')]/parent::td//button[contains(@title,'Add Charge')]")).click();
