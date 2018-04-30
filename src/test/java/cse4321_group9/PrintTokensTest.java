package cse4321_group9;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintTokensTest {

    @Test
    public void open_character_stream() {
        fail("Not yet implemented");
    }

    @Test
    public void open_token_stream() {
        fail("Not yet implemented");
    }

    @Test
    public void get_token() {
        fail("Not yet implemented");
    }

    @Test
    public void is_token_end() {
        fail("Not yet implemented");
    }

    @Test
    public void token_type() {
        fail("Not yet implemented");
    }

    @Test
    public void print_token() {
        fail("Not yet implemented");
    }

    @Test
    public void is_comment() {
        String comment = ";hello";
        boolean isComment = PrintTokens.is_comment(comment);
        assertTrue("assert that" + comment + "is a comment", isComment);
    }

    @Test
    public void is_keyword() {
        boolean isKeyword = PrintTokens.is_keyword("lambda");
        assertTrue(isKeyword);
    }

    @Test
    public void is_char_constant() {
        boolean isCharConstant = PrintTokens.is_char_constant("#run");
        assertTrue(isCharConstant);
    }

    @Test
    public void is_num_constant() {
        boolean isNum = PrintTokens.is_num_constant("1");
        assertTrue(isNum);
    }

    @Test
    public void is_str_constant() {
        boolean isStr = PrintTokens.is_str_constant("\"test\"");
        assertTrue(isStr);
    }

    @Test
    public void is_identifier() {
        boolean isIdentifier = PrintTokens.is_identifier("a");
        assertTrue(isIdentifier);
    }

    @Test
    public void print_spec_symbol() {
        fail("Not yet implemented");
    }

    @Test
    public void is_spec_symbol() {
        boolean isSpecSymbol = PrintTokens.is_spec_symbol(']');
        assertTrue(isSpecSymbol);
    }

    @Test
    public void main() {
        fail("Not yet implemented");
    }
}