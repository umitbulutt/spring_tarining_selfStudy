package com.company.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Dimensions {

    private int width;
    private int height;
    private int dept;

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

}
