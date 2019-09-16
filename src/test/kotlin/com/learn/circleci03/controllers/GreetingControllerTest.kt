package com.learn.circleci03.controllers


import org.assertj.core.api.Assertions
import org.junit.Test
import org.mockito.Mockito.mock
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest

@WebMvcTest(GreetingController::class)
class GreetingControllerTest {

    @Test
    fun should_return_greeting_messages() {
        val mockController = mock(GreetingController::class.java)
        Assertions.assertThat(mockController.sayHello() == "Hello CircleCi")
    }

}