package com.example.springbootweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wares {
    private Integer id;
    private String name;
    private Integer price;
    private String type;

}
