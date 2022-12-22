package es.uclm.esi.labisoII.BC01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {
	
	String noValido = "Triangulo no valido";
	String equi_acutan = "Triangulo Equilatero y Acutangulo";
	String iso_acutan = "Triangulo Isosceles y Acutangulo";
	String iso_rectan = "Triangulo Isosceles y Rectangulo";
	String iso_obtusan = "Triangulo Isosceles y Obtusangulo";
	String escal_acutan = "Triangulo Escaleno y Acutangulo";
	String escal_rectan = "Triangulo Escaleno y Rectangulo";
	String escal_obtusan = "Triangulo Escaleno y Obtusangulo";

	/**
	 * Test method for {@link es.uclm.esi.iso2.ismael.Calculator#add(int, int)}.
	 */
	@Test
	public void comprobarTrianguloTestDecisiones() {
		assertEquals(noValido, P3_Main.comprobarTriangulo(new Triangulo(5,4,7,-2,80,90)));
		assertEquals(equi_acutan, P3_Main.comprobarTriangulo(new Triangulo(3,3,3,60,60,60)));
		assertEquals(noValido, P3_Main.comprobarTriangulo(new Triangulo(5,4,7,200,80,90)));
		assertEquals(iso_obtusan, P3_Main.comprobarTriangulo(new Triangulo(9.83,6,6,35,35,110)));
		assertEquals(iso_acutan, P3_Main.comprobarTriangulo(new Triangulo(4,9,9,77.16,77.16,25.68)));
		assertEquals(equi_acutan, P3_Main.comprobarTriangulo(new Triangulo(4,4,4,60,60,60)));
		assertEquals(noValido, P3_Main.comprobarTriangulo(new Triangulo(4,9,4,35,25,120)));
		assertEquals(noValido, P3_Main.comprobarTriangulo(new Triangulo(8,4,3,60,60,60)));
		assertEquals(iso_rectan, P3_Main.comprobarTriangulo(new Triangulo(9.899,7,7,45,45,90)));
		assertEquals(equi_acutan, P3_Main.comprobarTriangulo(new Triangulo(11,11,11,60,60,60)));
		assertEquals(iso_obtusan, P3_Main.comprobarTriangulo(new Triangulo(10.392,6,6,30,30,120)));
		assertEquals(escal_rectan, P3_Main.comprobarTriangulo(new Triangulo(6.32,3,7,90,25.38,64.62)));
		assertEquals(noValido, P3_Main.comprobarTriangulo(new Triangulo(4,3,8,45,55,80)));
		assertEquals(escal_obtusan, P3_Main.comprobarTriangulo(new Triangulo(5.38,3,7,110,23.75,46.25)));
		assertEquals(noValido, P3_Main.comprobarTriangulo(new Triangulo(1,7,2,20,40,112)));
	}

	/**
	 * Test method for {@link es.uclm.esi.iso2.ismael.Calculator#subtract(int, int)}.
	 */
	@Test
	public void comprobarTrianguloTestMC_DC() {
		assertEquals(equi_acutan, P3_Main.comprobarTriangulo(new Triangulo(3,3,3,60,60,60)));
		assertEquals(iso_acutan, P3_Main.comprobarTriangulo(new Triangulo(11,9,11,65.85,48.30,65.85)));
		assertEquals(iso_rectan, P3_Main.comprobarTriangulo(new Triangulo(5,5,7,90,45,45)));
		assertEquals(iso_obtusan, P3_Main.comprobarTriangulo(new Triangulo(8.66,5,5,30,30,120)));
		assertEquals(escal_acutan, P3_Main.comprobarTriangulo(new Triangulo(7.96,5.196,7,60,40,80)));
		assertEquals(escal_rectan, P3_Main.comprobarTriangulo(new Triangulo(12.09,10.5,6,30,60,90)));
		assertEquals(escal_obtusan, P3_Main.comprobarTriangulo(new Triangulo(12.295,8.143,6,25,35,120)));
		assertEquals(noValido, P3_Main.comprobarTriangulo(new Triangulo(5,1,7,40,70,120)));
	}

	/**
	 * Test method for {@link es.uclm.esi.iso2.ismael.Calculator#subtract(int, int)}.
	 */
	

	
	
}
