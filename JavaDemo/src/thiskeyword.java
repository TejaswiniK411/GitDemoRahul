
public class thiskeyword {
	
	thiskeyword(){
		System.out.print("Contructor1");
	}
	
thiskeyword(int a ){
	this();
	System.out.print("Contructor2");
	}
thiskeyword(String a ){
	this(12);
	System.out.print("Contructor3");
	
	}
	public static void main(String[] args) {
		thiskeyword k = new thiskeyword("teju");
		
	}

}
