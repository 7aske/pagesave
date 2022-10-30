package com._7aske.pagesave.api

import com._7aske.pagesave.service.WebDriverService
import com._7aske.pagesave.validation.Url
import io.quarkus.logging.Log
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.net.URI
import javax.validation.Valid
import javax.ws.rs.core.HttpHeaders
import javax.ws.rs.core.Response


@RestController
@RequestMapping("/")
class RootController(private val webDriverService: WebDriverService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun screenshot(@Valid @Url @RequestParam url: String): Response {
        Log.info("Screenshot requested for url: $url")

        val (data) = webDriverService.getScreenshot(url)

        return Response.ok()
            .header(HttpHeaders.CONTENT_TYPE, MediaType.IMAGE_PNG_VALUE)
            .entity(data)
            .build()
    }
}