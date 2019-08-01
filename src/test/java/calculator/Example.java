package calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.OperationModel;
import com.example.service.CalculateSimple;

@RunWith(SpringRunner.class)
public class Example {

	@Test
	public void test() {
		assertEquals(2L, 2L);
	}
	
	
	public int suma(int a, int b) {
		OperationModel op = new OperationModel(a, b);
		CalculateSimple cal = new CalculateSimple();
		op.setOperation("suma");
		return cal.add(op);
	}
	public int resta(int a, int b) {
		OperationModel op = new OperationModel(a, b);
		CalculateSimple cal = new CalculateSimple();
		op.setOperation("resta");
		return cal.subtract(op);
	}
	
	@Test
	public void testSuma() {
		assertEquals(10, suma(4,6));
		assertEquals(100, suma(40,60));
		assertEquals(10, suma(5,5));
		assertEquals(333, suma(111,222));
	}
	
	@Test
	public void testResta() {
		assertEquals(10, resta(40,30));
		assertEquals(100, resta(500,400));
		assertEquals(10, resta(100,90));
		assertEquals(333, resta(444,111));
	}
	

}
