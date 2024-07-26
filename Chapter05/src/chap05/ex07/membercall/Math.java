package chap05.ex07.membercall;

public class Math {
	
	public Math() {
	}

//	String
	
//	멤버를 선언해주는 이유는 : 넣은 값을 메소드 종료 후 삭제하지 않고, 남겨두기 위함으로 이렇게 계산만 필요한 경우에는 선언하지 않아도 괜찮음
	
//	public String str;
//	public String str1;
//	public int num;
//	public double dos;
//	public long lo;
//	public float fl;
	
	
//	★ 메소드명 설정을 하는게 어렵다....!!!!
	
	public String plusString2(String str, String str1) {
//		this.str = str;
//		this.str1 = str1;
		
		return str + str1;
	}
	
	public String plusStringInt(String str, int num) {
//		this.str = str;
//		this.num = num;
		
		return str + num;
	}
	
	public String plusStringDouble(String str, double dos) {
//		this.str = str;
//		this.dos = dos;
		
		return str + dos;
	}
	
	public String plusIntString(int num, String str) {
//		this.num = num;
//		this.str = str;
		
		return num + str;
	}
	
	public String plusDoubleString(double dos, String str) {
//		this.dos = dos;
//		this.str = str;
		
		return dos + str;
	}
	
	public String plusStringLong(String str, long lo) {
//		this.str = str;
//		this.lo = lo;
		
		return str + lo;
	}
	
	public String plusLongString(long lo, String str) {
//		this.lo = lo;
//		this.str = str;
		
		return lo + str;
	}
	
	public String plusStringFloat(String str, float fl) {
//		this.str = str;
//		this.fl = fl;
		
		return str + fl;
	}
	
	public String plusFloatString(float fl, String str) {
//		this.fl = fl;
//		this.str = str;
		
		return fl + str;
	}
	
	
//	int
	public int kr1;
	public String kr2;
	public double kr3;
    public int kr4;
    public float kr5;

    public String pluskr1(int kr1, String kr2) {
        this.kr1 = kr1;
        this.kr2 = kr2;
        return kr1 + kr2;
     }
     public int pluskr2(int kr1, int kr4) {
        this.kr1 = kr1;
        this.kr4 = kr4;
        return kr1 + kr4;
     }
     public double pluskr3(int kr1, double kr3) {
        this.kr1 = kr1;
        this.kr3 = kr3;
        return kr1 + kr3;
     }
     public float pluskr4(int kr1, float kr5) {
        this.kr1 = kr1;
        this.kr5 = kr5;
        return (kr1 + kr5);
     }
     
//   double
    public int a;
    public double b;
    public double d;
    public String c;
    public float e;
     
    public double plus1(double b, double d) {
    	this.b = b;
        this.d = d;
        return (b + d);
     }
     public double plus2(double b, int a) {
        this.b = b;
        this.a = a;
        return (b + a);
     }
     public String plus3(double b, String c) {
        this.b = b;
        this.c = c;
        return (b + c);
     }
     public double plus4(double b, float e) {
        this.b = b;
        this.e = e;
        return (b + e);
     }
    
}
