package capgemini.lecture1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringReplacementTest {

    StringReplacement stringReplacement = new StringReplacement();

    @BeforeEach
    void setup() {
        stringReplacement = new StringReplacement();
    }

    @Test
    @DisplayName("AB")
    void test1()
    {
        assertTrue(stringReplacement.replace("AB").equals(""));
    }

    @Test
    @DisplayName("CD")
    void test2()
    {
        assertTrue(stringReplacement.replace("CD").equals(""));
    }

    @Test
    @DisplayName("ABC")
    void test3()
    {
        assertTrue(stringReplacement.replace("ABC").equals("C"));
    }

    @Test
    @DisplayName("ABCD")
    void test4()
    {
        assertTrue(stringReplacement.replace("ABCD").equals(""));
    }

    @Test
    @DisplayName("CABBAD")
    void test5()
    {
        assertTrue(stringReplacement.replace("CABBAD").equals(""));
    }

    @Test
    @DisplayName("BC")
    void test6()
    {
        assertTrue(stringReplacement.replace("BC").equals("BC"));
    }

    @Test
    @DisplayName("ABCB")
    void test7()
    {
        assertTrue(stringReplacement.replace("ABCB").equals("CB"));
    }

    @Test
    @DisplayName("")
    void test8()
    {
        assertTrue(stringReplacement.replace("").equals(""));
    }

    @Test
    @DisplayName("AAAAAAAAAAAAAAAAAA")
    void test9()
    {
        assertTrue(stringReplacement.replace("AAAAAAAAAAAAAAAAAA").equals("AAAAAAAAAAAAAAAAAA"));
    }

    @Test
    @DisplayName("D")
    void test10()
    {
        assertTrue(stringReplacement.replace("D").equals("D"));
    }

    @Test
    @DisplayName("ACB")
    void test11()
    {
        assertTrue(stringReplacement.replace("ACB").equals("ACB"));
    }
}
