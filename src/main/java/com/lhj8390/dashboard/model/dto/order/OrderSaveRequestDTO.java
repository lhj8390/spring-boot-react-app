package com.lhj8390.dashboard.model.dto.order;

import com.lhj8390.dashboard.model.OrderType;
import com.lhj8390.dashboard.util.EnumPattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrderSaveRequestDTO {

    @NotNull
    private Long productId;

    @NotNull
    @EnumPattern(enumClass = OrderType.class, name = "OrderType")
    private String state;

    @NotNull
    @Min(value = 1)
    private Integer amount;

    @NotNull
    @Min(value = 1)
    private Integer price;
}
