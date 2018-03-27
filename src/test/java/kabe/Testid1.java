package kabe;
import org.junit.*;
import static org.junit.Assert.*;


public class Testid1{
   KabeLaud laud=new KabelauaVabrik().kysiKabeLaud();
   @Test
   public void test1(){
      assertEquals(3, 1+2);
   }
   @Test
   public void test2(){
	   assertEquals(0, laud.veergKoodiks('A'));
	   assertEquals(7, laud.veergKoodiks('H'));
   }
   @Test
   public void reaKoodiTest(){
	   assertEquals(0, laud.ridaKoodiks('8'));
	   assertEquals(7, laud.ridaKoodiks('1'));
	   
   }
   @Test
   public void paigutamine(){
	   laud.paiguta("A1", 'v');
	   assertEquals('v', laud.kysi("A1"));
   }
   @Test
   public void alustamine(){
	laud.algseis();
	assertEquals('v', laud.kysi("A1"));
	assertEquals('v', laud.kysi("B2"));
	assertEquals('m', laud.kysi("A7"));
	assertEquals('m', laud.kysi("B8"));
   }
	@Test
	public void kolmnurgaYmberm66duTest(){
		assertEquals(6, laud.kolmnurgaYmberm66t(2,2,2));
	}
}