char ch[] = n.toString().toCharArray();
Integer[] testArray = new Integer[String.valueOf(n).length()];
        for(int i=0;i<n.toString().length();i++)testArray[i]=Character.getNumericValue(ch[i]);