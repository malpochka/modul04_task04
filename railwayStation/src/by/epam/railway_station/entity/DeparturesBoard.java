package by.epam.railway_station.entity;

import java.util.Arrays;

public class DeparturesBoard {

	private Train[] trains;
	
{
	Time[] t = { new Time(15, 30, "Понедельник"),
			new Time(11, 25, "Вторник"), 
			new Time(12, 35, "Понедельник"), 
			new Time(8, 10, "Среда"),
			new Time(17, 32, "Суббота") };
	
	trains = new Train[5];
	trains[0] = new Train("Москва", 5, t[0]);
	trains[1] = new Train("Санкт-Петербург", 10, t[1]);
	trains[2] = new Train("Москва", 6, t[2]);
	trains[3] = new Train("Гродно", 8, t[3]);
	trains[4] = new Train("Витебск", 15, t[4]);
	}

	public DeparturesBoard() {

	}

	public Train[] getTrains() {
		return trains;
	}

	public void setTrains(Train[] trains) {
		this.trains = trains;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(trains);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeparturesBoard other = (DeparturesBoard) obj;
		if (!Arrays.equals(trains, other.trains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Расписание поездов: " + "\n" + Arrays.toString(trains);

	}

}
