String longestDigitsPrefix(String inputString)
    {

        StringBuilder sb=new StringBuilder();
        List<String>list=new LinkedList<>();
        for(int i=0;i<inputString.length();i++)
        {
            if(Pattern.compile("[A-Z a-z]+[0-9]+").matcher(String.valueOf(inputString.charAt(i))).matches()){sb.append(inputString.charAt(i));if(i==(inputString.length()-1))list.add(sb.toString());}
            else
            {
                if(sb.length()>0){list.add(sb.toString());sb.setLength(0);}
            }
        }
  return list.stream().max(String::compareTo).get();
    }
