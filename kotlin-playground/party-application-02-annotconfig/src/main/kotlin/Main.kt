import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import workshop.beans.Party

fun main(args: Array<String>) {
    println("Hello World!")
    val ctx = AnnotationConfigApplicationContext(ApplicationConfig::class.java)
    val party = ctx.getBean(Party::class.java)

    println(party.start())
}