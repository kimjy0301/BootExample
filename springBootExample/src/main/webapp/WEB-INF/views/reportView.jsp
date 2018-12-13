<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

<script>
	$(document).ready(function() {
		$("#reports tr").click(function() {

			var str = ""
			var tdArr = new Array();

			var tr = $(this);
			var td = tr.children();

			var patNo = td.eq(1).text();
			var examTm = td.eq(3).text();

			if (patNo != "환자번호") {
				$('input[name="patNo"]').attr("value", patNo);
				$('input[name="examTm"]').attr("value", examTm);

				$("#frm").submit();
			}

		});

	});
</script>

<div class="container-fluid">

	<h1>총 ${VO.total} 건</h1>

	<form id="frm" action="/example/detailView" method="POST">
		<input type=hidden name="patNo" value=""> <input type=hidden name="examTm" value="">
	</form>
	<table class="table  table-hover table-bordered" id="reports">
		<thead class="thead-dark">
			<tr>
				<th scope="col">#</th>
				<th scope="col">환자번호</th>
				<th scope="col">환자명</th>
				<th scope="col">시간</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach begin="0" end="${VO.reportList.size()}" var="idx">
				<tr style="cursor: Hand;">
					<th scope="row">${VO.reportList[idx].RNUM}</th>
					<td>${VO.reportList[idx].PATNO}</td>
					<td>${VO.reportList[idx].PATNAME}</td>
					<td>${VO.reportList[idx].EXAMTM}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="text-center">
		<ul class="pagination">
			<c:if test="${VO.prev}">
				<li class="page-item"><a class="page-link" href="${path}/example/reportView?index=1">처음 </a></li>

				<li class="page-item"><a class="page-link" href="${path}/example/reportView?index=${VO.startPage - 1 }" aria-label="Previous"> <span aria-hidden="true">&laquo;</span> <span class="sr-only">Previous</span>
				</a></li>
			</c:if>
			<c:forEach begin="${VO.startPage}" end="${VO.endPage}" var="idx">
				<li class="
					<c:out value = "${VO.index == idx ? 'page-item active' : 'page-item' }"/>"><a class="page-link" href="${path}/example/reportView?index=${idx}">${idx}</a></li>
			</c:forEach>

			<c:if test="${VO.next}">
				<li class="page-item"><a class="page-link" href="${path}/example/reportView?index=${VO.endPage + 1 }" aria-label="Next"> <span aria-hidden="true">&raquo;</span> <span class="sr-only">Next</span>
				</a></li>
				<li class="page-item"><a class="page-link" href="${path}/example/reportView?index=${VO.lastPage }"> 끝 </a></li>
			</c:if>
		</ul>
	</div>
</div>

