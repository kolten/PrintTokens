package cse4321_group9;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class KeywordParamsTest {

    private String keyword;
    private PrintTokens tokens;

    public KeywordParamsTest(String input){
        this.keyword = input;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"lambda"},
            {"and"},
            {"or"},
            {"if"},
            {"xor"},
            {"lambda"}
        });
    }

    @Before
    public void setUp(){
        tokens = new PrintTokens();
    }

    @Test
    public void is_keyword_test(){
        boolean isKeyword = PrintTokens.is_keyword(keyword);
        assertTrue(isKeyword);
    }

}