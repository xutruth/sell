package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    //ctrl + alt + t 包裹
    //shift + enter 向下插入行
    //ctrl + alt + enter 向上插入行
    //alt + left/right 切换试图
    //ctrl + y 删除行
    // ctrl + d 复制行
    // Ctrl + H 显示当前类的继承层次结构（包含其父类和子类）
    //ctrl+ r 文本替换
    //Ctrl + Shift + Enter 自动结束代码，行末自动添加 分号/括号/引号 等，if/for等会自动添加所需结构
    public void findOne() throws Exception {
        ProductCategory one = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1), one.getCategoryId());

    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> all = categoryService.findAll();
        Assert.assertNotEquals(0,all.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> categories = categoryService.findByCategoryTypeIn(Arrays.asList(1, 3, 4, 2));
        Assert.assertNotEquals(0,categories.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("男生最爱", 3);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }

}