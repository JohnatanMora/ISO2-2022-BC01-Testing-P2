package es.uclm.esi.labisoII.BC01;

import java.math.*;

public class Triangulos_Metodos {

	public static void comprobarLado3(Triangulo triangulo) throws formacionException{
		//boolean correcto = false;
		double l1 = triangulo.getLado1();
		double l2 = triangulo.getLado2();
		double a1 = Math.toRadians(triangulo.getAngulo1());

		double operacion = (Math.pow(l1, 2)) + (Math.pow(l2, 2)) - 2 * (l1 * l2 * Math.cos(a1));
		double teoremaCoseno = Math.round(Math.sqrt(operacion));

		System.out.println("lado3" + teoremaCoseno);
		if (!(teoremaCoseno == triangulo.getLado3())) {
			throw new formacionException("La combinación de lados y ángulos no permiten formar un triángulos");
		}
	}

	public static void comprobarAngulos(Triangulo triangulo) throws formacionException {
		//boolean correcto = false;

		double sumaAngulos = triangulo.getAngulo1() + triangulo.getAngulo2() + triangulo.getAngulo3();

		if (!(sumaAngulos == 180))
			throw new formacionException("La combinación de lados y ángulos no permiten formar un triángulos");
	}

	public static void comprobarTipoLado(Triangulo triangulo) {

		double l1 = triangulo.getLado1();
		double l2 = triangulo.getLado2();
		double l3 = triangulo.getLado1();

		if ((l1 == l2) && (l2 == l3)) {
			triangulo.setTipoLado("Equilatero");
		} else if ((l1 == l2) || (l1 == l3) || (l2 == l3)) {
			triangulo.setTipoLado("Isosceles");
		} else
			triangulo.setTipoLado("Escaleno");
	}
}