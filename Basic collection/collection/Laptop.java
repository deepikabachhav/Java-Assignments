package com.collection;

public class Laptop {
	private String company;
	private int model;
	private String OperatingSystem;
	private String Processor;

	public Laptop(String company, int model, String operatingSystem,
			String processor) {
		this.company = company;
		this.model = model;
		this.OperatingSystem = operatingSystem;
		this.Processor = processor;
	}

	public String getCompany() {
		return company;
	}

	public int getModel() {
		return model;
	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public String getProcessor() {
		return Processor;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model
				+ ", OperatingSystem=" + OperatingSystem + ", Processor="
				+ Processor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((OperatingSystem == null) ? 0 : OperatingSystem.hashCode());
		result = prime * result
				+ ((Processor == null) ? 0 : Processor.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + model;
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
		Laptop other = (Laptop) obj;
		if (OperatingSystem == null) {
			if (other.OperatingSystem != null)
				return false;
		} else if (!OperatingSystem.equals(other.OperatingSystem))
			return false;
		if (Processor == null) {
			if (other.Processor != null)
				return false;
		} else if (!Processor.equals(other.Processor))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model != other.model)
			return false;
		return true;
	}

}
