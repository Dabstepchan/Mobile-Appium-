import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import org.junit.Test;

public class Main extends CoreTestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() {
        super.tearDown();
    }

    @Test
    public void testSavingAndDeletingReadingList() {
        SearchPageObject searchPageObject = new SearchPageObject(driver);

        searchPageObject.initSearchInput();
        searchPageObject.typeSearchLine("The Hobbit");
        searchPageObject.waitForSearchResult();
        searchPageObject.clickPageSaveAndAddToList();
        searchPageObject.viewListAndDeleteHim();
    }
}
