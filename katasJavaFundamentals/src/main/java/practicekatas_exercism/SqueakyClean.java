package practicekatas_exercism;

import java.util.ArrayList;
import java.util.List;

class SqueakyClean {
    static String clean(String identifier) {

        char[] identifierToChars =identifier.toCharArray();

        List<String> kebabCaseList =new ArrayList<>();

        if (identifier.length()<=3){
            return identifier;
        }

        for (int i = 0; i < identifierToChars.length; i++) {
            if(identifierToChars[i] == ' ' ){
                identifierToChars[i] = '_';
            }
        }

        String strRaplaceSpacesWithUnderscores = String.valueOf(identifierToChars);

        String[] splitKebabCaseStr = strRaplaceSpacesWithUnderscores.split("");

        for(int i=0; i < splitKebabCaseStr.length; i++){

            if(splitKebabCaseStr[i].equals("-")){
                splitKebabCaseStr[i + 1] =splitKebabCaseStr[i + 1].toUpperCase();

            }


        }
        for (String string : splitKebabCaseStr ){
            if(!string.equals("-")){
                kebabCaseList.add(string);
            }

        }


        String camelCasedStr = String.join("", kebabCaseList);



        char[] leetsSpeakText = camelCasedStr.replace("4", "a")
                .replace("3", "e")
                .replace("0", "o")
                .replace("1", "l")
                .replace("7", "t")
                .toCharArray();

        StringBuilder normalTextSB = new StringBuilder();

        for (char c : leetsSpeakText){
            if(Character.isLetter(c) || c == '_'){
                normalTextSB.append(c);

            }
        }

        String onlyTheNormalTextLetters = new String(normalTextSB);
        return onlyTheNormalTextLetters;
        //return normalTextSB.toString();
    }



}

