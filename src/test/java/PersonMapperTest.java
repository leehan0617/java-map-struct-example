import org.junit.Test;

import entity.Person;
import mapper.PersonMapper;
import request.PersonRequest.PersonPostRequest;

/**
 * Created by heron.lee 06/12/2019
 */
public class PersonMapperTest {

    @Test
    public void test () {
        PersonPostRequest request = new PersonPostRequest("firstName", 10);
        Person person = PersonMapper.Instance.postRequestToEntity(request);
        System.out.println("person mapper result:" + person.getName());
    }
}
