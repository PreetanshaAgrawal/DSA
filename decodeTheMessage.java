import java.util.HashMap;

public class decodeTheMessage{
    static String decodingTheMessage(String key, String message){
        HashMap<Character, Character> table = new HashMap<>();
        int j=0;
        for(char c: key.toCharArray()){
            if(c!= ' ' && !table.containsKey(c) && j<26){
                char value = (char)(j + 'a');
                table.put(c, value);
                j++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c: message.toCharArray()){
            if(table.containsKey(c) && c != ' '){
                sb.append(table.get(c));
            }
            else if(c == ' '){
                sb.append(' ');
            }
        }
        return sb.toString();
    } 

    static void addingCharacters(){
        // char letter[] = new char[26];

        for (int i = 0; i < 26; i++) {
            char c = (char)(i + 'a');
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        // addingCharacters();
        String key="the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodingTheMessage(key, message));
    }
}