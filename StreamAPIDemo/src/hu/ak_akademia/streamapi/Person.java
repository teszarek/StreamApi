package hu.ak_akademia.streamapi;

public class Person {
	
	private final Name name;
	private final Date dateOfBirth;
	private final Name mothersName;
	private final double height;
	private final double weight;
	
	public Person(Name name, Date dateOfBirth, Name mothersName, double height, double weight) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.mothersName = mothersName;
		this.height = height;
		this.weight = weight;
	}

	public Name getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Name getMothersName() {
		return mothersName;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + ", mothersName=" + mothersName + ", height="
				+ height + ", weight=" + weight + "]";
	}
	
	

}
