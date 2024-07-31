package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.locator.BaseClass;

public class BasePage extends BaseClass {
	@FindBy(partialLinkText="Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText="Log in")
	private WebElement loginlink;
	
	@FindBy(partialLinkText="Shopping cart")
	private WebElement ShoppingcartLink;
	
	@FindBy(partialLinkText="Wishlist")
	  private WebElement WishlistLink;
	  
	  @FindBy(partialLinkText="BOOKS")
	  private WebElement BooksLink;
	  
	  @FindBy(partialLinkText="COMPUTERS")
	  private WebElement ComputersLink;
	  
	  @FindBy (partialLinkText="ELECTRONIC")
		private  WebElement ElectronicsLink;
	  
	  @FindBy (partialLinkText="APPEARL & SHOES")
		private WebElement ApparelShoesLink;
	  
	  @FindBy (partialLinkText="DIGITAL DOWNLOADS")
	 	private WebElement DigitaldownloadsLink;
	  
	  @FindBy(partialLinkText = "JEWELLARY")
	  private WebElement JewelryLink;
	  
	  @FindBy(partialLinkText="GIFT CARDS")
	  private WebElement GiftCardsLink;
	  
	  
	  @FindBy(id="small-searchterms")
	  private WebElement SearchBox;
	  
	 @FindBy(xpath="//input[@value='Search']")
	 private WebElement SearchButton;
	 
	  //add inside the constructor of TC001 class
	   public BasePage(WebDriver driver) {
	   PageFactory.initElements(driver,this);
	}
	   
	   
	   /**
	    * * this method is used to register link
	    * Getter methods Started for Private variables
	    */
	   
	   /**
	    * This method 
	    * @return type is Webelement
	    */

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginlink;
	}

	public WebElement getShoppingcartLink() {
		return ShoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return WishlistLink;
	}

	public WebElement getBooksLink() {
		return BooksLink;
	}

	public WebElement getComputersLink() {
		return ComputersLink;
	}

	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}

	public WebElement getApparelShoesLink() {
		return ApparelShoesLink;
	}

	public WebElement getDigitaldownloadsLink() {
		return DigitaldownloadsLink;
	}

	public WebElement getJewelryLink() {
		return JewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return GiftCardsLink;
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}
	}
	

