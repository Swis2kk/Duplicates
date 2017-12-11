public class Main {

    public static void main(String[] args) {

        System.out.println(duplicateCount("Dmitrii"));

    }

    public static int duplicateCount(String text) {
            int result = 0;
            text = text.toLowerCase();
            while (text.length() > 0) {
                String firstLetter = text.substring(0,1);
                text = text.substring(1);
                if (text.contains(firstLetter)) result ++;
                text = text.replace(firstLetter, "");
            }
            return result;
    }
}
