<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<article>
	<form method="POST">
		<div>${MCM.getCm_seq()}</div>
		<div>
			<label>구분</label><input name="cm_div" value="${MCM.getCm_div()}" />
		</div>
		<div>
			<label>시작일</label><input name="cm_stdate" value="${MCM.getCm_stdate()}" />
		</div>
		<div>
			<label>시작시간</label><input name="cm_stTIME" value="${MCM.getCm_stTIME()}" />
		</div>
		<div>
			<label>시작거리</label><input name="cm_stKM" value="${MCM.getCm_stKM()}" />
		</div>
		<div>
			<label>도착거리</label><input name="cm_arrKM"
				value="${MCM.getCm_arrKM()}" />
		</div>
		<div>
			<label>도착일</label><input name="cm_arrDate" value="${MCM.getCm_arrDate()}" />
		</div>
		<div>
			<label>도착시간</label><input name="cm_arrTime" value="${MCM.getCm_arrTime()}" />
		</div>
		<div>
			<label>장소</label><input name="cm_place" value="${MCM.getCm_place()}" />
		</div>
		<div>
			<label>소요비용</label><input name="cm_cost" value="${MCM.getCm_cost()}" />
		</div>
		<div>
			<button>업데이트</button>
		</div>
	</form>
</article>