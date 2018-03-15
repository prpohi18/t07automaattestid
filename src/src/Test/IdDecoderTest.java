import IdDecoder.IdDecoder;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IdDecoderTest {
    private IdDecoder IdDecoder;

    @Before
    public void setUp() throws Exception {
        IdDecoder = new IdDecoder("39603265713");
    }

    @Test
    public void testIdCodeLengthFalseLonger(){
        assertEquals(IdDecoder.checklength(), false);
    }

    @Test
    public void testIdCodeLengthFalseShorter(){
        assertEquals(IdDecoder.checklength(), false);
    }

    @Test
    public void testIdCodeLengthTrue(){
        assertEquals(IdDecoder.checklength(), true);
    }


}
