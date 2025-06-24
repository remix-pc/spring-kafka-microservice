package br.com.microservices.orchestrated.orderservice.core.consumer;

import br.com.microservices.orchestrated.orderservice.core.service.EventService;
import br.com.microservices.orchestrated.orderservice.core.utils.JsonUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nonapi.io.github.classgraph.json.JSONUtils;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class EventConsumer {

    private final EventService  eventService;
    private final JsonUtil jsonUtil;

    @KafkaListener(
            groupId = "${spring.kafka.consumer.group-id}",
            topics = "${spring.kafka.topic.notify-ending}"
    )
    public void consumeNotifyEndingTopicEvent(String payload){
        log.info("Received notify ending topic event {}", payload);
        var event = jsonUtil.toEvent(payload);
        eventService.notifyEnding(event);
    }


}
