IntStream.range(0, list.size())
                .filter(n -> n % 2 == 0)
                .mapToObj(list::get)
                .filter(i->i>3).mapToInt(i->i).sum();
