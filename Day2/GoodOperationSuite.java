import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@IncludeCategory(GoodOperationCategory.class)
@ExcludeCategory(BadOperationCategory.class)
@Suite.SuiteClasses({Test.class, TestSubtraction.class})
public class GoodOperationSuite {

}
