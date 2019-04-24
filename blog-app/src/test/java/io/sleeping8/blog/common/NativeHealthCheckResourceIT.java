package io.sleeping8.blog.common;

import io.quarkus.test.junit.SubstrateTest;

@SubstrateTest
public class NativeHealthCheckResourceIT extends HealthCheckResourceTest {

    // Execute the same tests but in native mode.
}