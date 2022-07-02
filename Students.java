package week3.day1.assignment4;

public class Students {

	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(45678);
		std.getStudentInfo(5794, "akilesh");
		std.getStudentInfo("kekran.mekran@ttt.com", 6545484489498l);
	}

	public void getStudentInfo(int id) {

		System.out.println("Id : " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);

	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email : " + email);
		System.out.println("phoneNumber : " + phoneNumber);
	}

}
