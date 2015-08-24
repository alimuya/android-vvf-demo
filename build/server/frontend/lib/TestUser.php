<?php

namespace frontend\lib;

use pdo\model\AbstractModel;
/**
 * @author lixin
 *
 */
class TestUser extends AbstractModel{
	public $uid=0;
	public $password;
	public $nickname;
	public $age;
	public $time;
	
	public function getColumnFieldMapping(){}
	
	public function getTableFullName(){
		return 'vvf_user';
	}
	
}

