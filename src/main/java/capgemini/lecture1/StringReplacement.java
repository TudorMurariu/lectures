package capgemini.lecture1;

public class StringReplacement {

    /**
     * Transforms string by these rules:
     * AB -> ""
     * CD -> ""
     * ABC -> C
     * ABCD -> CD -> ""
     * CABBAD -> CBAD -> CD -> ""
     * BC -> BC
     *
     * @param text Contains only A, B, C or D characters
     * @return
     */

    // time complexity is O(n^2)
    // space complexity is O(n^2)
    public static String replace(String text)
    {
        String new_text = check_AB_CD(text);
        while(text.length() != new_text.length())  // we check the length because it only takes O(1)
        {
            text = new_text;
            new_text = check_AB_CD(text);
        }


        return new_text;
    }

    private static String check_AB_CD(String text)
    {
        StringBuffer stb = new StringBuffer(text.length());
        for(int i = 0;i < text.length();i++)
        {
            // check for AB and BA
            if(i == text.length()-1)
                stb.append(text.charAt(i));
            else if((text.charAt(i) == 'A' && text.charAt(i+1) == 'B') || (text.charAt(i) == 'B' && text.charAt(i+1) == 'A'))
                i++;
            else if((text.charAt(i) == 'C' && text.charAt(i+1) == 'D') || (text.charAt(i) == 'D' && text.charAt(i+1) == 'C'))
                i++;
            else
                stb.append(text.charAt(i));
        }



        return stb.toString();
    }
}
