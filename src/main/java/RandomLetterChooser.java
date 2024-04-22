public class RandomLetterChooser extends RandomStringChooser
{
	private String[] arr;
	private ArrayList<String> bList;
	public RandomLetterChooser(String str)
	{ 
		bList = new ArrayList<Character>();
		arr = getSingleLetters(str);
		for(int i = 0; i<arr.length(); i++)
			{
				bList.add(arr[i]);
			}
		
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
