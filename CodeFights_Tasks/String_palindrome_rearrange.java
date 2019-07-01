public static boolean palindromeRearranging(String inputString) {
        if(checkPalindrome(inputString)==true)return true;
        if(inputString.length()%2==0)
        {
           for(Character val:inputString.toCharArray()){
            if(chosen_character_count(inputString,val)%2==0){continue;}
               else return false;
           }
        }
        else
        {
            int counter=0;
            for(Character val:inputString.toCharArray()){
                if(chosen_character_count(inputString,val)%2==0){continue;}
                else
                {
                  if(counter==0)counter++;
                    else return false;
                }
            }
        }
        return true;
    }