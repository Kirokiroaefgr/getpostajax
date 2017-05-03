/**
 * ajax test
 */

function update() {
	$.ajax({
		url : './updateTimeAction.action',
		type : 'GET',
		dataType : 'json',
		success : function(json) {
			console.log(json);
			$('#time').text(json.model.time);
			var aaa = json.itemB;
			console.log(aaa);
			 $.each(aaa,function(i){
			 $(".dl").append("<tr><td>"+aaa[i].itemId+"</td>"+"<td>"+aaa[i].itemName+"</tr></td>");
			 });
		}
	})
}
