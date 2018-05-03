package cse4321_group9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class CommentParamsTest
{
    private String comment;

    public CommentParamsTest(String input){
        this.comment = input;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {";hello"},
                {";this"},
                {";is"},
                {";a"},
                {";comment"}
        });
    }

    @Test
    public void generic_test(){
        boolean isComment = PrintTokens.is_comment(comment);
        assertTrue(isComment);
    }
}
