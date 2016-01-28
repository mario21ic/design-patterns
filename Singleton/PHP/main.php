<?php

require "Singleton.php";

$my_singletonA = new Singleton();
var_dump($my_singletonA);
var_dump($my_singletonA->getInstancia());
$my_singletonB = Singleton::getInstancia();
var_dump($my_singletonB);
var_dump($my_singletonB->getInstancia());
