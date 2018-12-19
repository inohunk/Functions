public class StringParser {

    public String reverseText(char[] chars)
    {
        int index = chars.length - 1;
        int i=0;
        char c;
        if(index % 2 == 0)
        {
            while (i < chars.length/2) {
                c = chars[i];
                chars[i] = chars[index];
                chars[index] = c;
                i++;
                index--;
            }
        }
        else
        {
            while (i < index)
            {
                c = chars[i];
                chars[i] = chars[index];
                chars[index] = c;
                i++;
                index--;
            }
        }
        return String.valueOf(chars);
    }
    public String reverseStringWithCharAt(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }
    public String reverseWithCharArray(String inputString) {
        char[] charArray = inputString.toCharArray();
        String resultString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString += charArray[i];
        }
        return resultString;
    }
    public String reverseWithStringBuffer(String inputString)
    {
        String reversed = new StringBuffer(inputString).reverse().toString();
        return reversed;
    }
}
