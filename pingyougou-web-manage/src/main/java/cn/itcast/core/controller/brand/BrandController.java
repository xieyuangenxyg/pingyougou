package cn.itcast.core.controller.brand;

import cn.itcast.core.pojo.good.Brand;
import cn.itcast.core.service.brand.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //ResponseBody和Controller结合
@RequestMapping("/brand")
public class BrandController {

    @Reference
    //注入service
    private BrandService brandService;

    @RequestMapping("/findAll.do")
    public List<Brand> findAll(){
        return brandService.findAll();
    }
}
