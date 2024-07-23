package com.yysjls.player;

public class LaYa implements BasePlayer{
    @Override
    public String name() {
        return "大卫拉亚";
    }

    @Override
    public Integer price() {
        return 3000;
    }

    @Override
    public String type() {
        return "门将";
    }
}
