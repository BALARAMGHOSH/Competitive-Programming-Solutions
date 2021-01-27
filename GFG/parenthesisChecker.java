import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            String st = sc.next();
            
            if(new Parenthesis().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}


class Parenthesis
{
    static boolean ispar(String expr)
    {
        Deque<Character> stack 
            = new ArrayDeque<Character>(); 
  
        for (int i = 0; i < expr.length(); i++)  
        { 
            char x = expr.charAt(i); 
  
            if (x == '(' || x == '[' || x == '{')  
            { 
                stack.push(x); 
                continue; 
            } 
  
            if (stack.isEmpty()) 
                return false; 
            char check; 
            switch (x) { 
            case ')': 
                check = stack.pop(); 
                if (check == '{' || check == '[') 
                    return false; 
                break; 
  
            case '}': 
                check = stack.pop(); 
                if (check == '(' || check == '[') 
                    return false; 
                break; 
  
            case ']': 
                check = stack.pop(); 
                if (check == '(' || check == '{') 
                    return false; 
                break; 
            } 
        } 
  
        return (stack.isEmpty()); 
    }
}
