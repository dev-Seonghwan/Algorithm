import java.util.Arrays;
import java.util.Set;

class Solution {

    Set<String> musicExt = Set.of("mp3", "aac", "flac");
    Set<String> imageExt = Set.of("jpg", "bmp", "gif");
    Set<String> movieExt = Set.of("mp4", "avi", "mkv");

    public int[] solution(String[] strings) {
        int[] answer = {0, 0, 0, 0};

        for (String file : strings) {
            String[] files = file.split(" ");
            String fileExt = files[0];

            int lastDot = -1;
            for (int i = 0; i < fileExt.length(); i++) {
                if (fileExt.charAt(i) == '.') {
                    lastDot = i;
                }
            }
            fileExt = fileExt.substring(lastDot + 1);
            int size = Integer.parseInt(files[1].substring(0, files[1].length() - 1));

            if (musicExt.contains(fileExt)) {
                answer[0] += size;
            } else if (imageExt.contains(fileExt)) {
                answer[1] += size;
            } else if (movieExt.contains(fileExt)) {
                answer[2] += size;
            } else {
                answer[3] += size;
            }
        }

        return answer;
    }

}
