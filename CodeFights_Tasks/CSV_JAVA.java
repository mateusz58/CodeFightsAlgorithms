 File input = new File(File_csv);
            File output = new File("output.json");
            CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build();
            CsvMapper csvMapper = new CsvMapper();
            // Read data from CSV file
            List<Object> readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();
            ObjectMapper mapper = new ObjectMapper();
            // Write JSON formated data to output.json file
            mapper.writerWithDefaultPrettyPrinter().writeValue(output, readAll);
            // Write JSON formated data to stdout
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(readAll));