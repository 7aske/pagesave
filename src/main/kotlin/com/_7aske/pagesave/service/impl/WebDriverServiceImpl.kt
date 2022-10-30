package com._7aske.pagesave.service.impl

import com._7aske.pagesave.data.Screenshot
import com._7aske.pagesave.service.WebDriverService
import io.quarkus.cache.CacheKey
import io.quarkus.cache.CacheResult
import io.quarkus.logging.Log
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import org.springframework.stereotype.Service
import javax.ws.rs.core.UriBuilder

@Service
class WebDriverServiceImpl(private val driver: WebDriver) : WebDriverService {

    @CacheResult(cacheName = "weather-cache")
    override fun getScreenshot(@CacheKey url: String): Screenshot {
        val build = UriBuilder.fromPath(url).build()

        Log.info("Navigating to url: $build")

        driver.get(build.toString())

        val screenshot =
            (driver as TakesScreenshot).getScreenshotAs(OutputType.FILE)

        return Screenshot(screenshot.readBytes(), screenshot.name)
    }
}