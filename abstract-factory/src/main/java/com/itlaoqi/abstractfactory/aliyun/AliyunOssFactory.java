package com.itlaoqi.abstractfactory.aliyun;

import com.itlaoqi.abstractfactory.factory.AbstractOssFactory;
import com.itlaoqi.abstractfactory.factory.product.OssImage;
import com.itlaoqi.abstractfactory.factory.product.OssVideo;
import com.itlaoqi.abstractfactory.aliyun.product.AliyunOssImage;
import com.itlaoqi.abstractfactory.aliyun.product.AliyunOssVideo;

public class AliyunOssFactory implements AbstractOssFactory {
    @Override
    public OssImage uploadImage(byte[] bytes) {
        return new AliyunOssImage(bytes,"IT老齐",true);
    }

    @Override
    public OssVideo uploadVideo(byte[] bytes) {

        return new AliyunOssVideo(bytes,"IT老齐");
    }
}
