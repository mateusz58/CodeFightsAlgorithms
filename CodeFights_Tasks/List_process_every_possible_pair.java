list.stream()
    .flatMap(i -> list.stream().filter(j -> !i.equals(j)).map(j -> i * 2 + j))
    .forEach(System.out::println);
