/*******************************************************************************
 * Copyright (c) 2012 Sonatype Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *******************************************************************************/
package io.tesla.zipcomparator.internal;

import io.tesla.artifactcomparator.ArtifactDelta;

public class SimpleArtifactDelta implements ArtifactDelta {

    private final String message;
    private final String baseline;
    private final String reactor;

    public SimpleArtifactDelta(String message) {
        this(message, null, null);
    }

    public SimpleArtifactDelta(String message, String baseline, String reactor) {
        this.baseline = baseline;
        this.reactor = reactor;
        if (message == null) {
            throw new IllegalArgumentException();
        }
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getDetailedMessage() {
        return message;
    }

    public String getBaseline() {
        return baseline;
    }

    public String getReactor() {
        return reactor;
    }
}
