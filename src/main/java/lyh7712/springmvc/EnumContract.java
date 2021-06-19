package lyh7712.springmvc;

public class EnumContract {

    public enum CommissionType {
        PERCENT("percent"),
        MONEY("money");

        private String value;

        CommissionType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "CommissionType{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    public enum CommissionCutting {
        ROUND("round"),
        CEIL("ceil"),
        FLOOR("floor");

        private String value;

        CommissionCutting(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }


    }


}
