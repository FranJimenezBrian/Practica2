package prPractica2.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import prPractica2.MinMax;


public class MinMaxTestCajaNegra {
	MinMax mm = new MinMax();
	
	/*Vamos a testear los distintos arrays según las condiciones establecidas en el algoritmo para que nos devuelva
	 un array con el minimo y el máximo esperados*/
	@Test
	public void testArrayNull(){
		
		int[] arrayMM = null;
		assertNull(mm.minMax(arrayMM));
		
	}
	@Test
	public void testArrayUnElemento(){
		int[] arrayMM = {20};
		int[] salidaEsperada = {20,20};
		assertArrayEquals(mm.minMax(arrayMM),salidaEsperada);
	}
	
	@Test
	public void testArrayOrdenado(){
		int[] arrayMM = {1,2,3,4};
		int[] salidaEsperada = {1,4};
		assertArrayEquals(mm.minMax(arrayMM),salidaEsperada);
	}
	
	@Test
	public void testArrayDesordenado(){
		int[] arrayMM = {3,5,6,1,9,10};
		int[] salidaEsperada = {1,10};
		assertArrayEquals(mm.minMax(arrayMM),salidaEsperada);
	}
}
