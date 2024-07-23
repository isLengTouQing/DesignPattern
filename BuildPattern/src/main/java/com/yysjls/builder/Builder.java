package com.yysjls.builder;

import com.yysjls.player.EDeGao;
import com.yysjls.player.SaKa;
import com.yysjls.player.SaLiBa;

public class Builder {
    public Club build(String fcName) {
        return new Club(fcName).addForward(new SaKa()).addMidfielder(new EDeGao()).addGuard(new SaLiBa());
    }
}
