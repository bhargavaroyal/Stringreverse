
public class revStringArry {
	public static void main(String[]args){
		String input ="My name is Bond";
		char[]tempo = input.toCharArray();
		int left,right =0;
		right = tempo.length-1;
		for(left =0; left < right;left++,right--)
			//swap of array
		{
			char  temp = tempo[left];
			tempo[left] = tempo[right];
			tempo[right] = temp;
			
	}
	
	for(char c:tempo)
		System.out.print(c);
		System.out.println();

	}}
