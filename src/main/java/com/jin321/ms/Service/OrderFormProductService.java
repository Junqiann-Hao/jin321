package com.jin321.ms.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Tyranitarx on 2017/10/15.
 *
 * @Description :
 */

public interface OrderFormProductService {
    /**
     * 获取订单ID
     * @param oid
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int getOrderDid(Long oid);
}
