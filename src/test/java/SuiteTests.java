import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import division.DivideANumber;
import sumnumbers.Sum;
import writeaname.WriteNames;

@SelectClasses({
    DivideANumber.class,
    WriteNames.class,
    Sum.class
})

@Suite
public class SuiteTests {
    
}
