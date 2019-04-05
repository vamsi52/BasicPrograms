package collections;
import java.util.ArrayList;
import java.util.List;

public class PassengerDetails {
		List<Passenger> getPassengerDetails() {
			List<Passenger> travel = new ArrayList<>();
			
		Passenger p = new Passenger();
			
			p.Name= "kumar";
			p.Gender="male";
			p.Age=25;
			p.Ph_no=99880077;
			p.oper.Name= "Orange Travels";
			p.oper.Reg_no= "AP 05 BT 9999";
			p.oper.Sv_no= 1081;
			p.oper.Type="Ac semi sleeper";
		travel.add(p);
			
		Passenger p1 = new Passenger();
			
			p1.Name= "Raji";
			p1.Gender="Female";
			p1.Age=24;
			p1.Ph_no=88779966;
			p1.oper.Name= "Kaveri Travels";
			p1.oper.Reg_no= "AP 37 DV 7777";
			p1.oper.Sv_no= 1123;
			p1.oper.Type="Ac 2+1 sleeper";
		travel.add(p1);
			
			return travel;
}
}