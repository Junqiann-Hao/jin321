package com.jin321.ms.Service.imp;

import com.jin321.ms.Service.TimeProductService;
import com.jin321.pl.dao.TimeproductMapper;
import com.jin321.pl.model.Timeproduct;
import com.jin321.pl.model.TimeproductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tyranitarx on 2017/10/14.
 *
 * @Description :添加秒杀活动
 */
@Service
public class TimeProductServiceimp implements TimeProductService {
    @Autowired
    private TimeproductMapper timeproductMapper;
    private List<Timeproduct> timeproducts;
    @Override
    public int createTimeProduct(Timeproduct timeproduct) {
        TimeproductExample timeproductExample=new TimeproductExample();
        TimeproductExample.Criteria criteria=timeproductExample.createCriteria();
        criteria.andPidEqualTo(timeproduct.getPid());
        timeproducts=timeproductMapper.selectByExample(timeproductExample);
        if(timeproducts.size()>0)
                return -1;
        else{
            return timeproductMapper.insert(timeproduct);
        }
    }
}
