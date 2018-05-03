package cse4321_group9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class IdentifierParamsTest {
    private String identifier;

    public IdentifierParamsTest(String input) {
        this.identifier = input;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"a"},
                {"aa"},
                {"a1"},
                {"var"}
        });
    }


    @Test
    public void is_identifier() {
        boolean isIdentifier = PrintTokens.is_identifier(identifier);
        assertTrue(isIdentifier);
    }
}