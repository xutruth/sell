package com.imooc.repository;

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
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findOne(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory);
    }

    /**
     * 更新同样需要调用save方法，必须设置其主键
     */
    @Test
    //@Transactional //Transactional 可以避免测试影响数据，完全回滚
    public void save(){
        ProductCategory productCategory = new ProductCategory("男生最爱",2);
        ProductCategory category = repository.save(productCategory);
        Assert.assertNotEquals(null,category);
    }
    @Test
    public void findUpdate(){
        ProductCategory repositoryOne = repository.findOne(2);
        repositoryOne.setCategoryType(10);
        repository.save(repositoryOne);
    }
    @Test
    public void findByCategoryIn(){
        List<Integer> list = Arrays.asList(1,2);
        List<ProductCategory> productCategories = repository.findByCategoryTypeIn(list);
        System.out.println(productCategories);
        Assert.assertNotEquals(2,productCategories.size());
    }


}