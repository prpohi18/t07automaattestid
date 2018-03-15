import IdDecoder.IdDecoder;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class IdDecoderTest {
    private IdDecoder IdDecoderCorrect;
    private IdDecoder IdDecoderInvalidShorter;
    private IdDecoder IdDecoderInvalidLonger;
    private IdDecoder IdDecoderCorrectWoman;
    private IdDecoder IdDecoderInvalidGender;

    @Before
    public void setUp() {
        IdDecoderCorrect = new IdDecoder("39603265713");
        IdDecoderInvalidShorter = new IdDecoder("678454");
        IdDecoderInvalidLonger = new IdDecoder("45609674359837645987357");
        IdDecoderCorrectWoman = new IdDecoder("49603265713");
        IdDecoderInvalidGender  = new IdDecoder("99603265713");
    }

    @Test
    public void testIdCodeLengthFalseLonger() {
        assertEquals(IdDecoderInvalidLonger.checklength(), false);
    }

    @Test
    public void testIdCodeLengthFalseShorter() {
        assertEquals(IdDecoderInvalidShorter.checklength(), false);
    }

    @Test
    public void testIdCodeLengthTrue() {
        assertEquals(IdDecoderCorrect.checklength(), true);
    }

    @Test
    public void testGenderMan() {
        assertEquals(IdDecoderCorrect.checkgender(), "m");
    }

    @Test
    public void testGenderWoman() {
        assertEquals(IdDecoderCorrectWoman.checkgender(), "n");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGenderInvalid() {
        IdDecoderInvalidGender.checkgender();
    }


}
