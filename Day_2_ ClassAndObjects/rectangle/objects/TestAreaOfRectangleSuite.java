/* Suite class for all test classes to execute at once*/

package rectangle.objects;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestRectangleShape.class,TestTwoRectangleShapes.class,TestPerimeterOfRectangle.class})
public class TestAreaOfRectangleSuite {

}
