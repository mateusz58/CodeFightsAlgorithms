 Pattern p = Pattern.compile("(^(?!@$).+)\\@(\\w+\\.?[a-z]{0,3})");
        Matcher m = p.matcher(address);
        System.out.println(m.matches());
        if(m.matches()) address=m.group(2);
        return address;
