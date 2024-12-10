package com.tld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculMetierTest {

	private static CalculMetier metier;
	  
    @BeforeAll
    static void setUpBeforeClass() {   metier =new CalculMetier();  }

	 @Test
     public void testSomme(){ assertTrue(metier.somme(9,10)==19); }

     @Test
     public void testProduit(){ assertTrue(metier.produit(9,10)==90);  }

}

 
 

