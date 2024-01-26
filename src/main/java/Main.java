
public void setup() 
{
  String[] lines = {"beast","dough","happy","question","star","three","eagle","try"};
  for (int i = 0 ; i < lines.length; i++) 
  {
    System.out.println(pigLatin(lines[i]));
  }
}
public void draw()
{
        //not used
}
public int findFirstVowel(String sWord){
  if(sWord.length()>0){
    for(int i=0;i<sWord.length();i++){
      if(sWord.substring(i,i+1).equals("a")||sWord.substring(i,i+1).equals("e")||sWord.substring(i,i+1).equals("i")||sWord.substring(i,i+1).equals("o")||sWord.substring(i,i+1).equals("u")){
        return i;
      }
    }
  }
  return -1;
  
}
public String pigLatin(String sWord){
//precondition: sWord is a valid String of length greater than 0
//postcondition: returns the pig latin equivalent of sWord
if(findFirstVowel(sWord)==1&&sWord.substring(0,1).equals("q")){
    return sWord.substring(2)+"quay";
  }
 if(findFirstVowel(sWord)==0){
    return sWord+"way";
  }
for(int i=0;i<sWord.length();i++){
  if(findFirstVowel(sWord)==i){
    return sWord.substring(i)+sWord.substring(0,i)+"ay";
  }
}
if(findFirstVowel(sWord) == -1)
  {
   return sWord + "ay";
  }
 
else
  {
    return "ERROR!";
  }
}

