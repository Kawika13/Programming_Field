<?php
    session_start();

    if(isset($_POST["prod"]) && isset($_POST["num"])){
        $arr = array();
        array_push($arr, $_POST["prod"], $_POST["num"]);
    }
?>

<html>
    <head>
        <title>Home</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <header>
            <h1 class="h">Shopeful</h1>
        </header>
        <section>
            <article>
                <form action="form.php" method="post">
                    <label for="prod">Choose your product and write them down below</label>
                    <input type="text" id="prod" name="prod">
                    <label for="num">Select the quantity of the choosen product</label>
                    <input type="number" id="num" name="num" min="1">
                    <input type="submit" id="sub" value="submit">
                </form>
            </article>
            <article>
                <div>
                    <?php 
                        $_SESSION["purchase"] = $arr;
                        foreach ($_SESSION as $key => $value)
                            echo "{$key} => {$value} ";
                    ?>
                </div>
            </article>
        </section>
    </body>
</html>