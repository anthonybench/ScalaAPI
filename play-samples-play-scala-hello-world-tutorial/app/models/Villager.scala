package models

//Personality.val.toString
object Personality extends Enumeration {
    val smug = Value("smug")
    val snooty = Value("snooty")
    val cranky = Value("cranky")
    val lazyy = Value("lazy")
    val peppy = Value("peppy")
    val normal = Value("normal")
    val sisterly = Value("sisterly")
    val jock = Value("jock")
}

//Species.val.toString
object Species extends Enumeration {
    val bird = Value("bird")
    val squirrel = Value("squirrel")
    val pig = Value("pig")
    val gorilla = Value("gorilla")
    val alligator = Value("alligator")
    val koala = Value("koal")
    val eagle = Value("eagle")
    val anteater = Value("anteater")
    val bull = Value("bull")
    val mouse = Value("mouse")
    val cat = Value("cat")
    val horse = Value("horse")
    val hamster = Value("hamster")
    val kangaroo = Value("kangaroo")
    val wolf = Value("wolf")
    val penguin = Value("penguin")
    val chicken = Value("chicken")
    val tiger = Value("tiger")
    val deer = Value("deer")
    val sheep = Value("sheep")
    val cub = Value("cub")
    val dog = Value("dog")
    val bear = Value("bear")
    val hippo = Value("hippo")
    val elephant = Value("elephant")
    val duck = Value("duck")
    val goat = Value("goat")
    val rabbit = Value("rabbit")
    val ostrich = Value("ostrich")
    val monkey = Value("monkey")
    val lion = Value("lion")
    val cow = Value("cow")
    val octopus = Value("octopus")
    val rhino = Value("rhino")
}

//Hobby.val.toString
object Hobby extends Enumeration {
    val nature = Value("nature")
    val fitness = Value("play")
    val play = Value("education")
    val fashion = Value("fasion")
    val music = Value("music")
}

case class Villager(
    id: Long,
    name: String,
    personality: String, // Enum
    species: String, // Enum
    birthday: String,
    catchphrase: String,
    hobby: String, // Enum
)