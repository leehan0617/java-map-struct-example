package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import entity.Family;
import request.FamilyRequest.FamilyPostRequest;

/**
 * Created by heron.lee 06/12/2019
 */
@Mapper
public interface FamilyMapper {
    FamilyMapper Instance = Mappers.getMapper(FamilyMapper.class);

    // property에 collection이 와도 자동 형변환이 된다.
    Family postToEntity(FamilyPostRequest request);

}
