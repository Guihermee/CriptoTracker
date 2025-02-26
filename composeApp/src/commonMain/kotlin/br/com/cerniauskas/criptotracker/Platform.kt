package br.com.cerniauskas.criptotracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform