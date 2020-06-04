package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.Ejercicio3;


class Ejercicio3Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"1, lunes",
				"2, martes",
				"3, miercoles",
				"4, jueves",
				"5, viernes",
				"6, sabado",
				"7, domingo",
				"99, ERROR!"})
	
	void testTransformar(int input, String expected) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(expected, c.diaSemana(input));
	}

}
