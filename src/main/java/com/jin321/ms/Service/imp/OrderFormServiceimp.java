package com.jin321.ms.Service.imp;


import com.jin321.ms.Service.OrderFormService;
import com.jin321.pl.dao.OrderformMapper;
import com.jin321.pl.model.Orderform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tyranitarx on 2017/11/6.
 *
 * @Description :
 */
@Service
public class OrderFormServiceimp implements OrderFormService {
    @Autowired
    private OrderformMapper orderformMapper;
    private Orderform orderform;
    @Override
    public int changeOrderFormStatue(int ostate,Long oid){
        orderform=orderformMapper.selectByPrimaryKey(oid);
        if(orderform!=null){
            orderform.setOstate(ostate);
            return orderformMapper.updateByPrimaryKey(orderform);
        }else
            return -1;
    }
}
