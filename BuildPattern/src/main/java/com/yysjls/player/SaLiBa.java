package com.yysjls.player;

public class SaLiBa implements BasePlayer{
    @Override
    public String name() {
        return "萨利巴";
    }

    @Override
    public Integer price() {
        return 7000;
    }

    @Override
    public String type() {
        return "后卫";
    }
}
