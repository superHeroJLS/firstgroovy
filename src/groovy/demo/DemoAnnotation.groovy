package demo

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * jiangls 2020/08/25
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface DemoAnnotation {

}