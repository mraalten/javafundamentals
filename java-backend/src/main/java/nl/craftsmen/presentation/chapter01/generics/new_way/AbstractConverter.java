package nl.craftsmen.presentation.chapter01.generics.new_way;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractConverter<INPUT, DOMAIN> {

    abstract DOMAIN convert(INPUT input);

    public void process(INPUT input) {
        log.info(input.toString());
        final DOMAIN domainObject = convert(input);
        log.info(domainObject.toString());
    }
}
