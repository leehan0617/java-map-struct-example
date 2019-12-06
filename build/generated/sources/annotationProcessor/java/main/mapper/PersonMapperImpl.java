package mapper;

import entity.Person;
import request.PersonRequest.PersonPostRequest;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-06T15:50:46+0900",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
*/
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person postRequestToEntity(PersonPostRequest request) {
        if ( request == null ) {
            return null;
        }

        Person person = new Person();

        person.setName( request.getFirstName() );
        person.setAge( request.getAge() );

        return person;
    }
}
