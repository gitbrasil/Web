/**
 * 
 * 4 de out de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */

package com.time;

public class TestTime {

	public static void main(String[] args) {

		// instanciar objeto
		SemGetSet timeerro = new SemGetSet();

		// atribuir valores
		timeerro.hour = 27;
		timeerro.minute = 85;
		timeerro.second = -523;

		// exibir
		System.out.println("Sem Get & Set");
		System.out.println("Horario de Brasilia " + timeerro.toString());

		// instanciar objeto
		ComGetSet timecerto = new ComGetSet();
		
		// atribuir valores
		timecerto.setHour(27);
		timecerto.setMinute(85);
		timecerto.setSecond(-523);
		
		// exibir
		System.out.println();
		System.out.println("Com Get & Set");
		System.out.println("Horario de Brasilia " + timecerto.toString());
	}

}
