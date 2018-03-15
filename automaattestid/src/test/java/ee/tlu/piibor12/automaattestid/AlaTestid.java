
package ee.tlu.piibor12.automaattestid;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class AlaTestid {
    
    public AlaTestid() {
    }
    Ala a;
    @Before
    public void setUp(){
        a= new Ala(10,10);
        
    }
    @Test public void loomine(){
        assertThat(a.Kysikilpkonn().kysiX(), is(0));
    }
}
