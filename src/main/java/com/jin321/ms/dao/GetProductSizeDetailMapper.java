package com.jin321.ms.dao;

import com.jin321.ms.model.UpdateProductSizeDetail;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Tyranitarx on 2017/11/6.
 *
 * @Description :
 */
@Repository
public interface GetProductSizeDetailMapper {
    List<UpdateProductSizeDetail> getProductSizeDetail(int did,int ptypea,int ptypeb,int ptypec);
}
