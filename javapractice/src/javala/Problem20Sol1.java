package javala

class Problem20Sol1 {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        boolean isFormalParentheses = true;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(')
                stack.push(s.charAt(i));
            else
            {
                isFormalParentheses = parenthesesChecker(s.charAt(i), stack);
                if (!isFormalParentheses)
                    return false;
            }
        }

        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public boolean parenthesesChecker (Character c, Stack<Character> stack)
    {
        // switch:
        //     case 1:
        if (stack.isEmpty())
            return false;
        if (c == ')' && stack.peek() == '(')
            stack.pop();
        else if (c == ']' && stack.peek() == '[')
            stack.pop();
        else if (c == '}' && stack.peek() == '{')
            stack.pop();
        else
            return false;

        return true;
    }


}
