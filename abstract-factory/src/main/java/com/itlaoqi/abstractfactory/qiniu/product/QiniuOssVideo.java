package com.itlaoqi.abstractfactory.qiniu.product;

import com.itlaoqi.abstractfactory.factory.product.OssVideo;

public class QiniuOssVideo implements OssVideo {
    private byte[] bytes;
    public QiniuOssVideo(byte[] bytes, String watermark) {
        this.bytes = bytes;
        System.out.println("[七牛云]视频已上传至七牛云OSS，URL：http://oss.qiniu.com/xxx.mp4");
        System.out.println("[七牛云]1080P转码成功,码率：3500K");
        System.out.println("[七牛云]720P转码成功，码率：2500K");
    }

    @Override
    public String get720P() {
        return "http://oss.qiniu.com/xxx_720p_2500.mp4";
    }

    @Override
    public String get1080P() {
        return "http://oss.qiniu.com/xxx_1080p_3500.mp4";
    }
}
