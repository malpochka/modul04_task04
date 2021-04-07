package by.epam.railway_station.logic;

import java.util.Scanner;

import by.epam.railway_station.entity.*;

public class TrainLogic {

	public int enterFromConsole(String message) {
		int x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		x = sc.nextInt();
		return x;
	}

	public void infoForPassenger(DeparturesBoard t, int z) {
		int count;
		count = 0;

		for (int i = 0; i < t.getTrains().length; i++) {
			if (t.getTrains()[i].getNumberOfTrain() == z) {
				count++;
			}
		}
		if (count >= 1) {
			for (int i = 0; i < t.getTrains().length; i++) {
				if (t.getTrains()[i].getNumberOfTrain() == z) {
					System.out.println("Станция назначения- " + t.getTrains()[i].getDestination() + "; "
							+ " Номер поезда- " + t.getTrains()[i].getNumberOfTrain() + "; " + " Время отправления- "
							+ t.getTrains()[i].getDepartureTime() + "; ");
				}
			}
		} else {
			System.out.println("Поезд с таким номером отсутствует");
		}
	}

	public void sorting(DeparturesBoard t) {

		for (int i = 0; i < t.getTrains().length - 1; i++) {
			for (int j = t.getTrains().length - 1; j > 0; j--) {
				if (t.getTrains()[j - 1].getNumberOfTrain() > t.getTrains()[j].getNumberOfTrain()) {
					Train temp = t.getTrains()[j - 1];
					t.getTrains()[j - 1] = t.getTrains()[j];
					t.getTrains()[j] = temp;
				}
			}
		}
		for (int i = 0; i < t.getTrains().length; i++) {
			System.out.println("Станция назначения- " + t.getTrains()[i].getDestination() + "; " + " Номер поезда- "
					+ t.getTrains()[i].getNumberOfTrain() + "; " + " Время отправления- "
					+ t.getTrains()[i].getDepartureTime() + "; ");
		}
	}

	public void sortOfDestination(DeparturesBoard t) {

		for (int i = 0; i < t.getTrains().length - 1; i++) {
			for (int j = i + 1; j < t.getTrains().length; j++) {
				if (t.getTrains()[j].getDestination().compareToIgnoreCase((t.getTrains()[i].getDestination())) < 0) {
					Train temp = t.getTrains()[i];
					t.getTrains()[i] = t.getTrains()[j];
					t.getTrains()[j] = temp;
				} else if (t.getTrains()[j].getDestination().equals(t.getTrains()[i].getDestination())) {
					Train tem = t.getTrains()[j];
					t.getTrains()[j] = t.getTrains()[i];
					t.getTrains()[i] = tem;

				}
			}
		}

		for (Train g : t.getTrains()) {
			System.out.println("Станция назначения- " + g.getDestination() + "; " + " Номер поезда- "
					+ g.getNumberOfTrain() + "; " + " Время отправления- " + g.getDepartureTime() + "; ");
		}
	}

}
