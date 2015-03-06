package eartest.ejb.impl;

import eartest.ejb.api.Hello;

public class HelloImpl implements Hello {
    
    @Override
    public String hello() {
        return "Hello World!";
    }
}
