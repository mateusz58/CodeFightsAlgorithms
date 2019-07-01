List<String> list
  = Stream.of( ... ).filter( ... ).collect( Collectors.toList() );
String[] array = list.toArray( new String[ list.size() ] );

