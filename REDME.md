fun main() {
val nombre = "Santiago"
val carrera = "Ingeniería de Sistemas"
val universidad = "UNAB"
val semestre = "Cuarto semestre"

    val intereses = listOf(
        "Programación",
        "Desarrollo de software",
        "Inteligencia artificial",
        "Tecnología"
    )

    val objetivos = listOf(
        "Aprender nuevos lenguajes de programación",
        "Crear proyectos innovadores",
        "Mejorar mis habilidades como desarrollador",
        "Convertirme en un gran ingeniero de sistemas"
    )

    println("╔══════════════════════════════════╗")
    println("║          SOBRE MÍ                ║")
    println("╚══════════════════════════════════╝")

    println("\n¡Hola! 👋 Soy $nombre")
    println("🎓 Carrera: $carrera")
    println("🏫 Universidad: $universidad")
    println("📚 Semestre: $semestre")

    println("\n💻 MIS INTERESES")
    intereses.forEachIndexed { index, interes ->
        println("${index + 1}. $interes")
    }

    println("\n🚀 MIS OBJETIVOS")
    objetivos.forEachIndexed { index, objetivo ->
        println("${index + 1}. $objetivo")
    }

    println("\n✨ SOBRE MÍ")
    println(
        "Soy estudiante de $carrera en la $universidad. " +
        "Me apasiona la tecnología y quiero seguir " +
        "aprendiendo para desarrollar soluciones innovadoras."
    )

    println("\n¡Gracias por visitar mi perfil! 😎")
}