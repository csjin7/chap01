package chap01;

public class EnumMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = Week.FRIDAY;
		String name = today.name();
		
		System.out.println(name);
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int res1 = day1.compareTo(day2);
		int res2 = day2.compareTo(day1);
		
		System.out.println(" day1 compare day2  " + res1);
		System.out.println(" day2 compare day1  " + res2);
		
		Week weekday = Week.valueOf("SUNDAY");
		
		System.out.println("value of day : " + weekday);
		
		Week[] days =  Week.values();
		for (Week day : days) {
			System.out.println(" Week.valeus() : " + day); 
		}
		
	}

}
