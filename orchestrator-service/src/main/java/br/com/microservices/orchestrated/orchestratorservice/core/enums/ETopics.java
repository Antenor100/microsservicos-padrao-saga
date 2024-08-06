package br.com.microservices.orchestrated.orchestratorservice.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ETopics {
    BASE_ORCHESTRATOR("orchestrator"),
    FINISH_SUCCESS("finish-success"),
    FINISH_FAIL("finish-fail"),

    START_SAGA("start-saga"),
    NOTIFY_ENDING("notify-ending"),

    PRODUCT_VALIDATION_SUCCESS("product-validation-success"),
    PRODUCT_VALIDATION_FAIL("product-validation-fail"),

    PAYMENT_SUCCESS("payment-success"),
    PAYMENT_FAIL("payment-fail"),

    INVENTORY_SUCCESS("inventory-success"),
    INVENTORY_FAIL("inventory-fail");

    private String topic;

}
