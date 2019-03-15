package cn.itcast.core.service.brand;

import cn.itcast.core.dao.good.BrandDao;
import cn.itcast.core.pojo.good.Brand;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    /**
     * 好处：
     * 1、spring的提供的服务，一个框架提供的服务越多性能低
     * 2、与框架的耦合度低
     */
    @Resource
    private BrandDao brandDao;

    @Override
    public List<Brand> findAll() {
        // 根据条件查询
        List<Brand> brands = brandDao.selectByExample(null);
        return brands;
    }
}
