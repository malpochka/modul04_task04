package by.epam.railway_station.main;

import by.epam.railway_station.entity.*;
import by.epam.railway_station.logic.*;
import by.epam.railway_station.view.*;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, 
 * добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода иформации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массива по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Main {

	public static void main(String[] args) {
		int n;

		DeparturesBoard train = new DeparturesBoard();
		TrainView view=new TrainView();
		TrainLogic logic=new TrainLogic();
		view.print("Расписание поездов: ", train);
		

		n = logic.enterFromConsole("Введите номер поезда");
		logic.infoForPassenger(train, n);

		System.out.println();
		System.out.println("=================СОРТИРОВКА ПО НОМЕРУ ПОЕЗДА================");
		logic.sorting(train);

		System.out.println();
		System.out.println("===============СОРТИРОВКА ПО ПУНКТУ НАЗНАЧЕНИЯ==================");
		logic.sortOfDestination(train);
	}

}
