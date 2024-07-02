package com.company.streotype_annotation;

import com.company.streotype_annotation.casefactory.Case;
import com.company.streotype_annotation.monitorfactory.Monitor;
import com.company.streotype_annotation.motherboardfactory.Motherboard;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;



    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }

}