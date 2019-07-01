Pattern pattern = Pattern.compile(",");
try (BufferedReader in = new BufferedReader(new FileReader(csvFile));){
    List<Player> players = in
        .lines()
        .skip(1)
        .map(line -> {
                String[] x = pattern.split(line);
                return new Player(Integer.parseInt(x[0]),
                                  x[1],
                                  x[2],
                                  x[3],
                                  Integer.parseInt(x[4]));
            })
        .collect(Collectors.toList());
    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.writeValue(System.out, players);
}
