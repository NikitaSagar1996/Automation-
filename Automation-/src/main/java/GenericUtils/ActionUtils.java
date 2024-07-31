package GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

    public class ActionUtils {
	
	Actions actions;
	public ActionUtils(WebDriver driver) {
		actions = new Actions(driver);
	}
      public void clickOnElement(WebElement ele) {
	      actions.click(ele).perform();
}

      public void passDataForElement(WebElement ele, String data) {
	      actions.sendKeys(ele, data).perform();
}

      public void mouseHoverOnElement(WebElement ele) {
          actions.moveToElement(ele).perform();
}

      public void doubleClickOnElement(WebElement ele) {
	      actions.doubleClick(ele).perform();
}
      public void rightClickOnElement(WebElement ele) {
	      actions.contextClick(ele).perform();
}

      public void dragAndDropElement(WebElement src, WebElement dest) {
	      actions.dragAndDrop(src, dest).perform();
}

      public void dragAndDropElementByOffSet(WebElement ele, int XOffset, int YOffset) {
	      actions.dragAndDropBy(ele, XOffset, YOffset).perform();
}

      public void scrollBasedOnAxis(int Xoffset, int Yoffset){
	      actions.scrollByAmount(Xoffset, Yoffset).perform();
}

      public void scrollUntilElementIsVisible(WebElement ele) {
	      actions.scrollToElement(ele).perform();
}

      public void scrollUntilElementVisible(WebElement ele, int Xoffset, int Yoffset) {
	     ScrollOrigin origin = ScrollOrigin.fromElement(ele);
	     actions.scrollFromOrigin(null, Xoffset, Yoffset).perform();
  }
}