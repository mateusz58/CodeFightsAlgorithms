String listString = list.stream().map(Object::toString)
                        .collect(Collectors.joining(", "));