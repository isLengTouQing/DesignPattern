package com.yysjls.player;

public class SaKa implements BasePlayer{
    @Override
    public String name() {
        return "萨卡";
    }

    @Override
    public Integer price() {
        return 12000;
    }

    @Override
    public String type() {
        return "前锋";
    }
}
