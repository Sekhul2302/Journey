<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<%-- <c:forEach var = "buku" items="${listbuku}">
	<var id="myVar">${buku.id }</var>						
</c:forEach> --%>

<script type="text/javascript">
	$(document).ready(function(){
		showData();
		
		$('#simpan').on('click',function(){
			save();
		});
	});

</script>

<title>Insert title here</title>
</head>
<body>
	<div class='container'>
	<p>
		<br>Form Buku
	</p>
		<div class="col-lg-12">
    	<div class="panel panel-default">
           	<div class="panel-heading">
               Form Buku
           	</div>
          	<div class="panel-body">
           		<form id="formKategori">
           			<div class="form-group col-xs-4">
						<label>Judul Buku</label>
						<!-- <input type="hidden" id="idKategori"> -->
						<input type="text" class="form-control" id="judulBuku" placeholder="Masukan judulBuku"/>
						<label>No ISBN</label>
						<input type="text" class="form-control" id="noIsbn" placeholder="Masukan noIsbn"/>
						<label>Penerbit</label>
						<input type="text" class="form-control" id="penerbit" placeholder="Masukan Penerbit"/>
						<label>Pengarang</label>
						<input type="text" class="form-control" id="pengarang" placeholder="Masukan Pengarang"/>
						<br>
						<input type="submit" id="simpan" class="btn btn-success" value="Simpan">
						<input type="submit" id="update" class="btn btn-success" value="Update">
					<br>
					</div>
					<div class="form-group col-xs-4">
						<label>Jml Halaman</label>
						<input type="text" class="form-control" id="jmlHalaman" placeholder="Masukan Jml Halaman"/>
						<label>Tahun</label>
						<input type="text" class="form-control" id="tahun" placeholder="Masukan tahun"/>
						<label>Stock</label>
						<input type="text" class="form-control" id="stock" placeholder="Masukan stock"/>
						<label>No Rak</label>
						<input type="text" class="form-control" id="noRak" placeholder="Masukan No Rak"/>
					</div>
					<div class="form-group col-xs-4">
						<div class="form-group">
					    	<label for="sel1">Pilih Kategori:</label>
					      		<select class="form-control" id="kategori">
					      			<c:forEach var="kategori" items="${listkategori}">
										<option value="${kategori.id}">${kategori.namaKategori}</option>
									</c:forEach>
					      		</select>
					    </div>
					</div>
				</form>
				<table class="table table-striped" id='dataTable'>
						<thead class='th'>
							<tr>
								<td align="left"><b>JUDUL BUKU</b></td>
								<td align="left"><b>NO ISBN</b></td>
								<td align="left"><b>PENERBIT</b></td>
								<td align="left"><b>PENGARANG</b></td>
								<td align="left"><b>KATEGORI</b></td>
								<td align="left"><b>JML HALA</b></td>
								<td align="left"><b>TAHUN</b></td>
								<td align="left"><b>STOCK</b></td>
								<td align="left"><b>NO RAK</b></td>
								<td colspan="2"><b>ACTION</b></td>
							</tr>
						</thead>
						<tbody>
							
							<tr>
								<td>-</td>
								<td>-</td>
								<td>-</td>
								<td>-</td>
								<td>-</td>
								<td>-</td>
								<td>-</td>
								<td>-</td>
								<td>-</td>
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
		var judulBuku =$('#judulBuku').val();
		var noIsbn =$('#noIsbn').val();
		var penerbit =$('#penerbit').val();
		var pengarang =$('#pengarang').val();
		var jmlHalaman =$('#jmlHalaman').val();
		var tahun =$('#tahun').val();
		var stock =$('#stock').val();
		var noRak =$('#noRak').val();
		var kategori =$('#kategori').val();
		
		var buku = {
				isbn : noIsbn,
				judul : judulBuku,
				penerbit : penerbit,
				pengarang : pengarang,
				jmlHalaman : jmlHalaman,
				tahun : tahun,
				stok : stock,
				noRak : noRak,
				idKategori : {
					id : kategori
				}
		}
		
		$.ajax({
			url : '/buku/save',
			type : 'POST',
			contentType : 'application/JSON',
			data : JSON.stringify(buku),
			success : function(data,x,xhr){
				alert('okeee');
			}
		});
	}
	
	function showData(){
		$.ajax({
			url : '/buku/getall',
			contentType : JSON,
			type : 'GET',
			success : function(data,x,xhr){
				console.log('load');
				fillData(data);
			}
		});
	}
	/*  s*/
	function fillData(data){
		var dt = $('#dataTable');
		var tbody = dt.find('tbody');
		tbody.find('tr').remove();
		
		$.each(data,function(index,buku){
			var thead = "<tr>";
			thead +="<td>"; thead += buku.judul; thead += "</td>";
			thead +="<td>"; thead += buku.isbn; thead += "</td>";
			thead +="<td>"; thead += buku.penerbit; thead += "</td>";
			thead +="<td>"; thead += buku.pengarang; thead += "</td>";
			thead +="<td>"; thead += buku.idKategori; thead += "</td>";
			thead +="<td>"; thead += buku.jmlHalaman; thead += "</td>";
			thead +="<td>"; thead += buku.tahun; thead += "</td>";
			thead +="<td>"; thead += buku.stok; thead += "</td>";
			thead +="<td>"; thead += buku.noRak; thead += "</td>";
			thead += "<td>" ; thead += "<a id_delete='"+buku.id+"' href='#' class='delete'> Delete </a>";
	 		thead += "<a id_update='"+buku.id+"' href='#' class='update'> Update </a>"; thead +="</td>";
			thead +="</tr>";
			tbody.append(thead);
		});
	}
	
	/* function getKategori(){
		var x = document.getElementById("${buku.id}");
	} */
</script>
</html>