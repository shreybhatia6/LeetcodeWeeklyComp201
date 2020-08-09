import java.util.ArrayList;

public class Question1 {
    public String makeGood(String s) {
        String res = "";
        ArrayList <Character> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            al.add(s.charAt(i));

        int index = 0;
        while (index < al.size()-1) {

            if ((al.get(index) == Character.toLowerCase(al.get(index + 1)) && Character.isUpperCase(al.get(index + 1))) ||
                    Character.toLowerCase(al.get(index)) == al.get(index+1) && Character.isUpperCase(al.get(index))) {
                al.remove(index);
                al.remove(index);
                index = 0;
            } else {
                index++;
            }
        }
        for (char c: al) {
            String tempS = Character.toString(c);
            res+=tempS;
        }
        return res;







    }
}