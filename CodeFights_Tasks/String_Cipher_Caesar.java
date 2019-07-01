String alphabeticShift(String inputString) {
    Character []ch=new Character[inputString.length()];
    for(int i=0;i<inputString.length();i++)ch[i]=inputString.charAt(i);
return Stream.of(ch).map(i->
    {
        if (i == 122 || i == 90) {
            if (i == 122) i = 97;
            else i = 65;
        } else i++;
        return i;
    })
            .map(i->Character.toChars(i)).parallel().collect( StringBuilder::new,
                (sb, i) -> sb.append(i),
                StringBuilder::append
        ).toString();
  }