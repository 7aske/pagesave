package com._7aske.pagesave.service

import com._7aske.pagesave.data.Screenshot

interface WebDriverService {
    fun getScreenshot(url: String): Screenshot
}