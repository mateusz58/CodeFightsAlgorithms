///1 Stream Approach
List<Integer> listWithDuplicates = Lists.newArrayList(1, 1, 2, 2, 3, 3);
    List<Integer> listWithoutDuplicates = listWithDuplicates.stream()
     .distinct()
     .collect(Collectors.toList());
///2 Collection Approach
List<Character> remove_duplicates(List<Character>input)
    {
        Set<Character> noDups = new HashSet<Character>();
        noDups.addAll(input);
        return new ArrayList<Character>(noDups);
    }
