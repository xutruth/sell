package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 类目
 * create by too
 * 2017-12-07 15:22
 **/
@Entity
@DynamicUpdate  //自动更新
@Data
public class ProductCategory {

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    /*类目id*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /*类目名称*/
    private String categoryName;
    /*类目编号*/
    private  Integer categoryType;
  /*  *//*创建时间*//*
    private Date createTime;
    *//*更新时间*//*
    private Date updateTime;*/
}
