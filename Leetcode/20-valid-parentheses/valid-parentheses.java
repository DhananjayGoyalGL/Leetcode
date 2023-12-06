class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);

        switch(ch){
            case '(':
            case '{':
            case '[':
            stack.push(ch);
            break;

            case')':
            if(stack.isEmpty() || stack.peek() != '(') {
                return false;
            } stack.pop();
            break;
    
            case'}':
            if(stack.isEmpty() || stack.peek() != '{') {
                return false;
            } stack.pop();
            break;
    

           case']':
           if(stack.isEmpty() || stack.peek() != '[') {
               return false;
           } stack.pop();
           break;
    
    case default: break;
  }
} 
return stack.isEmpty();
  }
}