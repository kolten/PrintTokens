package cse4321_group9;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

import java.security.Key;
import java.util.List;

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
