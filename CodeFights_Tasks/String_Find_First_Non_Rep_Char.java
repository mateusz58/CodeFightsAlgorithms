Using Java 8:

public static char findFirstNonRepChar(String string) {
    Map<Integer,Long> characters = string.chars().boxed()
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    return (char)(int)characters.entrySet().stream()
            .filter(e -> e.getValue() == 1L)
            .findFirst()
            .map(Map.Entry::getKey)
            .orElseThrow(() -> new RuntimeException("No unrepeated character"));
}
Non Java 8 equivalent:

public static char findFirstNonRepChar(String string) {
  Map<Character, AtomicInteger> characters = new LinkedHashMap<>(); // preserves order of insertion.
  for (int i = 0; i < string.length(); i++) {
    char c = string.charAt(i);
    AtomicInteger n = characters.get(c);
    if (n == null) {
      n = new AtomicInteger(0);
      characters.put(c, n);
    }
    n.incrementAndGet();
  }
  for (Map.Entry<Character, AtomicInteger> entry: characters.entries()) {
    if (entry.getValue().get() == 1) {
      return entry.getKey();
    }
  }
  throw new RuntimeException("No unrepeated character");
}
//My unfinished
char firstNotRepeatingCharacter(String s)
    {
        LinkedList<Character>list=new LinkedList<>();
        Character temp=' ';
        for (int i = 0; i < s.length(); i++)
        {
            if(list.contains(s.charAt(i))){list.removeFirstOccurrence(s.charAt(i));continue;};
            if(!list.contains(s.charAt(i))){list.add(s.charAt(i));}
        }
        list.stream().forEach(System.out::println);
        if(list.isEmpty())return '_';
        else return list.getFirst();
    }