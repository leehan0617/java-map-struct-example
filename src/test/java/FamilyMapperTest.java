import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

import entity.Family;
import entity.Person;
import mapper.FamilyMapper;
import request.FamilyRequest.FamilyPostRequest;

/**
 * Created by heron.lee 06/12/2019
 */
public class FamilyMapperTest {

    @Test
    public void test () {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Dad"));
        personList.add(new Person(2, "Mom"));
        personList.add(new Person(3, "Son"));
        FamilyPostRequest request = new FamilyPostRequest("family", personList);

        Family family = FamilyMapper.Instance.postToEntity(request);
        Optional.ofNullable(family.getMembers())
                .ifPresent(members -> members.forEach(person -> System.out.println(person.getName())));
    }
}
