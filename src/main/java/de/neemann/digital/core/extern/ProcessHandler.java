/*
 * Copyright (c) 2018 Helmut Neemann.
 * Use of this source code is governed by the GPL v3 license
 * that can be found in the LICENSE file.
 */
package de.neemann.digital.core.extern;

import de.neemann.digital.core.ObservableValues;

import java.io.Closeable;
import java.io.IOException;

/**
 * A process handler implementation
 */
public interface ProcessHandler extends Closeable {

    /**
     * Transfers the given values to the external process
     *
     * @param values the values to transfer
     * @throws IOException IOException
     */
    void writeValues(ObservableValues values) throws IOException;

    /**
     * Reads values from the externalö process and writes them to the given values
     *
     * @param values the values to write to
     * @throws IOException IOException
     */
    void readValuesTo(ObservableValues values) throws IOException;

}