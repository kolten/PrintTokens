package cse4321_group3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CharParamsTest.class,
        CommentParamsTest.class,
        IdentifierParamsTest.class,
        KeywordParamsTest.class,
        NumParamsTest.class,
        SpecialParamsTest.class,
        StringParamsTest.class
})
public class SuiteRunner {

}
