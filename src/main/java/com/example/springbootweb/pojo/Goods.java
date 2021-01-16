package com.example.springbootweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer id;
    private  String name;
    private Integer price;
    private String type;
    private Integer amount;
    private Integer qualityPeriod;
    private  String merchant;

}
