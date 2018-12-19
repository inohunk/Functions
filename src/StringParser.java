public class StringParser {
    /**
     * Функция, которая возвращает перевернутую строку
     * @param chars
     * @return возврат перевернутой строки
     */
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
}
