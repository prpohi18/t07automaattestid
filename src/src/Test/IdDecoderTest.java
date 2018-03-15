import IdDecoder.IdDecoder;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class IdDecoderTest {
    private IdDecoder IdDecoderCorrect;
    private IdDecoder IdDecoderInvalidShorter;
    private IdDecoder IdDecoderInvalidLonger;

    @Before
    public void setUp() throws Exception {
        IdDecoderCorrect = new IdDecoder("39603265713");
        IdDecoderInvalidShorter = new IdDecoder("678454");
        IdDecoderInvalidLonger = new IdDecoder("45609674359837645987357");
    }

    @Test
    public void testIdCodeLengthFalseLonger(){
        assertEquals(IdDecoderInvalidLonger.checklength(), false);
    }

    @Test
    public void testIdCodeLengthFalseShorter(){
        assertEquals(IdDecoderInvalidShorter.checklength(), false);
    }

    @Test
    public void testIdCodeLengthTrue(){
        assertEquals(IdDecoderCorrect.checklength(), true);
    }


}
