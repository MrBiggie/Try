import java.util.Stack;

public class Main {

    public static void main(String[] args) {
         int [] right = new int[124];
         char [] pattern = {'a','v','s'};
         System.out.println(pattern[1]);
         System.out.println(right[pattern[2]]);

         Stack<String> Try = new Stack();
         Try.push("1");
         Try.push("2");
         Try.add("a");
//         Try.remove(0);
         System.out.println(Try.size());
         Try.remove(0);

        System.out.println(Try.indexOf("1"));
         System.out.println(Try.get(1));
         System.out.println(Try.peek());
         System.out.println(Try.size());
         //hello
    }
    //add first branch content
}
