package com.collection;
/**
 * @author dbachhav
 *Television is a class which overrides hashcode(), equals(), toString() methods.
 */
public class Television {
	private String company;
	private String type;
	private boolean enabled3d;
	private int price;

	public Television(String company, String type, boolean enabled3d, int price) {
		this.company = company;
		this.type = type;
		this.enabled3d = enabled3d;
		this.price = price;

	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type
				+ ", enabled3d=" + enabled3d + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + (enabled3d ? 1231 : 1237);
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (enabled3d != other.enabled3d)
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public boolean isEnabled3d() {
		return enabled3d;
	}

	public int getPrice() {
		return price;
	}

}
