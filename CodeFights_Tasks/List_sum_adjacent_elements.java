IntStream.range(0, list.size())
                    .mapToObj(i -> list.get(i) + list.get(i+1))
                     .forEach(i->temp.add(i));
