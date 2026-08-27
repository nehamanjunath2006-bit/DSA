import java.util.Stack;
class reverse{
    public String reverse(String name){
    Stack<Character> st = new Stack<>();
    String result = "";
    for(int i = 0; i < name.length(); i++){
    char ch = name.charAt(i);
    st.push(ch);
    }
    while(!st.isEmpty()){
        result = result + st.pop();
    }
    return result;
    }
    public static void main(String[] args){
        reverse r = new reverse();
        String name = "java";
        System.out.println(r.reverse(name));
    }
}