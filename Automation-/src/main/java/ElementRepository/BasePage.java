package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	@FindBy(partialLinkText = "Register")
	public WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	public WebElement loginLink;
	
	@FindBy(partialLinkText = "Shopping cart")
	public WebElement shoppingcartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	public WebElement wishlistLink;
	 
	@FindBy(partialLinkText = "Books")
	public WebElement booksLink;
	
	@FindBy(partialLinkText = "Computers")
	public WebElement computersLink;
	
	@FindBy(partialLinkText = "Electronics")
	public WebElement electronicsLink;
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	public WebElement apparelAndShoesLink; 
	
	@FindBy(partialLinkText = "Digital downloads")
	public WebElement digitalDownloadLink;
	
	@FindBy(partialLinkText = "Jewelry")
	public WebElement jevelryLink;
	
	@FindBy(partialLinkText = "Gift Cards")
	public WebElement giftCardsLink;
	
	@FindBy(partialLinkText = "small-searchterms")
	public WebElement searchBox;
	
	@FindBy(xpath = "//input[@value='Search']")
	public WebElement searchButton;
	 
	@FindBy(partialLinkText = "Logout")
	public WebElement logoutLink;

	
	
	
	/**
	 * Getters
	 */
	/** 
	 * this method is 
	 *
	 */
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadLink() {
		return digitalDownloadLink;
	}

	public WebElement getJevelryLink() {
		return jevelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 }
	
	


