package codingBat;
/* Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true*/


public class catDogAreEqual {
    /*public boolean catDog(String str) {

  String cat = "cat";
  String dog = "dog";

  int countCat= 0;
  int countDog=0;

  for(int i = 0; i <str.length()-3; i++){
    if(str.substring(i, i+2).equals(cat)){
      countCat++;
    }
  }
   for(int i = 0; i <str.length()-3; i++){
    if(str.substring(i, i+2).equals(dog) ){
      countDog++;
    }
  }

  return countCat == countDog;
}*/
    public boolean catDog(String str) {
        String cat = "cat";
        String dog = "dog";


        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals(cat)) {
                countCat++;
            } else if (str.substring(i, i + 3).equals(dog)) {
                countDog++;
            }
        }


        return countCat == countDog;
    }
}
