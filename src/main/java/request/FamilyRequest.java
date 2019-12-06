package request;

import java.util.List;

import entity.Person;

/**
 * Created by heron.lee 06/12/2019
 */
public class FamilyRequest {

    public static class FamilyPostRequest {
        private String name;
        private List<Person> members;

        public FamilyPostRequest (String name, List<Person> members) {
            this.name = name;
            this.members = members;
        }
        public String getName() {
            return name;
        }

        public List<Person> getMembers() {
            return members;
        }
    }
}
