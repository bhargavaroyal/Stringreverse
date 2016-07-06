
public class revStringBuild {
	public static void main(String[] args){
		String input = "My name is Bond";
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb = sb.reverse();
		for(int i=0; i<=sb.length()-1;i++)
			System.out.print(sb.charAt(i));
	}	
}
