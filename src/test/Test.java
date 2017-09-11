package test;

import modal.Bus;
import modal.Utility;

public class Test {
	public static void main(String args[]) {

		int ratePerKM, distance, totalJourneyRent;

		// getting total fair for bus
		Bus bus = new Bus("tata skyline", "ac");
		distance = Journey.getDistance("Mumbai-Delhi");
		ratePerKM = Journey.getRatePerKM(bus);
		totalJourneyRent = Utility.calculateRent(bus, ratePerKM, distance);
		System.out.println("Trip: " + bus.getModel() + ", " + bus.getAc()
				+ ", " + "Mumbai-Delhi");
		System.out.println("Total expense: " + totalJourneyRent);

	}

}
