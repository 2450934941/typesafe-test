package modle

import com.typesafe.config.ConfigFactory
import io.github.config4k.extract
import java.io.File

data class AppConfigKotlin (
    val demo: Demo
) {
    companion object {
        fun loadConfKotlin01() {
            val config = ConfigFactory.parseFile(File("./config/app.conf"))

            // 将config转换为data class
            val appConfig = config.extract<AppConfigKotlin>()
            val name = appConfig.demo.name
            println("Name:$name")
        }
    }
}

data class Demo(
    val name: String,
    val age: Int,
    val men: Boolean,
    val address: List<String>,
    val family: Map<String, Any>
)
