package com.yysjls.builder;

import com.yysjls.player.BasePlayer;

import java.util.List;

public class Club {
    private List<BasePlayer> playerList;
    private String name;
    private Integer price;

    public Club(String fcName) {
        this.name = fcName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Club addGuard(BasePlayer player){
        playerList.add(player);
        price+=player.price();
        return this;
    }

    public Club addForward(BasePlayer player){
        playerList.add(player);
        price+=player.price();
        return this;
    }

    public Club addMidfielder(BasePlayer player){
        playerList.add(player);
        price+=player.price();
        return this;
    }
}
