import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str){

        HashMap<Character, Character> MappedBrakets = new HashMap<>();

        MappedBrakets.put(')','(');
        MappedBrakets.put(']','[');
        MappedBrakets.put('}','{');

        Stack<Character> stackt = new Stack<>();

        for (int i=0; i < str.length(); i++){
            char c = str.charAt(i);


            if(!MappedBrakets.containsKey(c)){
                stackt.push(c);
            }
            else {
                if(stackt.isEmpty()){
                    return false;
                }
                char topElement = stackt.pop();
                if(topElement != MappedBrakets.get(c)){
                    return false;
                }
            }

        }

        return stackt.isEmpty();
    }


    public static void main(String[] args) {
        String str = "{()}";
        System.out.println(isValid(str));
    }


}
