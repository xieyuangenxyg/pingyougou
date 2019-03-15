package cn.itcast.core.service.brand;


import cn.itcast.core.pojo.good.Brand;

import java.util.List;

//接口类，给web层消费者调用
public interface BrandService {

    //查询全部商品
    public List<Brand> findAll();
}
