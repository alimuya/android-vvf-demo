<?php

namespace frontend\controllers;
use acl\AclController;
use appcenter\wandoujia\WandoujiaAppServices;
use appcenter\banner\BannerModel;


class IndexController extends  AclController{
	
	public function indexAction(){
// 		var_dump($_REQUEST);
// 		var_dump($_FILES);
		$model=BannerModel::findFirst();
		var_dump(json_encode($model));
// 		$uid=10059345;
// 		$result=$this->crypt->encryptBase64($uid);
// 		var_dump($result);
// 		var_dump(trim($this->crypt->decryptBase64($result)));
	}
    public function test(){
		 return 1111111;
    }
    
    
}

