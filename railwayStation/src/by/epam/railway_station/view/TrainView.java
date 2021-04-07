package by.epam.railway_station.view;

import by.epam.railway_station.entity.*;

public class TrainView {

public  void print(String message, DeparturesBoard t) {
		
		System.out.println(message);

		for (int i = 0; i < t.getTrains().length; i++) {
			System.out.println("Станция назначения- " + t.getTrains()[i].getDestination() + "; " + " Номер поезда- "
					+ t.getTrains()[i].getNumberOfTrain() + "; " + " Время отправления- "
					+ t.getTrains()[i].getDepartureTime() + "; ");
		}
	}

}