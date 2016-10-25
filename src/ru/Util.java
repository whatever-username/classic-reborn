package ru;

/**
 * Created by Иннокентий on 24.10.2016.
 */
public class Util {
    public static String edit(String line, int charsInLine) {
        String finalLine="<html>";
        //14
        int pos=0;
        for (int i = 0; i < line.length()/charsInLine; i++) {
            finalLine=finalLine+line.substring(charsInLine*i,charsInLine*(i+1))+"<br>";
            pos = charsInLine*(i+1);
        }
        finalLine=finalLine+line.substring(pos,line.length());
        finalLine = finalLine+"</html>";
        return finalLine;
    }
}
