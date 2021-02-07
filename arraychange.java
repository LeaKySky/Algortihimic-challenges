public class arraychange
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] array2 = new int[array1.length]; //same length as array1
		
		for(int i = array1.length - 1; i >= 0; i--)
		{
			//System.out.println(i);
			//When i = 10, sout 0
			//When i = 9, sout 1
			//When i = 8, sout 2
			//When i = 7, sout 3...
			int j = array1.length - 1 - i;
			//System.out.println(j);
			array2[j] = array1[i];
		}
		array1 = array2;

		for(int i = 0; i < array1.length; i++)
		{
			System.out.println(array1[i]);
		}
	}
}


