package pages;

import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static utilities.Driver.*;

public class GlbTraderPage {



    public GlbTraderPage() {
        PageFactory.initElements(getDriver(), this);


    }

    @FindBy( xpath = "//header/div[@id='top_bar']/div[1]/div[1]/div[2]/div[1]/a[2]")
    public WebElement sellerSignInBox;

    @FindBy( xpath = "//header/div[@id='top_bar']/div[1]/div[1]/div[2]/div[1]/a[3]")
    public WebElement sellerJoinBox;

    @FindBy( xpath = "//header/div[@id='top_bar']/div[1]/div[1]/div[2]/div[1]/a[4]")
    public WebElement aboutUsBox;

    @FindBy( xpath= "//a[contains(text(),'Return Policy')]")
    public WebElement returnPolicyBox;

    @FindBy( linkText = "Contact Us")
    public WebElement contactUsBox;

    @FindBy( linkText = "Package")
    public WebElement packageBox;

    @FindBy( xpath = "//a[@class='goog-te-menu-value")
    public WebElement languageDropBox;

    @FindBy( id = "header_search_category")
    public WebElement SelectDropBox;



    @FindBy( xpath = "//span[contains(text(),'Men Clothing & Accessories')]")
    public WebElement menClothingBox;

    @FindBy( xpath = "//span[contains(text(),'Women Clothing & Accessories')]")
    public WebElement womenClothingBox;

    @FindBy( xpath = "//span[contains(text(),'Jewelry & Accessories')]")
    public WebElement jewelryBox;

    @FindBy( xpath = "//span[contains(text(),'Cellphones & Telecommunications')]")
    public WebElement cellphoneBox;

    @FindBy( xpath = "//span[contains(text(),'Computer & Office')]")
    public WebElement computerBox;

    @FindBy( xpath = "//span[contains(text(),'Consumer Electronics')]")
    public WebElement consumerBox;

    @FindBy( linkText = "Tops & Tees")
    public WebElement menClothingTopsBox;

    @FindBy( linkText = "Hoodies & Sweatshirts")
    public WebElement menClothingHoodiesBox;

    @FindBy( linkText = "Jackets & Coats")
    public WebElement menClothingJacketsBox;

    @FindBy( linkText = "Pants")
    public WebElement menClothingPantsBox;

    @FindBy( linkText = "Shirts")
    public WebElement menClothingShirtsBox;

    @FindBy( linkText = "Jeans")
    public WebElement menClothingJeansBox;

    @FindBy( linkText = "Accessories")
    public WebElement menClothingAccessoriesBox;

    @FindBy( linkText = "Dresses")
    public WebElement womenClothingDressesBox;

    @FindBy( linkText = "Blouses & Shirts")
    public WebElement womenClothingBlousesBox;

    @FindBy( linkText = "Tops & Tees")
    public WebElement womenClothingTopsBox;

    @FindBy( linkText = "Hoodies & Sweatshirts")
    public WebElement womenClothingHoodiesBox;

    @FindBy( linkText = "Jumpsuits")
    public WebElement womenClothingJumpsuitsBox;

    @FindBy( xpath = "//body/section[1]/div[3]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")
    public WebElement womenClothingAccessoriesBox;

    @FindBy( linkText = "Intimates")
    public WebElement womenClothingIntimatesBox;

    @FindBy( linkText = "Earrings")
    public WebElement jewelryEarringsBox;

    @FindBy( xpath = "//a[contains(text(),'Wedding & Engagement Jewelry')]")
    public WebElement jewelryWeddingsBox;

    @FindBy( linkText = "Fine Jewelry")
    public WebElement jewelryFineBox;

    @FindBy( linkText = "Beads & Jewelry Making")
    public WebElement jewelryBeadsBox;

    @FindBy( linkText = "Necklaces & Pendants")
    public WebElement jewelryNecklacesBox;

    @FindBy( linkText = "Rings")
    public WebElement jewelryRingsBox;

    @FindBy( linkText = "Bracelets & Bangles")
    public WebElement jewelryBraceletsBox;

    @FindBy( xpath = "//body/section[1]/div[3]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement cellMobilBox;

    @FindBy( linkText = "Phone Bags & Cases")
    public WebElement cellBagsBox;

    @FindBy( linkText = "Mobile Phone Accessories")
    public WebElement cellAccessoriesBox;

    @FindBy( linkText = "Mobile Phone Parts")
    public WebElement cellPartsBox;

    @FindBy( xpath = "//body/section[1]/div[3]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")
    public WebElement cellPowerBox;

    @FindBy( linkText = "Tablets")
    public WebElement computerTabletsBox;

    @FindBy( linkText = "Office Electronics")
    public WebElement computerOfficeBox;

    @FindBy( linkText = "Tablet Accessories")
    public WebElement computerAccessoriesBox;

    @FindBy( linkText = "External Storage")
    public WebElement computerStorageBox;

    @FindBy( linkText = "Networking")
    public WebElement computerNetWorkingBox;

    @FindBy( linkText = "Computer Components")
    public WebElement computerComponentsBox;

    @FindBy( linkText = "Computer Peripherals")
    public WebElement computerPeribheralsBox;

    @FindBy( xpath = "//h2[contains(text(),'Hot Products')]")
    public WebElement assertHotProduct;


}
