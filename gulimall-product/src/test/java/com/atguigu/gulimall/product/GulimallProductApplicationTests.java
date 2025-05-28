package com.atguigu.gulimall.product;

//import com.aliyun.oss.OSS;
//import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void testUpload() {
        // 替换成你自己的配置
        String endpoint = "oss-cn-beijing.aliyuncs.com";
        String accessKeyId =  System.getenv("OSS_ACCESS_KEY_ID");
        String accessKeySecret =  System.getenv("OSS_ACCESS_KEY_SECRET");
        String bucketName = "lm-web-space01";
        String objectName = "0d40c24b264aa511.jpg";  // OSS中的路径+文件名
        String localFilePath = "E:\\Code\\Java\\gulimall-doc\\课件和文档\\基础篇\\资料\\pics\\0d40c24b264aa511.jpg"; // 本地路径

//        // 创建OSSClient实例
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        try {
//            // 上传文件
//            ossClient.putObject(bucketName, objectName, new File(localFilePath));
//            System.out.println("✅ 上传成功！");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // 关闭OSSClient
//            ossClient.shutdown();
//            System.out.println("上传完成");
//        }
    }

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("韩国三星");

//        brandEntity.setName("三星");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));

        list.forEach( (item)->{
            System.out.println(item);
                }
        );
    }

}
