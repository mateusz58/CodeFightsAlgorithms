
//1
[a-z&&[^bc]]

//2 FULL
Pattern p = Pattern.compile("[a-z&&[^bc]]");
        Matcher m = p.matcher(n);
        boolean b = m.matches();
//3 Stream
 Pattern p = Pattern.compile("[a-z&&[^bc]]+");
        Stream.of(inputArray).filter(s -> p.matcher(s).matches()).forEach(System.out::println);