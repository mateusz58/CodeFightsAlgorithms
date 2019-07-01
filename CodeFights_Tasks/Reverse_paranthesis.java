public static String reverseParentheses(String s) {

        int st = s.lastIndexOf('(');
        while (st != -1) {
            int ed = s.indexOf(')', st);
            String t = s.substring(0, st);
            t += new StringBuffer(s.substring(st + 1, ed)).reverse().toString();
            t += s.substring(ed + 1);
            s = t;
            st = s.lastIndexOf('(');
        }
        return s;
    }