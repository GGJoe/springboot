package com.guoajiahe.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;


@TableName("tb_book")
@Data
@NoArgsConstructor
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
