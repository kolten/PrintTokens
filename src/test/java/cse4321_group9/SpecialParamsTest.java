package cse4321_group9;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class SpecialParamsTest {
    private char symbol;

    public SpecialParamsTest(char input) {
        this.symbol = input;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {'('},
                {')'},
                {'['},
                {']'},
                {'`'},
                {'\''},
        });
    }


    @Test
    public void is_special_symbol() {
        boolean isSpecSymbol = PrintTokens.is_spec_symbol(symbol);
        Assert.assertTrue(isSpecSymbol);
    }
}