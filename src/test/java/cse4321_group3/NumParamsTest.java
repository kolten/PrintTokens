package cse4321_group3;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class NumParamsTest {
    private String numberStr;

    public NumParamsTest(String input) {
        this.numberStr = input;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {""}
        });
    }


    @Test
    public void generic_test() {

    }
}