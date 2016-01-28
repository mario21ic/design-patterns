<?php 

require_once 'Singleton.php';

class SingletonTest extends PHPUnit_Framework_TestCase
{
    private $instancia = NULL;

    protected function setUp() {
        $this->instancia = Singleton::getInstancia();
    }

    public function testSingleton() {
        $my_singleton = Singleton::getInstancia();
        //$this->assertInstanceOf($my_singleton, $this->instancia);
        $this->assertInstanceOf($my_singleton, new Singleton());
    }

    /*
    public function testClone() {
        $this->assertEquals('Mario IC', $this->admin->donante_top());
    }
     */
}

