package models

object personality extends Enumeration {
    type personality = Value
    val smug, snooty, cranky, lazyy,
        peppy, normal, sisterly, jock = Value
}

object species extends Enumeration {
    type species = Value
    val bird, squirrel, pig, gorilla,
        alligator, koala, eagle, anteater,
        bull, mouse, cat, horse,
        hamster, kangaroo, wolf, penguin,
        chicken, tiger, deer, sheep,
        cub, dog, bear, hippo,
        elephant, duck, goat, rabbit,
        ostrich, monkey = Value
}

object hobby extends Enumeration {
    type hobby = Value
    val nature, fitness, play, education,
        fashion, music = Value
}

case class Villager(
    id: Long,
    personality: personality,
    species: species,
    birthday: String,
    catchphrase: String,
    hobby: hobby
)

