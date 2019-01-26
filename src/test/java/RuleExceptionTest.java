import com.scratch.MyClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleExceptionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void throwsIllegalArgumentExceptionIfNegativeNancy() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Negative value not allowed");
        MyClass classUnderTest = new MyClass();
        classUnderTest.noNegativeNancies(-1);
    }
}