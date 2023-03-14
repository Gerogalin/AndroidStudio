<?php
  require("config.php");
  $sql = "INSERT INTO custtbl ('Fullname','Gender','CivilStatus')VALUES(".$_REQUEST["code"].")";
  
  $select_sql = "SELECT * FROM custtbl";
  $sql = str_replace("\\","",$sql);
  $select_sql + str_replace("\\"."", $select_sql);
  try{
    $dbrecords = mysqli_query($connect, $select_sql);
    if(mysqli_num_rows($dbrecords)>0){
      if (mysqli_query($connect, $sql)){
      $response["success"}  = 1;
      
      $response ["message"] = "Database error, Please Try Again!". $sql;
      die(json_encode($response));
      }
     }
    }
      catch (Exception $e) {
