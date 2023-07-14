document.addEventListener("DOMContentLoaded", () => {
  // // td click event 는 총 40 개가 설정된다.
  // const tdList = document.querySelectorAll("table.main td");
  // for (let i = 0; i < tdList.length; i++) {
  //   tdList[i].addEventListener("click", (e) => {
  //     // td 를 클릭했을 때 수행할 event 코드들
  //   });
  // }

  // table 을 select 하고
  const list_table = document.getElementById("insertTable");

  // table 을 click 할 때 사용할 event 핸들러
  // 실제로는 table > tr > td 가 클릭되는 것을 감지하여 코드 실행
  const trClickHandler = (e) => {
    // table 을 클릭했을 때 최종적으로 클릭된 요소는 td 이다.
    // 최종적으로 클릭되는 요소를 e.target 이라고 한다.

    const td = e.target;
    // 최종적으로 클릭된 요소가 TD 인가를 확인하고
    if (td.tagName === "TD") {
      // td.closest
      // td 를 감싸고 있는 TR 중에서 가장 가장 가까운 tag
      const tr = td.closest("TR");
      // data-id 속성에 설정된 값을 가져오기
      const id = tr.dataset.id;
      document.location.href = `${rootPath}/update?id=${id}`;
    }
  };
  list_table?.addEventListener("click", trClickHandler);
});
