package com.rabin;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Balanced {
	
	public boolean checkString(String s) {
		if(s.length()%2==1) {
			return false;
		}
		HashMap<Character, Character> map = new HashMap<Character, Character>();
           
                map.put('(', ')');
                map.put('[', ']');
                map.put('{', '}');
           
        Stack<Character> stack= new Stack<Character>();
		char[] charArray =s.toCharArray();
		
		  for(Character c : charArray) {
			if(map.keySet().contains(c)) {
				   stack.push(c);
			}
			else
				if (map.values().contains(c)) {
					if(!stack.isEmpty() && map.get(stack.peek())==c) {
						stack.pop();
						
					}
					else
						return false;
				} 
		   }
		
		
		
		return stack.isEmpty();
	}

	public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
     
    
     System.out.println("please enter the String:");
     String str=sc.nextLine();
     Balanced bp=new Balanced();
     boolean answer=bp.checkString(str);
     if(answer==true)
    	 System.out.println("YES ITS BALANCED");
     else
    	 System.out.println("NOP SORRY");
		
	}
	

}
