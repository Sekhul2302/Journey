<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css"
	href="/resources/assets/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/assets/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/assets/css/bootstrap-theme.min.css" />
<script type="text/javascript"
	src="/resources/assets/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="/resources/assets/js/bootstrap.min.js"></script>
<style type="text/css">
.thh{
	background-color: #5cb85c;
}
</style>
	
<script type="text/javascript">
	$(document).ready(function(){
		
		showData();
		
		$("#simpan").on("click",function(){
			save();
		});
		
		$(document).on('click','.delete',function(){
			onDelete(this);
			showData();
		});
		
		$(document).on('click','.edit',function(){
			var id = $(this).attr('id_edit');
			$.ajax({
				url : '/kategori/getid/'+id,
				type : 'GET',
				success : function(data){
					onEdit(data)
					console.log('sukses');
				}
			});
		});
		
		/* <update> */
		$('#update').on('click',function(){
			var id = $('#idKategori').val();
			var namaKategori = $('#namaKategori').val();
			
			var update = {
					id : id,
					namaKategori : namaKategori
			}
			
			$.ajax({
				url : '/kategori/update',
				contentType : 'application/json',
				type : 'PUT',
				data : JSON.stringify(update),
				success : function(Status){
					if (Status==200){
						console.log('sukses');
					}else{
						console.log('gagal udate');
					}
				}
			});
		});
		
		
	});

	//test
</script>

<title>Form Kategori</title>
</head>
<body>
	<div class="container">
		<p>
			<br>Form Kategori
		</p>
	<div class="col-lg-12">
    	<div class="panel panel-default">
           	<div class="panel-heading">
               Form Kategori
           	</div>
          	<div class="panel-body">
           		<form id="formKategori">
           			<div class="form-group col-xs-4">
						<label>Nama Kategori</label>
						<input type="hidden" id="idKategori">
						<input type="text" class="form-control" id="namaKategori" placeholder="Masukan Nama Kategori"/>
						<br>
						<input type="submit" id="simpan" class="btn btn-success" value="Simpan">
						<input type="submit" id="update" class="btn btn-success" value="Update">
					</div>
					<br>
					
					
				</form>
				<table class="table table-striped" id='dataTable'>
						<thead class='thh'>
							<tr>
								<td align="left"><b>JENIS KATEGORI</b></td>
								<td><b>ACTION</b></td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Novel</td>
								<td>Update</td>
								<td>Delete</td>
							</tr>
						</tbody>
				</table>
				
         	</div>
      	</div>
 	</div>		
	</div>
</body>
<script type="text/javascript">
	function save(){
		
		var namaKategori = $("#namaKategori").val();
		
		var kategori = {
				namaKategori : namaKategori
		}
		
		$.ajax({
			url : 'kategori/save',
			contentType : 'application/JSON',
			data : JSON.stringify(kategori),
			type : 'POST',
			success : function(data,a,xhr){
				console.log('data berhasil disimpan');
				showData();
			}
		});
	};
	
	function fillData(data){
		var dt = $("#dataTable");
		var tBody = dt.find("tbody");
		tBody.find("tr").remove();
		
		$.each(data,function(index, kategori){
			var thead = "<tr>";
			thead +="<td>"; thead+=kategori.namaKategori; thead += "</td>";
			thead +="<td>"; 
				thead+="<input type='submit' id_delete='"+kategori.id+"' class='delete button btn-warning' value='Delete'>&nbsp;"; 
				thead+="&nbsp;<input type='submit' id_edit='"+kategori.id+"' class='edit button btn-warning' value='edit'>";
			thead += "</td>";
			thead +="</tr>"
			tBody.append(thead);
		});
	};
	
	function showData(){
		$.ajax({
			url : '/kategori/getall',
			contentType : JSON,
			type  : 'GET',
			success : function(data,a,xhr){
				console.log('load');
				fillData(data);
			}
		});
	};
	
	function onDelete(del){
		var id = $(del).attr('id_delete'); 
		$.ajax({
			url : '/kategori/delete/'+id,
			type : 'DELETE',
			contentType : 'aplication/json',
			success : function(data,x,xhr){
				console.log('data dihapus');
				alert('sukses');
				showData();
			}
		})
	};
	
	function onEdit(data){
		var idKategori = $("#idKategori").val(data.id);
		var namaKategori = $("#namaKategori").val(data.namaKategori);
	};
</script>
</html>