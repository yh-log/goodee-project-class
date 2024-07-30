package chap07.ex06;

public class Client {

	public static void main(String[] args) {

		VingsuConcrete maker = new VingsuConcrete();
		
//		접시를 준비하는 경우 
//		Vingsu v = new RedBeanVingsu();
//		maker.makeVingsu(v);
		
		maker.makeVingsu(new RedBeanVingsu());
		maker.makeVingsu(new ChocoVingsu());
		maker.makeVingsu(new CookieVingsu());
	}

}
