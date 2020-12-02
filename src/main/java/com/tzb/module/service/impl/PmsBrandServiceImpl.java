//package com.tzb.module.service.impl;
//
///**
// * Create by zhatang on 2020/11/28.
// */
//
//import com.github.pagehelper.PageHelper;
//import com.tzb.module.mbg.mapper.PmsBrandMapper;
//import com.tzb.module.mbg.model.PmsBrand;
//import com.tzb.module.mbg.model.PmsBrandExample;
//import com.tzb.module.service.PmsBrandService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * PmsBrandService实现类
// * Created by tzb on 2019/4/19.
// */
//@Service
//public class PmsBrandServiceImpl implements PmsBrandService {
//
//    @Autowired
//    private PmsBrandMapper brandMapper;
//
//    @Override
//    public List<PmsBrand> listAllBrand() {
//        return brandMapper.selectByExample(new PmsBrandExample());
//    }
//
//    @Override
//    public int createBrand(PmsBrand brand) {
//        return brandMapper.insertSelective(brand);
//    }
//
//    @Override
//    public int updateBrand(Long id, PmsBrand brand) {
//        brand.setId(id);
//        return brandMapper.updateByPrimaryKeySelective(brand);
//    }
//
//    @Override
//    public int deleteBrand(Long id) {
//        return brandMapper.deleteByPrimaryKey(id);
//    }
//
//    @Override
//    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum, pageSize);
//        return brandMapper.selectByExample(new PmsBrandExample());
//    }
//
//    @Override
//    public PmsBrand getBrand(Long id) {
//        return brandMapper.selectByPrimaryKey(id);
//    }
//}
//
