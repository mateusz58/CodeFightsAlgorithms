
 public static void readFile() {
        Path file = Paths.get("test.dat");
        Charset chars = Charset.defaultCharset();
        try (BufferedReader reader =
                     Files.newBufferedReader(file, chars)) {String line = null;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IllegalArgumentException | IOException ex) {
            System.err.println(ex.getClass());
        }
    }