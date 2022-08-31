package accountRecommand;





import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(String account1){
        String account = account1.toLowerCase();
        char[] chars = account.toCharArray();
        List<Character> list = new ArrayList<>();

        for(char c : chars){
            if (Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                list.add(c);
            }
        }
        for(int i =0;i<list.size()-1;i++){
            if(list.get(i)=='.' && list.get(i+1)=='.'){
                list.remove(i);
                i--;
            }
        }
        if(list.size()<=1){
            if(list.isEmpty()){
                list.add(0,'a');
            }
            else{
                if(list.get(0)=='.'){
                    list.remove(0);
                    list.add(0,'a');
                }
            }
        }
        if (list.get(list.size()-1)==','){
            list.remove(list.size()-1);
        }
        if(list.get(0)=='.'){
            list.remove(0);
        }


        while(list.size()>=16){
            for(int i=15;i<list.size();i++){
                list.remove(i);
            }
        }
        if(list.size()<=1){
            if(list.isEmpty()){
                list.add(0,'a');
            }
            else{
                if(list.get(0)=='.'){
                    list.remove(0);
                    list.add(0,'a');
                }
            }
        }
        if (list.get(list.size()-1)==','){
            list.remove(list.size()-1);
        }
        if(list.get(0)=='.'){
            list.remove(0);
        }

        if (list.get(0) == '.') {
            list.remove(0);
        }
        if (list.get(list.size() - 1) == '.') {
            list.remove(list.size() - 1);
        }

        if (list.size() <= 2) {
            char a=list.get(list.size()-1);
            for(int i=list.size();list.size()<3;i++){
                list.add(i,a);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        return sb.toString();
    }
}


