<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- スクリプトの定義 -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.0/jquery.min.js"></script>

<script language="javascript" type="text/javascript">
//リンクをクリックしたとき
function onClick(id){
	//リクエストURLにパラメータを付加する
	window.location.href="/middle-marathon3/DetailServlet?id=" + id;

	//リクエスト先に遷移する
	return false;
}

</script>

<title>プロ野球セントラル・リーグ一覧</title>
</head>
<body>
<div align="center" style="border:#000000 solid 1px;"><b>プロ野球<br>セントラル・リーグ一覧</b></div>
<br>

<!-- javascript:void(0) リンククリックを無効化しない -->
<a href="javascript:void(0)" onClick="onClick(1);">読売ジャイアンツ</a><br>
<a href="javascript:void(0)" onClick="onClick(2);">阪神タイガース</a><br>
<a href="javascript:void(0)" onClick="onClick(3);">中日ドラゴンズ</a><br>
<a href="javascript:void(0)" onClick="onClick(4);">横浜DeNAベイスターズ</a><br>
<a href="javascript:void(0)" onClick="onClick(5);">広島東洋カープ</a><br>
<a href="javascript:void(0)" onCLick="onClick(6);">東京ヤクルトスワローズ</a><br>
</body>
</html>