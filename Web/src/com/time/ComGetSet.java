/**
 * Classe 'Time' para teste do Get e Set (com)
 * 4 de out de 2017 - Learning Java-Eclipse
 * sergio.torres@outlook.com
 */

package com.time;

public class ComGetSet {

	private int hour;
	private int minute;
	private int second;

	// horas
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	// minutos
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	// segundos
	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second > 0 || second < 59) {
			this.second = 0;

		} else {
			this.second = second;
		}
	}

	// mascara de hora
	public String toString() {
		return getHour() + ":" + getMinute() + ":" + getSecond();
	}
}