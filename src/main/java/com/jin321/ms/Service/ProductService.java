package com.jin321.ms.Service;

import com.jin321.ms.model.CheckedProductDetail;
import com.jin321.ms.model.Page;
import com.jin321.ms.model.TrueProduct;
import com.jin321.pl.model.Product;
import com.jin321.pl.model.Productsize;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tyranitarx on 2017/10/5.
 *
 * @Description : 商品相关接口
 */
public interface ProductService {
    /**
     *
     * @param product 商品信息
     * @param productsizes 商品款式
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    int insertProduct(Product product, List<Productsize> productsizes);

    /**
     * 删除商品（没用
     * @param pids
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    int deleteProduct(List<Integer> pids);

    /**
     * 更新商品(没用
     * @param product
     * @param productsizes
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    int updateProduct(Product product,List<Productsize> productsizes);

    /**
     * 添加合伙人商品
     * @param pids
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    int setTogetherProduct(List<String> pids);

    /**
     * 删除合伙人商品
     * @param pids
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    int deleteTogetherProduct(List<String> pids);
    /**
     * 获取真实商品分类信息
     * @param did
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    List<TrueProduct> selectProductByDealer(int did);

    /**
     * 修改商品分类
     * @param pid
     * @param ptypea
     * @param ptypeb
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    int updateProductType(int pid,int ptypea,int ptypeb,int ptypec);

    /***
     * 获取待审核商品
     * @return
     */
    @Transactional(rollbackFor =Exception.class)
    Page<CheckedProductDetail> getReadyProduct(int pagenum, int thispage);

    /**
     * 审核接口
     * @param pid
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    int checkoutProduct(int pid,int check);
}
