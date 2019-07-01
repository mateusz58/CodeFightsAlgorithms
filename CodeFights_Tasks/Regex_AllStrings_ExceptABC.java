String n;
//1
^(?!ABC$).*
//2 FULL
        Pattern p = Pattern.compile("^(?!ABC$).*");
        Matcher m = p.matcher(n);
        boolean b = m.matches();
