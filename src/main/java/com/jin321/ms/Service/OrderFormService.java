package com.jin321.ms.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Tyranitarx on 2017/11/6.
 *
 * @Description :
 */
public interface OrderFormService {
    /**
     * 修改订单状态
     * @param ostate
     * @param oid
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int changeOrderFormStatue(int ostate,Long oid);
}