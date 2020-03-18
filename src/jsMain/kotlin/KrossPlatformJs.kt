import com.fivestars.krossplatform.KEY_CAPTURE_PORT
import org.w3c.dom.MessageChannel
import org.w3c.dom.MessageEvent
import kotlin.browser.window

object KrossPlatformJs {

    private val channel = MessageChannel()
    private var inputPort = channel.port1
    private var outputPort = channel.port2

    @JsName("configureChannel")
    fun configureChannel() {
        console.log("Configuring channel")
        window.addEventListener("message", {

            val event = it as MessageEvent

            if (event.data != KEY_CAPTURE_PORT) {
                console.log("event.data: ${event.data}")
                inputPort.postMessage(event.data)
            } else if (event.data == KEY_CAPTURE_PORT) {
                console.log("assigning captured port")
                outputPort = event.ports[0]
            }
        }, false)

        inputPort.start()
        outputPort.start()
    }
}