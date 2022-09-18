package Pages;

import Helpers.ElementType;
import org.junit.Assert;

public class HomePage extends SharedKeywords{
    public void clickOutlet() {
        click("outlet", ElementType.ID);}

    public void validateOutletPage() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.mediamarkt.de/de/campaign/restposten" );
    }
}
