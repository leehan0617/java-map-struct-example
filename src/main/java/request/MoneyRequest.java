package request;

/**
 * Created by heron.lee 06/12/2019
 */
public class MoneyRequest {
    public enum Country {
        KOREA, CHINA, JAPAN, AMERICA
    }

    public static class MoneyPostRequest {
        private Country country;
        private String name;
        private int value;

        public Country getCountry() {
            return country;
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }
    }
}
