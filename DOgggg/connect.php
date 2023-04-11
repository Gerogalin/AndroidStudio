<?php
define('dbhost','localhost');
define('dbuser','root');
define('dbpass','');
define('dbname','DogDB');

$conn = mysqli_connect(dbhost, dbuser, dbpass, dbname) or die('Unable to Connect');

?>
