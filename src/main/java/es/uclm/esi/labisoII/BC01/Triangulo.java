package es.uclm.esi.labisoII.BC01;

import java.util.InputMismatchException;

public class Triangulo {

	protected static double Lado1;
	protected static double Lado2;
	protected static double Lado3;
	protected static double Angulo1;
	protected static double Angulo2;
	protected static double Angulo3;
	protected static String TipoLado = "";
	protected static String TipoAngulo = "";

	public Triangulo(double lado1, double lado2, double lado3, double angulo1, double angulo2, double angulo3){

		try {
			setLado1(comprobacionDouble(lado1));
			setLado2(comprobacionDouble(lado2));
			setLado3(comprobacionDouble(lado3));
			setAngulo1(comprobacionAngulo(angulo1));
			setAngulo2(comprobacionAngulo(angulo2));
			setAngulo3(comprobacionAngulo(angulo3));
			comprobarTipoLado();
			comprobarTipoAngulo();
		} catch (negativoException e) {
			e.printStackTrace();
		} catch (anguloException e) {
			e.printStackTrace();
		}
	}

	public static double getLado1() {
		return Lado1;
	}

	public void setLado1(double lado) {
		Lado1 = lado;
	}

	public static double getLado2() {
		return Lado2;
	}

	public void setLado2(double lado) {
		Lado2 = lado;
	}

	public static double getLado3() {
		return Lado3;
	}

	public void setLado3(double lado) {
		Lado3 = lado;
	}

	public static double getAngulo1() {
		return Angulo1;
	}

	public void setAngulo1(double angulo) {
		Angulo1 = angulo;
	}

	public static double getAngulo2() {
		return Angulo2;
	}

	public void setAngulo2(double angulo) {
		Angulo2 = angulo;
	}

	public static double getAngulo3() {
		return Angulo3;
	}

	public void setAngulo3(double angulo) {
		Angulo3 = angulo;
	}

	public String getTipoLado() {
		return TipoLado;
	}

	public static void setTipoLado(String tipo) {
		TipoLado = tipo;
	}

	public String getTipoAngulo() {
		return TipoAngulo;
	}

	public static void setTipoAngulo(String tipo) {
		TipoAngulo = tipo;
	}

	public static double comprobacionAngulo(double num) throws negativoException, anguloException {

		num = comprobacionDouble(num);
		if (num >= 180) {
			throw new anguloException("ERROR. El ángulo no puede ser de 180 grados o mayor.\n");
		}
		return num;
	}

	public static double comprobacionDouble(double num) throws negativoException {

		if (num < 0) {
			throw new negativoException("ERROR. El número debe ser positivo.\n");
		}
		return num;
	}

	public static void comprobarTipoLado() {

		if ((Lado1 == Lado2) && (Lado2 == Lado3)) {
			setTipoLado("Equilatero");
		} else if ((Lado1 == Lado2) || (Lado1 == Lado3) || (Lado2 == Lado3)) {
			setTipoLado("Isosceles");
		} else
			setTipoLado("Escaleno");
	}

	public static void comprobarTipoAngulo() {

		if ((Angulo1 == 90) || (Angulo2 == 90) || (Angulo3 == 90)) {
			setTipoAngulo("Rectangulo");
		} else if ((Angulo1 > 90) || (Angulo2 > 90) || (Angulo3 > 90)) {
			setTipoAngulo("Obtusangulo");
		} else
			setTipoAngulo("Acutangulo");
	}
}
