<?php

class Singleton {

    private static $instancia = NULL;

    protected function __construct() {}

    public static function getInstancia() {
        if (is_null(self::$instancia)) {
            $my_class = __CLASS__;
            self::$instancia = new $my_class;
        }
        return self::$instancia;
    }

    public function __clone() {
        trigger_error("Clone rejected", E_USER_ERROR);
    }
}
