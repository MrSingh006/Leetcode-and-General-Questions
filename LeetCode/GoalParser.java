package LeetCode;

public class GoalParser {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] c = command.toCharArray();
        for(int i =0;i<c.length;i++)
        {
            if(c[i] == 'G')
            {
                sb.append('G');
            }
            else if(c[i] == '(' && c[i+1] == ')')
            {
                sb.append('o');
            }
            else if(c[i] == '(' && c[i+1] == 'a')
            {
                sb.append("al");
            }
        }
        return sb.toString();
    }
}
