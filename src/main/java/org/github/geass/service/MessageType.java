package org.github.geass.service;

import java.util.function.BiConsumer;

//example of enum replace switch
public enum MessageType {
    CREATE(MyService::create),
    UPDATE(MyService::update),
    DELETE(MyService::delete);

    private BiConsumer<MyService, Object> function;

    MessageType(BiConsumer<MyService, Object> function) {
        this.function = function;
    }

    public void handleMessage(MyService service, Object data) {
        function.accept(service, data);
    }
}

class MyService {
    public void create(Object data) {
    }

    public void update(Object data) {
    }

    public void delete(Object data) {
    }
}