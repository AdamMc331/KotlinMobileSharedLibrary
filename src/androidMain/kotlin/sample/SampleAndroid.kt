package sample

actual class Sample {
    actual fun checkMe() = 10
}

actual object Platform {
    actual fun name(): String = "Android"
}