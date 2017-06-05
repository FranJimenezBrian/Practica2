package prPractica2.Test;

import org.junit.Test;

import prPractica2.MinMax;

public class MinMaxTestCajaBlanca {

	MinMax mm = new MinMax();
	@Test
	public void statementCoverage(){
		
		int arrayMM[] = {2,3,3,3,1,5};
		mm.minMax(arrayMM);
	}
	
	@Test
	public void decisionCoverage(){
		//int arraySt[] = {1,1};
		//mm.minMax(arraySt);
	}
	
	@Test
	public void conditionCoverage(){
		//int arraySt[] = {5,1,2,3,5};
		//mm.minMax(arraySt);
	}
	
	@Test
	public void decisionConditionCoverage(){
		
	}
}
