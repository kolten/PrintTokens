package cse4321_group9;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class KeywordParamsTest {

    private String keyword;

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

    @Test
    public void is_keyword_test(){
        boolean isKeyword = PrintTokens.is_keyword(keyword);
        assertTrue(isKeyword);
    }

}