import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class dupFiles {
    static List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String path : paths) {
            String arr[] = path.split(" ");

            String directory = arr[0];

            for (int i = 1; i < arr.length; i++) {
                String filename = arr[i].substring(0, arr[i].indexOf("("));
                String content = arr[i].substring(arr[i].indexOf("(") + 1, arr[i].length() - 1);

                List<String> ls = hm.getOrDefault(content, new ArrayList<>());

                String filenameFull = directory + "/" + filename;
                ls.add(filenameFull);
                hm.put(content, ls);
            }
        }
        hm.entrySet().removeIf(entry -> entry.getValue().size()<2);

        return new ArrayList<>(hm.values());
    }
}
