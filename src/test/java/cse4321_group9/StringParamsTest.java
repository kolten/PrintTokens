package cse4321_group9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class StringParamsTest {
    private String str;

    public StringParamsTest(String input) {
        this.str = input;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"\"this\""},
                {"\"is\""},
                {"\"a\""},
                {"\"string\""}
        });
    }


    @Test
    public void is_string_constant() {
        boolean isStringConst = PrintTokens.is_str_constant(str);
        assertTrue(isStringConst);
    }
}