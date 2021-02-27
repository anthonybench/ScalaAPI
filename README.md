# **Scala Web API**
*An educational project to explore functional web programming.*

<br />

### Welcome to ScalaAPI!
<hr>

This API delivers game information for ***Animal Crossing; New Horizons***, organized into various endpoints. If you're unfamiliar, it's official page can be [found here](https://www.animal-crossing.com/new-horizons/).

As brief synopsis, you play as a new '*villager*' of an island settlement with a name of your choosing. The game's goals are nebulous by design, and features a universe of animal characters that can also occupy your island as residents, or manage various stores/public services on your island.

A big mechanic of the game are the other potential villagers, which you can have up to 10 of (not including yourself) on your island at a time. You can explore other islands to recruit new villagers, allow current villagers to move out, or simply let the game's <abbr title="Random Number Generator">rng</abbr> deliver new villagers at random to occupy vacant spots.

<br />

### **Table of Contents** 📖
<hr>

  - [Welcome](#welcome-to-~ooo~)
  - [**Get Started**](#get-started-)
  - [Usage](#usage-)
  - [Technologies](#technologies-)
  - [Contribute](#Contribute-)
  - [Acknowledgements](#acknowledgements-)
  - [License/Stats/Author](#license-stats-author-)

<br />

### Get Started 🚀
<hr>

Ensure you have the **Java SDK 1.8** or higher with:
```bash
$ java -version
```
and also ensure that you have the **SBT Java build system 1.3.4** with:
```bash
$ sbt sbtVersion
```
Clone this project into a linux environment, and deploy with:
```bash
$ sbt run
```
and that's it! consult the next section to interact with it!

<br />

### Usage ⚙
<hr>

As this API was built expressly for the purpose of the author famliarizing himself with *Scala*, this project was only intended to be served locally. This application is set to serve on port `9000`, thus while serving, all of the routes listed below are accessible from the `http://localhost:9000` base address.

#### **`/myvillagers`**
*returns all data of all villagers*
```yaml
{ id: string
  name: string
  personality: string
  species: string
  birthday: string
  catchphrase: string
  hobby: string }
```

#### **`/helloworld`**
*something*
```yaml
{  }
```

#### **`/helloworld`**
*something*
```yaml
{  }
```

<br />

### Technologies 🧰
<hr>

  - [Play Framework](https://www.playframework.com/)
  - [SBT](https://www.scala-sbt.org/)
  - [OpenJDK](https://openjdk.java.net/)

<br />

### Contribute 🤝
<hr>

This project is more a <abbr title="Proof of Concept">POC</abbr> than anything else, and may still be an ongoing development, thus will gladly welcome <abbr title="Pull Requests">PR</abbr>'s for advice if you're familiar with *Play Framework* or *Scala* in general, though will likely not use this for a production instance.

<br />

### Acknowledgements 💙
<hr>

Thanks to *Katie Casemento* of *Portland State University* for offering guidance and advice throughout the **CS-557 Functional Programming** course. Hands on development with *Scala* in a user-focused setting was indeed a refreshing project.

<br />

### License, Stats, Author 📜
<hr>

<img align="right" alt="example image tag" src="https://i.imgur.com/jtNwEWu.png" width="200" />

<!-- badge cluster -->

![GitHub language count](https://img.shields.io/github/languages/count/anthonybench/ScalaAPI) ![GitHub top language](https://img.shields.io/github/languages/top/anthonybench/ScalaAPI) ![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/anthonybench/ScalaAPI) ![GitHub](https://img.shields.io/github/license/anthonybench/ScalaAPI)

<!-- / -->
See [License](https://google.com) for the full license text.

This repository was authored by *Isaac Yep*.

[Back to Table of Contents](#table-of-contents-)
