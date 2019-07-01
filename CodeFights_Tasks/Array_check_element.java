
for int double long etc:

boolean contains = IntStream.of(a).anyMatch(x -> x == 4);\


for string :
boolean sInArray = Arrays.stream(values).anyMatch("s"::equals);

Third method:

Arrays.asList(s1).contains("a");



