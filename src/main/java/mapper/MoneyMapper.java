package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import entity.Money;
import request.MoneyRequest.MoneyPostRequest;

/**
 * Created by heron.lee 06/12/2019
 */
@Mapper
public interface MoneyMapper {
    MoneyMapper Instance = Mappers.getMapper(MoneyMapper.class);

    Money postToEntity(MoneyPostRequest request);
}
