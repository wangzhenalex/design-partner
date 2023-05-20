package com.itlaoqi.abstractfactory.factory;

import com.itlaoqi.abstractfactory.factory.product.OssImage;
import com.itlaoqi.abstractfactory.factory.product.OssVideo;

public interface AbstractOssFactory {
    public OssImage uploadImage(byte[] bytes);
    public OssVideo uploadVideo(byte[] bytes);
}
