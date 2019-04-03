/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import division.Division;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeremias
 */
public class DivisionTest {

      Division div;

      public DivisionTest() {
      }

      @Before
      public void setUp() {
            div = new Division();

      }

      // div.division[2] = resultado;
      // Division.division(20,0) = Esperado de nuestro metodo.
      @Test
      public void testDivisionPorCero() {
            assertEquals(div.division[2], Division.division(20, 0));
      }

}
