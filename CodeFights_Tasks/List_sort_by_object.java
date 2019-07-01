     Collections.sort(set, new Comparator<Car>() {
                        @Override
                        public int compare(Car o1, Car o2) {
                            try {
                                return Time_converter.convert_string_to_date_time(o1.getDateFrom()).compareTo(Time_converter.convert_string_to_date_time(o2.getDateFrom()));

                            } catch (ParseException e1) {
                                Log.e(getClass().getSimpleName(), "Exception handled", e1);
                                return 0;
                            }
                        }
                    });
                