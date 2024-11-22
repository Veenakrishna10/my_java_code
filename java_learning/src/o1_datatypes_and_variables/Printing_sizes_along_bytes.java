package o1_datatypes_and_variables;

public class Printing_sizes_along_bytes {
public static void main(String[] args) {
	byte b=123;
	short s=12345;
	int a=12345678;
	long l=1234567890123456789L;
	float f=1.23f;
	double d=1.2345;
	char c='v';
	boolean k=true;
	System.out.println("byte: " + b + " (Size: " + Byte.BYTES + " bytes)");
	System.out.println("short: " + s + " (Size: " + Short.BYTES + " bytes) ");
	System.out.println("int: " + a + " (Size: " + Integer.BYTES + " bytes)");
	System.out.println("long: " + l + " (Size: " + Long.BYTES + " bytes)");
	System.out.println("float: " + f + " (Size: " + Float.BYTES + " bytes)");
	System.out.println("double: " + d + " (Size: " + Double.BYTES + " bytes)");
	System.out.println("char: " + c + " (Size: " + Character.BYTES + " bytes)");
	System.out.println("boolean: " + k + " (size: " + 1 + "bytes)");
	
	String r="hello veena";
	System.out.println("string: " + r);
} 
}
