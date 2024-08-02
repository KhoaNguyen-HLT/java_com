package com.comjava.mapper;

import com.comjava.dto.request.userCreationRequest;
import com.comjava.dto.request.userUpdateRequest;
import com.comjava.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(userCreationRequest request);
    void updateUser(@MappingTarget User user, userUpdateRequest request);
}



