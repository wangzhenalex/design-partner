package com.imooc.factory.computershop;

public class ShopAssistant {
    public Computer suggest(String purpose){
        Computer computer = null;
        if(purpose.equals("网站建设")){
            return new Server();
        }else if(purpose.equals("电竞比赛")){
            return new Desktop();
        }else if(purpose.equals("日常办公")){
            return new Macbook();
        }else if(purpose.equals("3A游戏")){
            return new Alienware();
        }
        return computer;
    }
}
