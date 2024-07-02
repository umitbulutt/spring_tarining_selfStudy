package com.company.streotype_annotation.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Dimensions {

    private int width;
    private int height;
    private int dept;

   public Dimensions(){
       this.width = 10;
       this.dept = 40;
       this.height = 30;
   }


    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

}
