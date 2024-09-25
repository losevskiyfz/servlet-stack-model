package com.losevskiyfz.servletstack.mapper;

import com.losevskiyfz.servletstack.domain.Book;
import com.losevskiyfz.servletstack.domain.PostBookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {
    @Mapping(target = "id", ignore = true)
    Book toBook(PostBookDto dto);
    PostBookDto toPostBookDto(Book bookRecord);
}
