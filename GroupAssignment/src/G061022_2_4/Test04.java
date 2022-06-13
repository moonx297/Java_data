package G061022_2_4;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Season.values()));   // [SPRING, SUMMER, FALL, WINTER]
    }

    private enum Season {
        SPRING("봄"),
        SUMMER("여름"),
        FALL("가을"),
        WINTER("겨울");

        private String season;

        Season(String season) {
            this.season = season;
        }

        public String getSeason() {
            return season;
        }
    }

}



