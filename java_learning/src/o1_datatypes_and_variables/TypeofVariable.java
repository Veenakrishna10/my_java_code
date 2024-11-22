package o1_datatypes_and_variables;

public class TypeofVariable {
	public static void main(String[] args) {
		Integer number=27;
		String text="happy";
		Double decimal=1.23;
		System.out.println("Type of 'number': " +number.getClass().getName());
		System.out.println("Type of 'text': " + text.getClass().getName());
		System.out.println("Type of 'decimal': "+ decimal.getClass().getName());
		
		int n=10;
		System.out.println("Type of 'n' : " + ((Object)number).getClass().getName());
		
		//Example with instanceof
		
		Object obj = "Hello World";
		if(obj instanceof String)
		{
			System.out.println("the object is a String");
		}
			else if (obj instanceof Integer)
			{
				System.out.println("the object is a integer");
			}
				else
				{
					System.out.println("the object type is unknown");
				}
			}
	}

