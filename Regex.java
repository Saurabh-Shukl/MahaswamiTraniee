import java.util.*;
class Regex{
	public static void main(String[]args){
		int count =0;
		Pattern p =new Pattern.compile("ab");
		Matcher m = p.matcher("abcbcab");
		while(m.find()){
			count++;
			System.out.println(m.start()+ "" +m.end()+ "" +m.group());
		}
		System.out.println("The matching Items are" + count);
	}
}
