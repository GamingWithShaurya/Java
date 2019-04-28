package helloWorld;

public class script1 {
	
	static String randomWord = "press me";
	
	static final double Number = 23;
	
	public static void main(String[] args)
	{
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt  = 2100000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.1428578023973286437525D;
		
/*		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
*/		
		boolean hello = true;
		for (int i = 0; i < 10; i++) {
			float ranNum = (float) (Math.random());
			System.out.println(ranNum);
		}
		char randomNumber = (char) (Math.random()*100);
		System.out.println(randomNumber);
	}

}