//1 My solution
String(String inputString)
{
inputString=" "+inputString;
        if(inputString.matches("[\\s]?[0-9]+"))return inputString.replaceAll("[\\s]","");
        Pattern p = Pattern.compile("[0-9]+[A-Za-z]+");
        Matcher m = p.matcher(inputString);
        String max="";
        System.out.println(m.matches());
        while (m.find())
        {
            System.out.println(m.group().replaceAll("[A-Za-z]",""));
            if(max.length()<m.group().replaceAll("[A-Za-z]","").length())max=m.group().replaceAll("[A-Z a-z]","").toString();
        }
        return max;
}
//2 The best solution
String longestDigitsPrefix(String inputString) {
    return inputString.replaceAll("^(\\d*).*","$1");
}


