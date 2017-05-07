import controllers.StudentController;

public class MVCApplication {

	public static void main(String[] args) {
		StudentController studentController= new StudentController();
		studentController.updateStudentView();
	}
}
