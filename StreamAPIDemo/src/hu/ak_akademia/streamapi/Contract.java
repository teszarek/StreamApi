package hu.ak_akademia.streamapi;

public class Contract {
	
	private final Date signDate;
	private final Person signee;
	private final String text;
	public Contract(Date signDate, Person signee, String text) {
		super();
		this.signDate = signDate;
		this.signee = signee;
		this.text = text;
	}
	public Date getSignDate() {
		return signDate;
	}
	public Person getSignee() {
		return signee;
	}
	public String getText() {
		return text;
	}
	@Override
	public String toString() {
		return "Contract [signDate=" + signDate + ", signee=" + signee + ", text=" + text + "]";
	}

	
	
}
