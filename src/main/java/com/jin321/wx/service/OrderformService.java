package com.jin321.wx.service;

import com.jin321.wx.model.OrderformDetail;

/**
 * @Author hao
 * @Date 2017/10/11 14:20
 * @Description :订单业务逻辑
 */
public interface OrderformService {
    /**
     * 添加订单
     * @param orderformDetail
     * @return
     */
    boolean insertOrder(OrderformDetail orderformDetail) throws Exception;

    /**
     * 退单
     * @param oid
     * @return
     * @throws Exception
     */
    boolean chargebackOrder(long oid) throws Exception;
}
