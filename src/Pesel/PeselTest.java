package Pesel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselTest {


 @Test
 void testPeselValid() {
  int[] pesel = {4,9,0,4,0,5,0,1,5,8,0};
  Pesel p = new Pesel();
  assertTrue(p.pesel(pesel));
 }

 @Test
 void testPeselInvalidLength() {
  int[] pesel = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
  Pesel p = new Pesel();
  assertFalse(p.pesel(pesel));
 }

 @Test
 void testPeselInvalidControlNumber() {
  int[] pesel = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0};
  Pesel p = new Pesel();
  assertFalse(p.pesel(pesel));
 }

}