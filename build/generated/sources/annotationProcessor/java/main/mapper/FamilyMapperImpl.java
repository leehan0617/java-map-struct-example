package mapper;

import entity.Family;
import entity.Person;
import java.util.ArrayList;
import java.util.List;
import request.FamilyRequest.FamilyPostRequest;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-06T15:50:46+0900",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.1 (Oracle Corporation)"
)
*/
public class FamilyMapperImpl implements FamilyMapper {

    @Override
    public Family postToEntity(FamilyPostRequest request) {
        if ( request == null ) {
            return null;
        }

        Family family = new Family();

        family.setName( request.getName() );
        List<Person> list = request.getMembers();
        if ( list != null ) {
            family.setMembers( new ArrayList<Person>( list ) );
        }

        return family;
    }
}
