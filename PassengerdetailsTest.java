package collections;

import java.util.List;

public class PassengerdetailsTest {
	public static void main(String[] args) {
		PassengerDetails pass = new PassengerDetails();
		List<Passenger> data = pass.getPassengerDetails();
		for (Passenger t : data) {
			System.out.println(t.Name + "\t" + t.Gender + "\t" + t.Age + "\t" + t.Ph_no + "\t" + t.oper.Name + "\t"
					+ t.oper.Reg_no + "\t" + t.oper.Sv_no + "\t" + t.oper.Type);
		}
	}

}
