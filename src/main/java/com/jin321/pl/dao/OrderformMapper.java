package com.jin321.pl.dao;

import com.jin321.pl.model.Orderform;
import com.jin321.pl.model.OrderformExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderformMapper {
    int countByExample(OrderformExample example);

    int deleteByExample(OrderformExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(Orderform record);

    int insertSelective(Orderform record);

    List<Orderform> selectByExample(OrderformExample example);

    Orderform selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByExample(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByPrimaryKeySelective(Orderform record);

    int updateByPrimaryKey(Orderform record);
}