package by.epam.railway_station.entity;

public class Time {
	private int hour;
	private int minute;
	private String day;

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.day = " ";

	}

	public Time(int hour, int minute, String day) {
		
		this.hour = hour;
		
		 if (this.hour > 24) {
			this.hour = 0;
		}
		this.minute = minute;
		
		 if (this.minute > 60) {
			this.minute = 0;
		}
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;

	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ", " + day;

	}
}
