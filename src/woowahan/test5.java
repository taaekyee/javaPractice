package woowahan;

import java.util.Stack;

public class test5 {

	public static int solution(String S) {
		String[] s = S.split(" ");
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < s.length; i++) {
			// System.out.println(s[i]);
			try {
				switch (s[i]) {
				case "DUP":
					stack.push(stack.peek());
					break;
				case "POP":
					stack.pop();
					break;
				case "+":
					stack.push(stack.pop() + stack.pop());
					break;
				case "-":
					stack.push(stack.pop() - stack.pop());
					break;
				default:
					stack.push(Integer.parseInt(s[i]));
					break;

				}
			} catch (Exception e) {
				return -1;
			}
			for(int a = 0;a<stack.size();a++){
				System.out.print(stack.get(a)+ " ");
			}
			System.out.println();
		}

		if (stack.isEmpty())
			return -1;
		else
			return stack.pop();
	}

	public static void main(String[] args) {
		// System.out.println(solution("13 DUP 4 POP 5 DUP + DUP + -"));
		System.out.println(solution("21 DUP 4 POP 5 DUP + DUP + -"));
	}
}
