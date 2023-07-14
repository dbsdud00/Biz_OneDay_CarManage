<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<article id="insert_con">
	<form method="POST">
		<div>
			<div id="insertTitle">운행등록</div>
			<div class="inputBox">
				<input name="cm_div" placeholder="구분" />
			</div>
			<div  class="inputBox">
				<input name="cm_stKM" placeholder="시작거리" value=0 />
			</div>
			<div  class="inputBox">
				<input name="cm_place" placeholder="장소" />
			</div>
		</div>
		<div>
		<div  class="inputBox">
				<input name="cm_arrKM" placeholder="종료거리" value=0 />
			</div>
			<div  class="inputBox">
				<input name="cm_cost" placeholder="소요비용" value=0 />
			</div>
			<div id="inputSaveBtn">
				<button>저장</button>
			</div>
		</div>

	</form>

</article>
<article id="table_con">
	<table id="insertTable">
		<tr>
			<th>No.</th>
			<th>구분</th>
			<th>출발일자</th>
			<th>출발시간</th>
			<th>출발거리(Km)</th>
			<th>도착일자</th>
			<th>도착시간</th>
			<th>도착거리(Km)</th>
			<th>장소</th>
			<th>소요비용</th>
		</tr>
		<c:forEach items="${CMLIST}" var="CM" >
			<tr data-id = "${CM.cm_seq}" >
				<td>${CM.cm_seq}</td>
				<td>${CM.cm_div}</td>
				<td>${CM.cm_stdate}</td>
				<td>${CM.cm_stTIME}</td>
				<td>${CM.cm_stKM}</td>
				<td>${CM.cm_arrDate}</td>
				<td>${CM.cm_arrTime}</td>
				<td>${CM.cm_arrKM}</td>
				<td>${CM.cm_place}</td>
				<td>${CM.cm_cost}</td>
				</tr>
		</c:forEach>
	</table>
</article>