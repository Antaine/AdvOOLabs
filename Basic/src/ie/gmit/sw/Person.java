package ie.gmit.sw;

public class Person {

	private int id;

	public Person(int id) {
		super();
		this.id = id;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("[INFO]" + this + this.id + " about to be GC'd.");
	}

}
