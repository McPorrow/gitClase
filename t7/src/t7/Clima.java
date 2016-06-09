package t7;

import java.text.DecimalFormat;  
public class Clima {
	static String[] meses = new String[12];
	static double[] precipitaciones = new double[12];
	static double[] temperatura = new double[12];
    static DecimalFormat decimales = new DecimalFormat("0.00");

	public static void MasCalido(String[] meses, double[] temperatura) {
		double caluroso = 0;
		int posicion = 0;
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] > caluroso) {
				caluroso = temperatura[i];
				posicion = i;
			}

		}

		System.out.println("El mes más caluroso es " + meses[posicion]
				+ " con " + temperatura[posicion] + " grados.");
	}

	public static void MasFrio(String[] meses, double[] temperatura) {
		double frio = 100;
		int posicion = 0;
		for (int i = 0; i < temperatura.length; i++) {
			if (temperatura[i] < frio) {
				frio = temperatura[i];
				posicion = i;
			}
		}
		System.out.println("El mes más frio es " + meses[posicion] + " con "
				+ temperatura[posicion] + " grados.");

	}
	
	public static void MasLluvioso(String[] meses, double[] precipitaciones) {
		double lluvia = 0;
		int posicion = 0;
		for (int i = 0; i < precipitaciones.length; i++) {
			if (precipitaciones[i] > lluvia) {
				lluvia = precipitaciones[i];
				posicion = i;
			}
		}
		System.out.println("El mes más lluvioso es " + meses[posicion] + " con "
				+ precipitaciones[posicion] + " en litros.");
		System.out.println("Cambio para Github");

	}
	
	public static void MasSeco(String[] meses, double[] precipitaciones) {
		double lluvia = 200;
		int posicion = 0;
		for (int i = 0; i < precipitaciones.length; i++) {
			if (precipitaciones[i] < lluvia) {
				lluvia = precipitaciones[i];
				posicion = i;
			}
		}
		System.out.println("El mes más seco es " + meses[posicion] + " con "
				+ precipitaciones[posicion] + " en litros.");

	}
	
	public static void TemperaturaMedia(String[] meses, double[] temperatura) {
		double caluroso = 0;
		for (int i = 0; i < temperatura.length; i++) {
			caluroso = caluroso+temperatura[i];
			}
		caluroso = caluroso/temperatura.length;

		System.out.println("La media de temperatura es de  " +decimales.format(caluroso)+ " grados.");
	}
	
	public static void PrecipitacionMedia(String[] meses, double[] precipitaciones) {
		double precipitacion = 0;
		for (int i = 0; i < precipitaciones.length; i++) {
			precipitacion = precipitacion+precipitaciones[i];
			}
		precipitacion = precipitacion/precipitaciones.length;

		System.out.println("La media de temperatura es de  " +decimales.format(precipitacion)+ " grados.");
	}
	
	
	

	public static void main(String[] args) {
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo",
				"junio", "julio", "agosto", "septiembre", "octubre",
				"noviembre", "diciembre" };
		double[] precipitaciones = { 10, 2, 20, 40.9, 21, 11.32, 55, 77, 66,
				20, 80.40, 100.6 };
		double[] temperatura = { 12, 3.2, 11, 20, 30, 40, 50, 70, 15, 20.2,
				1.5, 15.6 };
		MasCalido(meses, temperatura);
		MasFrio(meses, temperatura);
		MasLluvioso(meses, precipitaciones);
		MasSeco(meses,precipitaciones);
		TemperaturaMedia(meses, temperatura);
		PrecipitacionMedia(meses, precipitaciones);
	}

}
