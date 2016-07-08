package org.logstash.common.io;

import java.io.IOException;

@FunctionalInterface
public interface PageIOFactory {
    PageIO build(int capacity, String dirPath) throws IOException;
}