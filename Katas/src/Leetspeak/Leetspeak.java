package Leetspeak;

/**
 * @package: Leetspeak;
 * @created: 23.09.2019 by Coderbay
 * @licence: proprietary
 */
public class Leetspeak {
    public String fromString(String text) {
        text=text.toLowerCase();
        String leetspeak="";
        for (int i = 0; i < text.length(); i++) {
            char charAtI=text.charAt(i);
            switch (charAtI){
                case 'a':
                    leetspeak+="4";

                    break;
                case 'e':
                    leetspeak+="3";

                    break;
                case 'l':
                    leetspeak+="1";

                    break;
                case 'm':
                    leetspeak+="/^^\\";

                    break;
                case 'o':
                    leetspeak+="0";

                    break;
                case 'u':
                    leetspeak+="(_)";

                    break;
                default:
                    leetspeak+=text.charAt(i);
            }

        }
        return leetspeak;
    }
}
