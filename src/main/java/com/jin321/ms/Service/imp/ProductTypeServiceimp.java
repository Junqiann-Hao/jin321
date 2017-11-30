package com.jin321.ms.Service.imp;

import com.jin321.ms.Service.ProductTypeService;
import com.jin321.ms.controller.InsertSecondProductTypeController;
import com.jin321.ms.model.TrueProductType;
import com.jin321.pl.dao.ProducttypeMapper;

import com.jin321.pl.model.Producttype;
import com.jin321.pl.model.ProducttypeExample;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Tyranitarx on 2017/11/5.
 *
 * @Description :
 */
@Service
public class ProductTypeServiceimp implements ProductTypeService {
    private static final Log log = LogFactory.getLog(ProductTypeServiceimp.class);
    @Autowired
    private ProducttypeMapper producttypeMapper;
    private Producttype producttype;

    /**
     * @param producttype
     * @return 插入一级标签服务
     */
    @Override
    public int insertFirstType(Producttype producttype) {
        ProducttypeExample producttypeExample = new ProducttypeExample();
        ProducttypeExample.Criteria criteria = producttypeExample.createCriteria();
        criteria.andTypenameEqualTo(producttype.getTypename());
        criteria.andTypeclassEqualTo(1);
        if (producttypeMapper.selectByExample(producttypeExample).size() > 0) {
            return -1;
        }
        producttype.setIsDelete(false);
        producttype.setTypeclass(1);
        return producttypeMapper.insert(producttype);
    }

    @Override
    public int insertSecondType(Producttype producttype) {
        ProducttypeExample producttypeExample = new ProducttypeExample();
        ProducttypeExample.Criteria criteria = producttypeExample.createCriteria();
        criteria.andTypenameEqualTo(producttype.getTypename());
        criteria.andTypeclassEqualTo(2);
        if (producttypeMapper.selectByExample(producttypeExample).size() > 0) {
            return -1;
        }
        producttype.setTypeclass(2);
        producttype.setIsDelete(false);
        log.debug("获取分类类别" + producttype.getTypeclass());
        return producttypeMapper.insert(producttype);
    }

    @Override
    public int insertThirtType(Producttype producttype) {
        ProducttypeExample producttypeExample = new ProducttypeExample();
        ProducttypeExample.Criteria criteria = producttypeExample.createCriteria();
        criteria.andTypenameEqualTo(producttype.getTypename());
        criteria.andTypeclassEqualTo(3);
        if (producttypeMapper.selectByExample(producttypeExample).size() > 0) {
            return -1;
        }
        producttype.setTypeclass(3);
        producttype.setIsDelete(false);
        return producttypeMapper.insert(producttype);
    }

    private Producttype deleteProducttype;
    private List<Producttype> secondbyfirsttidlist;

    @Override
    public int deleteFirstType(int tid) {
        producttype = producttypeMapper.selectByPrimaryKey(tid);
        if (producttype != null) {
            //删除一级分类下二级分类
            ProducttypeExample producttypeExample = new ProducttypeExample();
            ProducttypeExample.Criteria criteria = producttypeExample.createCriteria();
            criteria.andHighertidEqualTo(tid);
            secondbyfirsttidlist = producttypeMapper.selectByExample(producttypeExample);
            Iterator<Producttype> iterator = secondbyfirsttidlist.iterator();
            while (iterator.hasNext()) {
                deleteProducttype = iterator.next();
                deleteProducttype.setIsDelete(true);
                if (producttypeMapper.updateByPrimaryKey(deleteProducttype) != 1) {
                    return 0;
                }
            }
            producttype.setIsDelete(true);
            return producttypeMapper.updateByPrimaryKey(producttype);
        } else
            return -1;
    }

    private List<Producttype> thirdbysecondlist;

    @Override
    public int deleteSecondType(int tid) {
        deleteProducttype = producttypeMapper.selectByPrimaryKey(tid);
        if (producttype != null) {
            //删除二级分类下三级分类
            ProducttypeExample producttypeExample = new ProducttypeExample();
            ProducttypeExample.Criteria criteria = producttypeExample.createCriteria();
            criteria.andHighertidEqualTo(tid);
            criteria.andTypeclassEqualTo(3);
            thirdbysecondlist = producttypeMapper.selectByExample(producttypeExample);
            Iterator<Producttype> iterator = thirdbysecondlist.iterator();
            while (iterator.hasNext()) {
                deleteProducttype = iterator.next();
                deleteProducttype.setIsDelete(true);
                if (producttypeMapper.updateByPrimaryKey(deleteProducttype) != 1) {
                    return 0;
                }
            }
            producttype.setIsDelete(true);
            return producttypeMapper.updateByPrimaryKey(producttype);
        } else
            return -1;
    }

    @Override
    public int deleteThridType(int tid) {
        producttype = producttypeMapper.selectByPrimaryKey(tid);
        if (producttype != null) {
            producttype.setIsDelete(true);
            return producttypeMapper.updateByPrimaryKey(producttype);
        }
        else
            return -1;
    }

    private List<Producttype> producttypeList;
    private TrueProductType trueProductType;
    private List<TrueProductType> trueProductTypeList;

    @Override
    public List<TrueProductType> getAllTypes() {
        trueProductTypeList = new ArrayList<TrueProductType>();
        ProducttypeExample producttypeExample = new ProducttypeExample();
        ProducttypeExample.Criteria criteria = producttypeExample.createCriteria();
        criteria.andTypeclassEqualTo(1);
        criteria.andIsDeleteEqualTo(false);
        producttypeList = producttypeMapper.selectByExample(producttypeExample);
        Iterator<Producttype> iterator = producttypeList.iterator();
        while (iterator.hasNext()) {
            trueProductType = new TrueProductType();
            producttype = iterator.next();
            ProducttypeExample producttypeExample1 = new ProducttypeExample();
            ProducttypeExample.Criteria criteria1 = producttypeExample1.createCriteria();
            criteria1.andTypeclassEqualTo(2);
            criteria1.andIsDeleteEqualTo(false);
            criteria1.andHighertidEqualTo(producttype.getTid());
            secondbyfirsttidlist = producttypeMapper.selectByExample(producttypeExample1);
            trueProductType.setProducttype1(producttype);
            trueProductType.setProducttype2List(secondbyfirsttidlist);
            trueProductTypeList.add(trueProductType);
        }
        return trueProductTypeList;
    }
}
