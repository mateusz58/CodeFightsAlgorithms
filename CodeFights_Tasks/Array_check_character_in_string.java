public static boolean check_character_in_string(String probe_char,String probe_string)
    {
        boolean isInArray = probe_string.contains(probe_char);
        if(isInArray==true)return true;
        else return false;

    }