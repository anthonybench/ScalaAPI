package models

object Personality extends Enumeration {
    type Personality = Value
    val smug, snooty, cranky, lazyy,
        peppy, normal, sisterly, jock = Value
}

object Species extends Enumeration {
    type Species = Value
    val bird, squirrel, pig, gorilla,
        alligator, koala, eagle, anteater,
        bull, mouse, cat, horse,
        hamster, kangaroo, wolf, penguin,
        chicken, tiger, deer, sheep,
        cub, dog, bear, hippo,
        elephant, duck, goat, rabbit,
        ostrich, monkey = Value
}

object Hobby extends Enumeration {
    type Hobby = Value
    val nature, fitness, play, education,
        fashion, music = Value
}

case class Villager(
    id: Long,
    personality: Personality.Personality,
    species: Species.Species,
    birthday: String,
    catchphrase: String,
    hobby: Hobby.Hobby
)

