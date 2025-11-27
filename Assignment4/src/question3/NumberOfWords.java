package question3;

import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFromFile();
		readFromLine();
	}
	
	private static void readFromLine() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		
		String[] s = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("")) {
				continue;
			}else {
				if(map.containsKey(s[i])) {
					map.put(s[i], map.get(s[i])+1);
				}else {
					map.put(s[i], 1);
				}
			}
			
		}
		
		for(String key : map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
	}
	
	private static void readFromFile() {
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		try(FileReader fr = new FileReader("src/question3/f1")){
			int data;
			StringBuilder sb = new StringBuilder();
			while((data=fr.read()) != -1) {
				char ch = (char)data;
				if(!Character.isWhitespace(ch)) {
					sb.append(ch);
				}else {
					if(sb.length() == 0) {
						continue;
					}
					//System.out.println(sb.toString());
					if(map.containsKey(sb.toString())) {
						map.put(sb.toString(), map.get(sb.toString())+1);
					}else {
						map.put(sb.toString(), 1);
					}
					sb = new StringBuilder();
				}
			}
			if(map.containsKey(sb.toString()))
				map.put(sb.toString(), map.get(sb.toString())+1);
			else
				map.put(sb.toString(), 1);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		for(String key : map.keySet()) {
			//System.out.println(key+"  "+map.get(key));
			System.out.println(key + " : " + map.get(key));
		}
	}

}
