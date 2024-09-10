fun main() {
    println("Welcome to the Guess Game ")

    println("In how many tries you thin you Can Do it :) ")
    var numberOfGuess:String
    while (true){
        numberOfGuess= readln()

        if (numberOfGuess.toInt()<=0 || numberOfGuess.toInt()>20){
            println("Number Of Guess must be between 0 and 20 ")
            println("In how many tries you thin you Can Do it :) ")
        }
        else{
            break

        }
    }
    if (numberOfGuess.toInt()>1)
        println("Ok you think You can do it in $numberOfGuess tries That's Cool !! ")
    else{
        println("Really Do You Think You Can Do It From The First Time I don't Think So :) ")
    }
    val numberToGuess=Math.ceil(Math.random()*20).toInt()

    var userGuess:String
    var i=1
    var winstatue=false
    while (numberOfGuess.toInt()>0 && winstatue==false) {
        println("You Have $numberOfGuess Guess Left ")
        println("Try Number $i")
        println("Pleas enter your Guess : ")
        while (true) {
            userGuess = readln()
            if (userGuess.toInt() <= 0 || userGuess.toInt() > 20) {
                println("Guess Must be in the range of 0..20 ")
            } else {
                break
            }

        }
        if (userGuess.toInt()>numberToGuess){
            println("You Almost There But its just lower than $userGuess")
            i++
            numberOfGuess=(numberOfGuess.toInt()-1).toString()
        }
        else if (
            userGuess.toInt()<numberToGuess
        ){
            println("You Almost There But its just Greater than $userGuess")
            i++
            numberOfGuess=(numberOfGuess.toInt()-1).toString()
        }
        else{
            winstatue=true
            break
        }

    }
    if (winstatue==true){
        println("Congrats you do it after $i Guess")
    }else{
        println("You don't do it hhhh and the Number is $numberToGuess")
    }






}