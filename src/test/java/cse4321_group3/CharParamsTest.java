package cse4321_group3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class CharParamsTest {
    private String charString;

    public CharParamsTest(String input) {
        this.charString = input;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"#a"},
                {"#b"},
                {"#c"},
                {"#d"}
        });
    }

    @Test
    public void is_char_const() {
        boolean isCharConstant = PrintTokens.is_char_constant(charString);
        assertTrue(isCharConstant);
    }
}