import de.felixroske.performer.Performer
import de.felixroske.performer.Singer

fun main(args: Array<String>) {
    println("Hello World!")

    val performer: Performer = Singer()

    println(performer.doSomething())
}