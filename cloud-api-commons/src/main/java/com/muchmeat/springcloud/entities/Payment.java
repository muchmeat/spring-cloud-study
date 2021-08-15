package com.muchmeat.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author czq
 * @date 2021/8/15 14:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private String serial;
}
