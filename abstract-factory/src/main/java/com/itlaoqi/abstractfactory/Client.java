package com.itlaoqi.abstractfactory;

import com.itlaoqi.abstractfactory.aliyun.AliyunOssFactory;
import com.itlaoqi.abstractfactory.factory.AbstractOssFactory;
import com.itlaoqi.abstractfactory.factory.product.OssImage;
import com.itlaoqi.abstractfactory.factory.product.OssVideo;
import com.itlaoqi.abstractfactory.qiniu.QiniuOssFactory;

public class Client {
    public static void main(String[] args) {
        AbstractOssFactory factory = new QiniuOssFactory();
        OssImage ossImage = factory.uploadImage(new byte[1024]);
        OssVideo ossVideo = factory.uploadVideo(new byte[1024]);
        System.out.println(ossImage.getThumb());
        System.out.println(ossImage.getWatermark());
        System.out.println(ossImage.getEnhance());
        System.out.println(ossVideo.get720P());
        System.out.println(ossVideo.get1080P());
    }
}
