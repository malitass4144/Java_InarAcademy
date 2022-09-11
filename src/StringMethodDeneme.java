
public class StringMethodDeneme {

	public static void main(String[] args) {
		
		//length
		
        String temp ="I love Inar Academy";
		
		int length=temp.length();
		
		System.out.println(length);
		
		//substring
		
		String yeni=temp.substring(3,9);
		System.out.println(yeni);
		
		//equals ignore case
		
		String temp1="inar";
		String temp2="iNar   ";
		temp1.equalsIgnoreCase(temp2);
		
		//trim
		System.out.println(temp2.trim());
		
		//char at
		
		System.out.println(temp2.charAt(0));
		
		//tolowercase
		
		String s1="CIBULI";
		
		String s2=s1.toLowerCase();
		
		System.out.println(s2);
		
		//touppercase
		
		String a1="very well";
		String a2=a1.toUpperCase();
		System.out.println(a2);
		
		
		
		
	
		
		

	}
	
}
