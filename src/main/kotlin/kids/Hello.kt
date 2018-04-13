package kids

import kotlin.browser.window
/**
 * Example main function. Started at script body.
 * At first time you have to run `mvn package`.
 * Open example index.html in browser once you compile it.
 */
fun main(args: Array<String>) {
    val message = "Hello JavaScript!"
    js("alert('Hello from Kotlin')")
    //jq("#message").html("Hello from Kotlin")

    window.alert("Hello, World!")

}
