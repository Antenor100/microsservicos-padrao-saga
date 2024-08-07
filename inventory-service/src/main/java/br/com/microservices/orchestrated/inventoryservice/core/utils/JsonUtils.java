package br.com.microservices.orchestrated.inventoryservice.core.utils;

import br.com.microservices.orchestrated.inventoryservice.core.dto.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JsonUtils {
    private final ObjectMapper objectMapper;

    public String toString (Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            return "";
            //TODO throw new RuntimeException("Error converting object to JSON", e);
        }
    }

    public Event toEvent(String json) {
        try {
            return objectMapper.readValue(json, Event.class);
        } catch (Exception e) {
            return null;
            //TODO throw new RuntimeException("Error converting JSON to Event", e);
        }
    }
}
