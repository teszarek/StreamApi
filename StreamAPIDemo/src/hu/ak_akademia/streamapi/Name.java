package hu.ak_akademia.streamapi;

public class Name {
	
	private final String firstName;
	private final String middleName;
	private final String lastName;
	
	
	public Name(String firstName, String lastName) {
		this(firstName, "", lastName);
	}
	
	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		if (middleName== null || middleName.isEmpty()) {
		return lastName + " " + firstName;
	}else {
		return lastName + " " + middleName + " " + firstName;
	}
	
	}

}
