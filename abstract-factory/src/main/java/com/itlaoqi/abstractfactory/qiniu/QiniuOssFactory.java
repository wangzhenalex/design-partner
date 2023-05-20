package com.itlaoqi.abstractfactory.qiniu;

import com.itlaoqi.abstractfactory.factory.AbstractOssFactory;
import com.itlaoqi.abstractfactory.factory.product.OssImage;
import com.itlaoqi.abstractfactory.factory.product.OssVideo;
import com.itlaoqi.abstractfactory.qiniu.product.QiniuOssImage;
import com.itlaoqi.abstractfactory.qiniu.product.QiniuOssVideo;

public class QiniuOssFactory implements AbstractOssFactory {

    @Override
    public OssImage uploadImage(byte[] bytes) {
        return new QiniuOssImage(bytes,"IT老齐");
    }

    @Override
    public OssVideo uploadVideo(byte[] bytes) {
        return new QiniuOssVideo(bytes,"IT老齐");
    }
}
