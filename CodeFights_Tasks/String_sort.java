//JAVA8
String sorted =
        Stream.of("edcba".split(""))
        .sorted()
        .collect(Collectors.joining());
//
String a ="dgfa";
    char [] c = a.toCharArray();
    Arrays.sort(c);
    return new String(c);
