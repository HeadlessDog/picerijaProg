package picerijasProg;

public class StringParbaude {
	public static boolean intParbaude(String input)
	{
		for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
         
	}
		return true;
	}
	
	public static boolean doubleParbaude(String input)
	{
		try
		{
		  Double.parseDouble(input);
		  return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
        
		
	}
	
}
