package stack;

import java.util.Stack;

public class TrainStack_5b {
    String InfixExp = "";
    String PostExp = "";
    Stack<Character> f = new Stack<Character>();

    public void SetInfixExp(String InfixExp) {
        this.InfixExp = InfixExp;
    }

    public boolean Operator(char ris) {
        if (ris == '+' || ris == '-' || ris == '*' || ris == '/') {
            return true;
        }
        return false;
    }

    public int DeegreOper(char kia) {
        if (kia == '+' || kia == '-') {
            return 1;
        } else if (kia == '*' || kia == '/') {
            return 2;
        } else if (kia == '^') {
            return 3;
        } else {
            return 0;
        }
    }

    public String ToPostFix() {
        char ris;
        for (int i = 0; i < InfixExp.length(); i++) {
            ris = InfixExp.charAt(i);

            if (Operator(ris)) {
                if (f.isEmpty() || DeegreOper(ris) > DeegreOper(f.peek())) {
                    f.push(ris);
                } else {
                    PostExp += f.pop();
                    do {
                        if (f.isEmpty() || DeegreOper(ris) > DeegreOper(f.peek())) {
                            break;
                        } else {
                            PostExp += f.pop();
                        }
                    } while (DeegreOper(ris) <= DeegreOper(f.peek()));
                    f.push(ris);
                }
            } else if (ris == ')') {
                do {
                    PostExp += f.pop();
                } while (f.peek() != '(') ;
                f.pop();
            } else if (ris == '(') {
                f.push(ris);
            } else {
                PostExp += ris;
            }

        } if (!f.isEmpty()) {
            do {
                PostExp += f.pop();
            } while (!f.isEmpty());
        } return PostExp;
    }
}