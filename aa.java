public class aa
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		String[] array = new String[]{"Saachi", "Rohan", "Rishi", "Arisya"}; 

		String[] duplicate = new String[array.length];
		for(int i = 0; i < array.length; i++)
		{
			if(duplicate[i] == null)
			{
				duplicate[i] = array[i].toLowerCase(); 
			} 
		}

		//From here on I'll be using the duplicate array
		//My algorithim will go through the array and each string
		//Within each string it'll add up the ascii values, if they are greater it'll change it like bubble sort

		for(int i = 0; i < duplicate.length; i++)
		{
			int u = 0; 
			int k = 0; 
			for(int j = 0; j < duplicate[i].length(); j++)
			{
				char x = duplicate[i].charAt(j);
				u = u+x;  
			}
			System.out.println(u);
			//This line has what we need, it prints out the ascii values	
		}
	}
}
