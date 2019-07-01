
//1
List<String> list = ...;
return IntStream.range(0, list.size())
    .filter(n -> n % 3 == 0)
    .mapToObj(list::get)
    .collect(Collectors.toList());
//2
int[] extractEachKth(int[] inputArray, int k) {
    return IntStream.range(0, inputArray.length).filter(i -> ((i + 1) % k) != 0).map(i -> inputArray[i]).toArray();
}
