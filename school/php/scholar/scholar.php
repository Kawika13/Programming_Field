<html>
    <head>
        <title>Results</title>
        <link rel="stylesheet" href="style1.css">
    </head>
    <body>

<?php

function avg(array $values) {
    $sum = array_sum($values);
    $count = count($values);
    return ($count !== 0)? $sum / $count: NAN;
}


//$name = $_POST["name"];
//$surname = $_POST["surname"];
$grade = $_POST["grade"];
$arr = array(9);

for($i = 0; $i < 7; $i++){
    array_push($arr, rand(0, 10));
}
array_push($arr, $grade);

echo "<p>Your average score is: ", round(avg($arr), 2), "</p>";

if(round(avg($arr)) >= 6)
    echo "<p> You're passed </p>";
else
    echo "<p> You're rejected </p>";

?>

    </body>
</html>