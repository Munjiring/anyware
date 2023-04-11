# :star: Work Anyware PROJECT
 
# :pushpin: Contents
- [개요](#pushpin-개요)

- [팀 소개 및 주요 기능](#pushpin-팀-소개-및-주요-기능)

- [구현 기능](#pushpin-구현-기능)
   - [프로젝트 조회](#round_pushpin-프로젝트-조회)
   - [프로젝트 참여 요청 및 생성](#round_pushpin-프로젝트-참여-요청-및-생성)
   - [프로젝트 인원 관리](#round_pushpin-프로젝트-인원-관리)
   - [리스트 조회 및 생성](#round_pushpin-리스트-조회-및-생성)
   - [리스트 상세 페이지](#round_pushpin-리스트-상세-페이지)
   - [메신저 목록 조회](#round_pushpin-메신저-목록-조회)
   - [1대1 채팅방](#round_pushpin-1대1-채팅방)
   - [스타일 등록](#round_pushpin-메신저-주소록)
 
# :pushpin: 개요
- 프로젝트명 : Work Anyware

- 보고서 : [WorkAnyware_최종보고서.pdf](https://github.com/Munjiring/scaleProject/files/11199069/WorkAnyware_.pdf)

- 기획 의도
   - 일정 관리, 구성원 간의 업무 공유 등을 통한 업무의 효율성 높일 수 있도록 함
   - 전자결재 기능을 사용하여 결재 과정에서 소모되는 불필요한 시간과 자원 절약 가능

- 개발 환경 <br>
![개발환경](https://user-images.githubusercontent.com/115603677/231110100-eba54b03-b5a2-41c3-9dbf-1f8c933d9a00.png)
<br>

- 개발 일정 <br>
![개발일정](https://user-images.githubusercontent.com/115603677/231110284-e3c32cb5-e6eb-4fee-bcbf-cc2b05fabcc2.png)
<br>

- UseCase Diagram <br>
![다이어그램1](https://user-images.githubusercontent.com/115603677/231110520-56c62ba3-46e1-4d86-96e4-09eb27ef9eeb.png)
![다이어그램2](https://user-images.githubusercontent.com/115603677/231110496-6555924f-c7a8-4f14-989c-6b6028c16b63.png)
<br>

- DB 설계(ERD Cloud) <br>
![db설계](https://user-images.githubusercontent.com/115603677/231110750-b633c382-d890-40e5-808c-18fa8426e15a.png)
<br>

# :pushpin: 팀 소개 및 주요 기능
![팀소개1](https://user-images.githubusercontent.com/115603677/231124233-335f00a8-8249-4038-9671-42bc825bf7ae.JPG)
![팀소개2](https://user-images.githubusercontent.com/115603677/231124254-010df978-0d1c-46d0-9ca4-4a640e0413a7.JPG)
 
# :pushpin: 구현 기능
## [프로젝트 게시판]
### :round_pushpin: 프로젝트 조회
![프로젝트-조회](https://user-images.githubusercontent.com/115603677/231216735-d23014a6-214d-4099-86c8-5aa0d1d47764.gif)
- 전체 프로젝트 / 참여한 프로젝트 /  즐겨찾기한 프로젝트 조회 가능
- 프로젝트명 / 참여자명으로 키워드 검색 가능
- 하얀 하트 클릭 시 즐겨찾기 추가
- 파란 하트 클릭 시 즐겨찾기 삭제

### :round_pushpin: 프로젝트 참여 요청 및 생성
![프로젝트생성](https://user-images.githubusercontent.com/115603677/231216862-f7ed1e4a-20c1-4555-a249-72ea1fbceaec.gif)
- 프로젝트 생성 시 공개 여부 설정 가능
- 프로젝트 클릭 시 비공개이면서 본인이 참여 중이 아닌 프로젝트일 경우 참여 요청 가능
- 프로젝트 생성 버튼 클릭 시 프로젝트 생성 가능
- 프로젝트 생성 후 해당 프로젝트의 상세 페이지로 이동

### :round_pushpin: 프로젝트 인원 관리
![인원관리](https://user-images.githubusercontent.com/115603677/231217081-1053e3b1-eae3-4d89-b5e1-a26a6d1004dc.gif)
- 왼쪽의 사원 리스트에서 사원 클릭 시 참여 인원에 추가
- 사원 리스트 생성 시 트리 구조 플러그인 사용
- 참여 인원에서 X 클릭 시 해당 사원을 참여 인원에서 제거(프로젝트를 만든 방장은 제거 불가능)
- 참여 요청에서 수락 버튼 클릭 시 위의 참여 인원으로 이동
- 참여 요청에서 거절 버튼 클릭 시 참여 요청에서 제거

### :round_pushpin: 리스트 조회 및 생성
![리스트생성](https://user-images.githubusercontent.com/115603677/231216934-3f9a1bb9-c580-497c-ab37-3f40b9511169.gif)
- 프로젝트 상세 페이지에서 리스트 조회 / 인원 관리 가능
- 리스트 클릭 시 상세 페이지로 이동
- 리스트 추가 버튼 클릭 시 모달창을 이용하여 생성 가능

### :round_pushpin: 리스트 상세 페이지
![리스트-상세](https://user-images.githubusercontent.com/115603677/231217167-34b9bfe1-9eee-4fce-b494-4cc357edfdad.gif)
- 좌측 메뉴를 통해 리스트 이름 / 기간 / 할 일 목록 확인 가능
- 우측의 채팅 형식을 통해 프로젝트 참여 인원들끼리 해당 프로젝트에 필요한 정보 공유 가능
- To do list에서 할 일 목록 추가
- 할 일을 완료 상태로 변경 혹은 삭제 가능
- 톱니바퀴 버튼을 클릭하여 리스트 수정

## [1:1 메신저]
### :round_pushpin: 메신저 목록 조회
![메신저목록](https://user-images.githubusercontent.com/115603677/231217247-3d331ead-04c9-49c9-8bec-7140620fb23b.gif)
- 현재 존재하는 메신저 목록 조회(최신순)
- 실시간으로 메시지가 도착하면 목록 순서 변경
- 이름 옆에 온라인/오프라인 여부 표시
- 읽지 않은 메시지 수 확인 가능
- 목록 클릭 시 해당 메신저방으로 이동

### :round_pushpin: 1대1 채팅방
![채팅](https://user-images.githubusercontent.com/115603677/231217325-38efc960-ea09-4be2-abf3-84b8fe2142b0.gif)
- 상대방이 보낸 메시지는 왼쪽, 본인이 보낸 메시지는 오른쪽에 배치하여 구분
- 메시지를 보낸 날짜, 시간 확인 가능
- 웹소켓을 이용하여 실시간으로 채팅 가능

### :round_pushpin: 메신저 주소록
![주소록](https://user-images.githubusercontent.com/115603677/231217395-11e7de57-7153-4766-8365-78c4d9a755e4.gif)
- 부서명 클릭 시 해당 부서의 인원 목록이 열리면서 인원 확인 가능
- 이름 클릭 시 해당 사원과의 메신저방 조회
- 이전의 대화가 있다면 대화 내용을 조회해서 메신저방 띄워줌
- 기존의 메신저방이 없다면 새로 생성해서 메신저방 띄워줌
