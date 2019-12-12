package emailApp;

public class EmailApp {

	public static void main(String[] args) {

		Email em1 = new Email("Varinder", "Rehal");
		
		em1.setAlternateEmail("vr@gmail.com");
		//System.out.println(em1.getAlternativeEmail());
		System.out.println(em1.showInfo());
		
	}

}
