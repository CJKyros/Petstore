package com.nf147.contact.dao;

import com.nf147.contact.entity.Oeder;
import java.util.List;

public interface OederMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oeder record);

    Oeder selectByPrimaryKey(Integer id);

    List<Oeder> selectAll();

    int updateByPrimaryKey(Oeder record);
}