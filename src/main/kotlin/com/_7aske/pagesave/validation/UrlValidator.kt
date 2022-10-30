package com._7aske.pagesave.validation

import java.net.URI
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class UrlValidator : ConstraintValidator<Url, String> {
    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        if (value == null || !(value.startsWith("http://") || value.startsWith("https://")))
            return false

        return try {
            URI.create(value)
            true
        } catch (e: IllegalArgumentException) {
            false
        }

    }
}