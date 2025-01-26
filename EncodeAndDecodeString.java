import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeString {

    public String encode(List<String> strs){

        if(strs.isEmpty()){
            return Character.toString((char) 258);
        }

        String separate = Character.toString((char) 257);
        StringBuilder sb = new StringBuilder();
        for(String i:strs){
            sb.append(i);
            sb.append(separate);
        }
        sb.deleteCharAt(sb.length() -1);
        return sb.toString();

    }

    public List<String> decode(String str){

        if(str.equals(Character.toString((char) 258))){
            return new ArrayList<>() {};
        }

        String separate = Character.toString((char) 257);
        return Arrays.asList(str.split(separate, -1));

    }

}
