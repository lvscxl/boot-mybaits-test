package com.zp.order.entity;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class City {

    private String id;
    private String name;
    private Integer status;
}
