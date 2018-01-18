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

<script type="text/javascript">
	
	$(document).ready(function(){
		
		showData();
		
		$("#simpan").on("click",function(){
			save();
			
		});
		
		$(document).on("click",'.delete',function(){
			var r = confirm("Apakah anda akan menghapus file Data ini ?");
			if (r == true){
				onDelete(this);
			}else{
				location.reload();
			}
		});
		
		
		
		$(document).on("click",'.update',function(){	
			
				var id = $(this).attr('id_update');
				$.ajax({
					url : '/anggota/getbyid/'+id,
					type : 'GET',
					success : function(data){
						console.log('tes');
						editData(data);
					}
				});
		});
	});
</script>

<title>Form Anggota</title>

</head>
<body>
	<div class="container">
	<br/>
		<p align="Left">Form Anggota</p>
		<!-- start form anggota save -->
		<form>
			<div class="form-group col-xs-4">
				<label>NIS</label>
				<input type="text" class="form-control" id="nis" placeholder="Masukan NIS siswa" name="nis">
				<label>NAMA</label>
				<input type="text" class="form-control" id="nama" placeholder="Masukan Nama Siswa" name="nama">
				<label>ALAMAT</label>
				<input type="text" class="form-control" id="alamat" placeholder="Masukan Alamat siswa" name="alamat">
				<br/>
				<input type="submit" value="Simpan" id="simpan" class="btn btn-success">
				<input type="submit" value="Update" id="update" class="btn btn-success" >
			</div>
		<!-- end form for button save -->
			
			
			<!-- start table -->
			<table class="table table-striped" id="anggota-dt">
				<thead>
					<tr>
						<th>NIS</th>
						<th>NAMA SISWA</th>
						<th>ALAMAT</th>
						<th colspan="2">ACTION</th>
					</tr>
				</thead>
				<tbody>
					<tr>
					<!-- Example -->
						<!-- <td>133089</td>
						<td>Sekhul Amin</td>
						<td>Sokatengah</td> -->
					</tr>
				</tbody>
			</table>	
		</form>
		
		<!-- end table -->
	</div>
</body>
<script type="text/javascript">
	/* start save */
	function save(){
		var nis = $("#nis").val();
		var nama = $("#nama").val();
		var alamat = $("#alamat").val();
		
		var anggota = {
				nis : nis,
				nama : nama,
				alamat : alamat
		}
		
		$.ajax({
			url : '/anggota/save',
			type : 'POST',
			contentType : 'application/json',
			data : JSON.stringify(anggota),
			success : function (data,a,xhr){
				if(xhr.statu ==201){
					console.log('data berhasil disave');
				}
			}
		});
	}
	/* end save */
	
	/* add remark fill data */
	function fillData(data){
		var dt = $("#anggota-dt");
		var tbody = dt.find('tbody');
		tbody.find('tr').remove();
		$.each(data,function(index, anggota){
			var thead =	 "<tr>";
			thead += "<td>" ; thead += anggota.nis; thead +="</td>";
			thead += "<td>" ; thead += anggota.nama; thead +="</td>";
			thead += "<td>" ; thead += anggota.alamat; thead +="</td>";
			/* buton link update delete */
			thead += "<td>" ; thead += "<a id_delete='"+anggota.id+"' href='#' class='delete'> Delete </a>";
	 		thead += "<a id_update='"+anggota.id+"' href='#' class='update'> Update </a>"; thead +="</td>";
	 		/* end button */
			thead += "</tr>"
			
			tbody.append(thead);
		});
	}
	/* end remark fill data */
	
	function showData(){
		$.ajax({
			url : '/anggota/getall',
			type : 'GET',
			contentType : JSON,
			success : function(data,x ,xhr){
				fillData(data)
			}
		});
	}
	
	function onDelete(del){
		var id = $(del).attr('id_delete');
		
		$.ajax({
			url : 'anggota/delete/'+id,
			type : 'DELETE',
			contentType : JSON,
			success : function(data,x ,xhr){
				alert("berhasil dihapus");
			},
			error : function(){
				alert("gagal");
			}
		});
	}
	
	 
	
	function editData(data){
		$("#nis").val(data.nis);
		$("#nama").val(data.nama);
		$("#alamat").val(data.alamat);
	} 
</script>
</html>