package com.cypressworks.retrolambdafailure;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Kirill on 23.09.2014.
 */
@Module(injects = Test.class)
public class TestModule {
    @Provides
    Object provideObject() {
        return new Object();
    }
}
