<?php
	if (isset($_POST['submit'])) {
		$name = $_POST['name'];
		$email = $_POST['email'];
		$msg = $_POST['msg'];

		$to = 'yerubandisaradadevi@gmail.com';
		$subject = 'Message from your blog';
		$message = "Name  :".$name."\n"."Message  :"."\t".$msg;
		$headers = "From  :".$email;

		if (mail($to, $subject, $message, $headers)) {
			echo "<h1>Sent Successfully! Thank You ".$name." "."for contacting me</h1>";
		}
		else{
			echo "<h1>Something went wrong</h1>";
		}
	}
?>