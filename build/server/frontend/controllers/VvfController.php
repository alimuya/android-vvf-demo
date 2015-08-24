<?php

namespace frontend\controllers;

use frontend\lib\TestUser;
class VvfController extends \Phalcon\Mvc\Controller{
	
	
	public function userAction(){
		if($this->request->isGet()){
// 			$user=new TestUser();
// 			$user->age=10;
// 			$user->nickname='xiaohua';
// 			$user->password='123';
// 			$user->time=time()*1000;
// 			$user->save();
			$uid=(int)$this->dispatcher->getParam(0);
			$user=TestUser::findFirst("uid=".$uid);
			echo json_encode($user,JSON_UNESCAPED_UNICODE);
			return;
		}else if($this->request->isPost()){
			$data = file_get_contents('php://input'); 
			$json=json_decode($data);
			$user=new TestUser();
			$user->age=$json->age;
			$user->nickname=$json->nickname;
			$user->password=$json->password;
			$user->time=$json->time;;
			$user->save();
			echo json_encode($user,JSON_UNESCAPED_UNICODE);
			return;
		}
		echo json_encode(['msg'=>'wakljdsa'],JSON_UNESCAPED_UNICODE);
		return; 
	}
	
	public function usersAction(){
		
	}
	
	
}

