package com.example.pre_pre_project.order.entity;

import com.example.pre_pre_project.member.entity.Member;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

@Getter
@Setter
@Table("ORDERS")
public class Order {

    @Id
    private Long orderId;

    private AggregateReference<Member, Long> memberId;

    @MappedCollection(idColumn = "ORDER_ID", keyColumn = "ORDER_COFFEE_ID")
    private Set<CoffeeRef> orderCoffees = new LinkedHashSet<>();

    private OrderStatus orderStatus = OrderStatus.ORDER_REQUEST;

    private LocalDateTime createdAt = LocalDateTime.now();

    public enum OrderStatus {
        ORDER_REQUEST(1, "주문 요청"),
        ORDER_CONFIRM(2, "주문 확정"),
        ORDER_COMPLETE(3, "주문 완료"),
        ORDER_CANCEL(4, "주문 취소");

        @Getter
        private int stepNumber;

        @Getter
        private String stepDescription;

        OrderStatus(int stepNumber, String stepDescription) {
            this.stepNumber = stepNumber;
            this.stepDescription = stepDescription;
        }
    }

}
