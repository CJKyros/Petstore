package com.nf147.contact.dao;

import com.nf147.contact.entity.Pet;
import java.util.List;

public interface PetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pet record);

    Pet selectByPrimaryKey(Integer id);

    List<Pet> selectAll();

    int updateByPrimaryKey(Pet record);



}