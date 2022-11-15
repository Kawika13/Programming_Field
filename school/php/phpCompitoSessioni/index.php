<?php 
    session_start();
    error_reporting(0);

    if(isset($_POST["vg"]) || isset($_POST["score"])){
        if(isset($_SESSION["scores"])){
            if($_SESSION["scores"][$_POST["vg"]] < $_POST["score"])
                $_SESSION["scores"][$_POST["vg"]] = $_POST["score"];
        }else
            $_SESSION["scores"] = array();
    }

    //session_destroy();
?>

<html>
    <head>
        <title>Home</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <header>
            <h1 class="h">VideoGames</h1>
        </header>
        <section>
            <article>
                <form action="index.php" method="post">
                    <label for="vg">Write down below the name of the game</label>
                    <input type="text" id="vg" name="vg" class="txt">
                    <label for="score">Write down below your higher score at it</label>
                    <input type="number" id="score" name="score" class="num" min="0">
                    <input type="submit" id="sub" value="Add">
                </form>
            </article>
            <article>
                <div>
                    <?php
                        $maxscore = 0;
                        $zero = 0;
                        $vgmax = "";
                        
                        if(isset($_POST["vg"]) && isset($_POST["score"])){
                            if(isset($_SESSION["scores"])){
                                foreach($_SESSION["scores"] as $vg => $score) {
                                    echo $vg.": ".$score." points<br />";
                                    if($score > $maxscore) {
                                       $maxscore = $score;
                                       $vgmax = $vg;
                                    }elseif($score == 0){
                                        $zero++;
                                    }
                                }
                                echo "<br /><b>Max Score:</b> ".$maxscore."<br />";
                                echo "<b>Game with the Max Score (of ".$maxscore."):</b> ".$vgmax."<br />";
                                echo "<b>Games with a Score of 0:</b> ".$zero."<br />";
                            }
                        }
                    ?>
                </div>
            </article>
        </section>
    </body>
</html>