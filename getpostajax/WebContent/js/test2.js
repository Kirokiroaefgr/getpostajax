$(document).ready(function() {
	$('#mimi').on('click', function() {
		var processDate = $('#processDateForm').val();
		var date = {
			"name" : "田中太郎",
			"age" : processDate
		};

		if(processDate>0){
			$('.oko').text("検索した数字は"+processDate);
		}else{
			$('.oko').text("１以上の数字を入力してください。");
		}
		// var data1 = JSON.stringify(date);
		// console.log(date);
		// console.log(date1);
		// alert(processDate);
		$.ajax({
			type : 'POST',
			url : 'AaaN.action',
			data : date,
			dataType : 'json',
			async : true,
			success : function(json) {
				console.log(json);
				if(json.itemA.itemId!=0){
					$('#item').text(json.itemA.itemName);
				}else{
					$('#item').text("検索結果なし");
				}

				// alert("Success");
			}
		});
	});

	$("#b1").on('click', function() {
		alert("クリックされました");
	});
});

$(function() {
	setTimeout('rect()'); // アニメーションを実行
});

function rect() {
	$('#rect').animate({
		marginTop : '-=10px'
	}, 800).animate({
		marginTop : '+=10px'
	}, 800);
	setTimeout('rect()', 1600); // アニメーションを繰り返す間隔
}