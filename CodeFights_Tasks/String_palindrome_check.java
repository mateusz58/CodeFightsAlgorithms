boolean checkPalindrome(String inputString) {
char[] charArray = inputString.toCharArray();
String s="";
String r="";
for(int i=0;i<charArray.length;i++){s=s+charArray[i];}
for(int i=charArray.length-1;i>=0;i--){r=r+charArray[i];}
if(r.equals(s))return true;
else return false;    
}
