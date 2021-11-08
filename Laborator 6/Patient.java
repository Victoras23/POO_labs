import java.util.Date;
public class Patient extends Person {
	String id;
	String fullname ;
	String gender;
	Date birthDay = new Date();;
	int age;
	Date acceptedDate= new Date();
	String sickness[];
	String prescriptions[];
	String allergies[];
	String specialReqs[];
	OperationsStaff op[];
}
