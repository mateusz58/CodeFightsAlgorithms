public static int chosen_character_count(String a,char b)
    {
        int i=0;
 for(char value:a.toCharArray())
 {
     if(value==b)
     {
        i++;
     }

 }
        return i;
    }