    IntStream.range(0, list.size())
                    .filter(i->i%2==0)
                    .mapToObj(i -> list.get(i) + list.get(i+1))
                     .forEach(i->temp.add(i));
