package br.com.microservices.orchestrated.orchestratorservice.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ETopics {

    START_SAGA("start-saga"),
    FINISH_SUCCESS("finish-success"),
    FINISH_FAIL("finish-fail"),
    PRODUCT_VALIDATION_SUCCESS("product-validation-success"),
    PRODUCT_VALIDATION_FAIL("product-validation-fail"),
    PAYMENT_VALIDATION_SUCCESS("payment-success"),
    PAYMENT_VALIDATION_FAIL("payment-fail"),
    INVENTORY_VALIDATION_SUCCESS("inventory-success"),
    INVENTORY_VALIDATION_FAIL("inventory-fail"),
    NOTIFY_ENDING("notify-ending"),
    BASE_ORCHESTRATOR("orchestrator");

    private String topic;
}
