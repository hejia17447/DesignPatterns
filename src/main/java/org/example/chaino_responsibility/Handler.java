package org.example.chaino_responsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Handler {

    Handler next;

    abstract boolean process(Request request);

}
