package request;


/**
 * Created by heron.lee 06/12/2019
 */
public class PersonRequest {
    public static class PersonPostRequest {
        private String firstName;
        private int age;

        public PersonPostRequest (String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public int getAge() {
            return age;
        }
    }
}
