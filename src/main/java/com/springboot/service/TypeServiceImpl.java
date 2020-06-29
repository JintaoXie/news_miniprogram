package com.springboot.service;

import com.springboot.mapper.TypeMapper;
import com.springboot.model.Type;
import com.springboot.model.TypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService{

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> queryAllTypes() {
        return typeMapper.selectByExample(new TypeExample());
    }
}
