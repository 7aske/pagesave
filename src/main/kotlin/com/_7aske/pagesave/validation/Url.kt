package com._7aske.pagesave.validation

import javax.validation.Constraint
import javax.validation.Payload
import javax.validation.ReportAsSingleViolation
import javax.validation.constraintvalidation.SupportedValidationTarget
import javax.validation.constraintvalidation.ValidationTarget
import kotlin.reflect.KClass

@MustBeDocumented
@Constraint(validatedBy = [UrlValidator::class])
@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
@Repeatable
@SupportedValidationTarget(ValidationTarget.ANNOTATED_ELEMENT)
@ReportAsSingleViolation
annotation class Url(
    val message: String = "Invalid url",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
) {
}
