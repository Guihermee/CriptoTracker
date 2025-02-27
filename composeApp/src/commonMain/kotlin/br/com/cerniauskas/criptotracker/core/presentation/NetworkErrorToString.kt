package br.com.cerniauskas.criptotracker.core.presentation

import br.com.cerniauskas.criptotracker.core.domain.NetworkError
import criptotracker.composeapp.generated.resources.Res
import criptotracker.composeapp.generated.resources.error_no_internet
import criptotracker.composeapp.generated.resources.error_request_timeout
import criptotracker.composeapp.generated.resources.error_serialization
import criptotracker.composeapp.generated.resources.error_too_many_requests
import criptotracker.composeapp.generated.resources.error_unknown_error

fun NetworkError.toUiText(): UiText {
    val resId = when (this) {
        NetworkError.REQUEST_TIMEOUT -> Res.string.error_request_timeout
        NetworkError.TOO_MANY_REQUESTS -> Res.string.error_too_many_requests
        NetworkError.NO_INTERNET -> Res.string.error_no_internet
        NetworkError.SERVER -> Res.string.error_unknown_error
        NetworkError.SERIALIZATION -> Res.string.error_serialization
        NetworkError.UNKNOWN -> Res.string.error_unknown_error
    }

    return UiText.StringResourceId(resId)
}