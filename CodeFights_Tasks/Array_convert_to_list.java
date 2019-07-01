 #1 opcjaList<Integer> list = Arrays.stream(sequence)
                     .boxed()
                     .collect(Collectors.toList());

#2  List<String> list = Arrays.stream(inputArray).collect(Collectors.toList()); //Java 8