package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import entity.Person;
import request.PersonRequest.PersonPostRequest;

/**
 * Created by heron.lee 06/12/2019
 */
@Mapper
public interface PersonMapper {
    PersonMapper Instance = Mappers.getMapper(PersonMapper.class);

    // source: parameter type 의 property
    // target: return type 의 property
    @Mapping(source = "firstName", target= "name")
    Person postRequestToEntity(PersonPostRequest request);
}
