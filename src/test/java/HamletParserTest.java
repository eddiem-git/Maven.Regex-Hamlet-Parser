import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testRemoveHoratio() {
        String test = "Hello Howdy Horatio HORATIO";
        String actual = hamletParser.removeHoratio(test);
        String expected = "Hello Howdy Leon Leon";
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void testChangeHoratioToTariq() {
        //given
        String test = "Hello Howdy Horatio HORATIO";
        String expected = "Hello Howdy TARIQ TARIQ";
        //when
        String actual = hamletParser.replaceHoratio(test);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testChangeHamletToLeon() {
        //given
        String test = "Hello Howdy Hamlet HAMLET";
        String expected = "Hello Howdy LEON LEON";
        //when
        String actual = hamletParser.replaceHamlet(test);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindHoratio() {

    }

    @Test
    public void testFindHamlet() {
    }
    @Test
    public void testRemoveHamlet() {
        String test = "Hamlet Howdy Hamlet HORATIO";
        String actual = hamletParser.removeHamlet(test);
        String expected = "Tariq Howdy Tariq HORATIO";
        Assert.assertEquals(expected,actual);

    }
}