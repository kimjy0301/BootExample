<form>
	<div class="form-group">
		<label for="statiPatNo" class="form-label">환자번호</label> <input type="text" readonly class="form-control-plaintext" id="statiPatNo" value="${DTO.patNo}">
	</div>
	<div class="form-group">
		<label for="statiPatName" class="form-label">환자명</label> <input type="text" readonly class="form-control-plaintext" id="statiPatName" value="${DTO.patName}">
	</div>

	<div class="form-group">
		<label for="exampleFormControlTextarea1">판독</label>
		<textarea class="form-control" id="exampleFormControlTextarea1" rows="15">${DTO.report}</textarea>
	</div>
	<button type="submit" class="btn btn-primary">수정</button>
</form>