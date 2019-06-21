package Stack;

import java.util.Stack;

/**
 * Given an absolute path for a file (Unix-style), simplify it. Or in other words, convert it to the canonical path.
 *
 * In a UNIX-style file system, a period . refers to the current directory. Furthermore, a double period .. moves the directory up a level. For more information, see: Absolute path vs relative path in Linux/Unix
 *
 * Note that the returned canonical path must always begin with a slash /, and there must be only a single slash / between two directory names. The last directory name (if it exists) must not end with a trailing /. Also, the canonical path must be the shortest string representing the absolute path.
 *
 *
 * Example:
 *
 * Input: "/home/"
 * Output: "/home"
 * Explanation: Note that there is no trailing slash after the last directory name.
 *
 * Related Topics: String, Stack
 */

class Simplify_Path {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/+");
        StringBuilder sb = new StringBuilder();
        for (String s : paths) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            }else if (!s.equals(".") && !s.equals("")) {
                stack.push(s);
            }
        }
        while (!stack.isEmpty()) sb.insert(0, "/" + stack.pop());
        if (sb.length() == 0) return "/";
        return sb.toString();
    }
}