import java.util.*;

public class simplify {

    public static String simplifyPath(String path) {

        // Convert the path into an array
        String[] parts = path.split("/");

        // Create a stack to store folder names
        Stack<String> st = new Stack<>();

        // Process each part
        for (String part : parts) {

            // Ignore empty parts and "."
            if (part.equals("") || part.equals(".")) {
                continue;
            }

            // ".." means go to the parent directory
            else if (part.equals("..")) {

                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            // Normal folder name
            else {
                st.push(part);
            }
        }

        // Convert the stack back into a String
        StringBuilder result = new StringBuilder();

        for (String folder : st) {
            result.append("/");
            result.append(folder);
        }

        // If there are no folders, we are at root
        if (result.length() == 0) {
            return "/";
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String path = "/home/neha/../java";

        String result = simplifyPath(path);

        System.out.println(result);
    }
}