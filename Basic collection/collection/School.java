package com.collection;

public class School {
	private String name;
	private String city;
	private String SchoolDistrict;
	private int greatSchoolRanking;

	public School(String name, String city, String school,
			int greatSchoolRanking) {
		this.name = name;
		this.city = city;
		this.SchoolDistrict = SchoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", SchoolDistrict="
				+ SchoolDistrict + ", greatSchoolRanking=" + greatSchoolRanking
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((SchoolDistrict == null) ? 0 : SchoolDistrict.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + greatSchoolRanking;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		School other = (School) obj;
		if (SchoolDistrict == null) {
			if (other.SchoolDistrict != null)
				return false;
		} else if (!SchoolDistrict.equals(other.SchoolDistrict))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (greatSchoolRanking != other.greatSchoolRanking)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getSchoolDistrict() {
		return SchoolDistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

}
