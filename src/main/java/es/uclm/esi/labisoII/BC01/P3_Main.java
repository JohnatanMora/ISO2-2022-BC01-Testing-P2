package es.uclm.esi.labisoII.BC01;

public class P3_Main {

	public static String comprobarTriangulo(Triangulo triangulo){

		try {
			Triangulos_Metodos.comprobarLado3(triangulo);
			Triangulos_Metodos.comprobarAngulos(triangulo);
			return "Triangulo " + triangulo.getTipoLado() + " y " + triangulo.getTipoAngulo(); 
		} catch (formacionException e) {
			e.printStackTrace();
			return "Triangulo no valido";
		}
	}
}