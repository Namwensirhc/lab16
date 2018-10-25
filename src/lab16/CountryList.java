package lab16;

public class CountryList {
	private String listCountries;

	public CountryList(String listCountries) {
		super();
		this.listCountries = listCountries;

	}

	public CountryList(CountryList userInput) {
		// TODO Auto-generated constructor stub
	}

	public String getListCountries() {
		return listCountries;
	}

	public void setListCountries(String listCountries) {
		this.listCountries = listCountries;
	}

	@Override
	public String toString() {
		return listCountries;
	}

}
