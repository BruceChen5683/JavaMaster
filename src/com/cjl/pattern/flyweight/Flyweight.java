package com.cjl.pattern.flyweight;


/**
 *  享元接口，通过这个接口可以接受并作用于外蕴状态
 */
public interface Flyweight {
    /**
     * @param extrinsicState
     */
    void operation(String extrinsicState);
}
