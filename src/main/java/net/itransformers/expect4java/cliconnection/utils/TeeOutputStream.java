/*
 * TeeOutputStream.java
 *
 * Copyright 2016  iTransformers Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.itransformers.expect4java.cliconnection.utils;

import org.apache.log4j.Logger;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TeeOutputStream extends FilterOutputStream {
    Logger logger = Logger.getLogger(TeeOutputStream.class.getName());
    private final OutputStream branch;


    public TeeOutputStream(OutputStream output, OutputStream branch) {
        super(output);
        this.branch = branch;
    }

    public void close() throws IOException {
        logger.info("Closing output stream.");
        super.close();
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b);
        branch.write(b);
    }

}
