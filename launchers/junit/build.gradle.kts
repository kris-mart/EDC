/*
 *  Copyright (c) 2020, 2021 Microsoft Corporation
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Microsoft Corporation - initial API and implementation
 *
 */

plugins {
    `java-library`
    `java-test-fixtures`
    `maven-publish`
}


dependencies {
    api(project(":spi"))

    api(project(":core:bootstrap"))

    testFixturesImplementation(project(":common:util"))

    testFixturesImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testFixturesRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.2")
}

publishing {
    publications {
        create<MavenPublication>("junit.launcher") {
            artifactId = "dataspaceconnector.junit.launcher"
            from(components["java"])
        }
    }
}