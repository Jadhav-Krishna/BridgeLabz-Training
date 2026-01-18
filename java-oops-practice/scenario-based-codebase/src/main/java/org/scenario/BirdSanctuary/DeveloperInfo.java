package org.scenario.BirdSanctuary;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DeveloperInfo {
    String developer();
    String version();
}
