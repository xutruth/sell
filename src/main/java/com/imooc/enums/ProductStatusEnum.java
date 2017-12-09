package com.imooc.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {
    //0表示上架,1表示下架
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String message;
    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
