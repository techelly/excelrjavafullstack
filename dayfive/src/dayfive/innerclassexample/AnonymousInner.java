package dayfive.innerclassexample;

public class AnonymousInner {

	public static void main(String[] args) {
		//Annonymous inner class using abstract class
		Student student = new Student() {

			@Override
			String courseEnrolled() {
				
				return "Java Full Stack";
			}
		
		};
		
		System.out.println(student.courseEnrolled());
		//Annonymous inner class using interface
		Account acc = new Account() {

			@Override
			public void typeOfAccount() {
				System.out.println("Current Account");
				
			}
			
		};
		acc.typeOfAccount();
		
	}

}
