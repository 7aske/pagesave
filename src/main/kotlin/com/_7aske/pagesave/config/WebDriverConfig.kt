package com._7aske.pagesave.config

import io.quarkus.logging.Log
import org.eclipse.microprofile.config.inject.ConfigProperty
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

private const val DRIVER_PROPERTY = "webdriver.chrome.driver"

@Configuration
class WebDriverConfig {

    @ConfigProperty(name = DRIVER_PROPERTY)
    private lateinit var chromeDriverPath: String

    @Bean
    fun webDriver(): WebDriver {
        System.setProperty(DRIVER_PROPERTY, chromeDriverPath)
        Log.info("Using chrome driver: $chromeDriverPath")

        val options = ChromeOptions()
        options.addArguments(
            "--headless",
            "--window-size=1920,1200",
            "--no-sandbox",
            "--disable-dev-shm-usage",
            "--ignore-certificate-errors"
        )

        return ChromeDriver(options)
    }
}