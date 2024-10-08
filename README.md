
# 차량 간 소통 독려 서비스

# 프로젝트명
    
### DriveSmile : 차량 간 소통 독려 서비스 (네잎클로버)
    
# 서비스소개
- 운전자의 페인포인트인 “차량 간 소통 문제”를 해결하기 위한 “차량 간 소통 독려 서비스”입니다.
- 차량 앞뒤 유리에 디스플레이를 설치한 뒤 메세지,이모티콘,이미지를 송출합니다.
- 송출된 디스플레이 화면을 통해 앞뒤 차량과 소통할 수 있습니다.
- 어플리케이션과 인포테인먼트를 연동하여 원하는 기능을 설정할 수 있습니다.
- 인포테인먼트와 디스플레이를 연결하여 송출하고자 하는 메세지,이모티콘,이모지를 선택할 수 있습니다.


![0fdcabf4-495d-47dc-8b4b-9ce0fd439f80](https://github.com/user-attachments/assets/58ac47dd-f670-4b94-8583-0428717fc08f) 
![image2](https://github.com/user-attachments/assets/03235251-8f95-495e-a93f-4e77deecf16e)



# 프로젝트기간
    
전체 프로젝트 기간 : 2024.09.05 ~ 2024.09.13

개발 기간 : 2024.09.09 ~ 2024.09.13

UI 구현 : 2024.09.05 ~ 2024.09.06
    
# 주요기능
    
1) 아이콘 설정 값 커스터마이징

2) 인포테인먼트에 설정 값 반영

3) 인포테인먼트 화면에서 차량 디스플레이로 메세지 송출
    

# 기술스택
   
    
<img src="https://img.shields.io/badge/HTML-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=css3&logoColor=white"><img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">




<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white"/> <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"/> <img src="https://img.shields.io/badge/Oracle 11g-F80000?style=for-the-badge&logo=Oracle&logoColor=white"/>



<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"/>



# 시스템 아키텍처


# 유스케이스
    
    
| **유스케이스 이름** | 로그인 |
| --- | --- |
| **우선순위** | 하 |
| **이벤트 흐름** | • 사용자가 홈 화면 오른쪽 상단에 있는 로그인 버튼을 클릭할 시 로그인 페이지로 이동한다. |
|  | • 로그인 정보(아이디, 비밀번호)를 모두 유효하게 기입 했을 경우, 홈 화면으로 돌아간다. |
| | • 로그인 정보가 유효하지 않을 경우, 올바른 정보를 입력해달라는 문구가 제시된다. |
| **종료조건** | 브라우저 종료, 로그인 완료 시 |

| **유스케이스 이름** | 회원가입 |
| --- | --- |
| **우선순위** | 하 |
| **이벤트 흐름** | • 사용자가 로그인 페이지에서 회원가입 버튼을 클릭할 시, 회원가입 페이지로 이동한다. |
|  | • 회원가입 정보를 모두 유효하게 기입 했을 경우, 회원가입이 완료되고 로그인 창으로 이동한다. |
|  | • 회원가입 정보가 유효하지 않을 경우, 회원가입이 되지 않으며 올바른 정보를 입력해달라는 문구가 제시된다. |
| **종료조건** | 브라우저 종료, 회원가입 완료 시, 로그인 버튼 클릭 시 |

| **유스케이스 이름** | 감정 아이콘 값 변경 |
| --- | --- |
| **우선순위** | 상 |
| **이벤트 흐름** | • 사용자가 대표 아이콘의 편집 버튼을 클릭할 시, 편집 팝업 페이지가 뜬다. |
|  | • 추천 문구들이 출력이 되고, 그 중에 한가지만 선택을 할 수 있다. |
|  | • 편집 완료 버튼을 클릭할 시, 대표 아이콘의 문구가 변경이 되고 설정 값 변경 페이지로 이동한다. |
|  | • 하나도 선택이 되지 않은 상태로 편집 완료 버튼 클릭 시, 변경사항이 없이 설정 값 변경 페이지로 이동한다. |
| **종료조건** | 편집 완료 버튼 클릭 시, 뒤로가기 버튼 클릭 시 |

| **유스케이스 이름** | CM 값 변경 |
| --- | --- |
| **우선순위** | 상 |
| **이벤트 흐름** | 1. 커스텀 가능 아이콘 (또는 메세지)를 클릭하면 CM 팝업페이지가 뜬다. |
|  |2. 팝업페이지의 상단에서 선정 할 문구를 작성할 수 있다. 이때 이모지 등 특수문자를 첨부할 수 있다. |
| |3. 이미지를 넣고싶다면 이미지 첨부하기 버튼을 눌러 원하는 이미지를 선택하고 첨부하기 버튼을 누른다.|
|  |4. 변경 사항이 없는 경우, 뒤로가기 버튼을 누르면 기존 값을 유지하고 설정값 변경 페이지로 이동한다. |
| **종료조건** | CM 페이지 종료, 변경 완료 시, 뒤로가기 버튼 클릭 시 |

| **유스케이스 이름** | CM 아이콘- 이미지 첨부 |
| --- | --- |
| **우선순위** | 중 |
| **이벤트 흐름** | CM 페이지 내부 이미지 첨부하기 버튼을 눌러 원하는 이미지를 선택하고 첨부하기 버튼을 누른다. |
| **종료조건** | 이미지 첨부의 경우 첨부하기 or x 버튼 클릭 |

| **유스케이스 이름** | CM 아이콘 변경 |
| --- | --- |
| **우선순위** | 중 |
| **이벤트 흐름** | • CM 변경 버튼 클릭할 시, CM 변경 페이지로 이동한다. |
|  | • CM 아이콘 변경 배너에서 사용자가 원하는 값을 입력한 경우 변경되었다는 팝업을 띄운다. |
|  | • CM 변경 페이지에서 변경된 아이콘을 확인할 수 있다. |
|  | • CM 변경 완료 버튼을 클릭 시 변경 완료 팝업 안내 후 설정값 변경 페이지로 이동한다. |
|  | • 변경사항이 없는 경우 기존 값을 유지하고 설정값 변경 페이지로 이동한다. |
| **종료조건** | CM 페이지 종료, 변경 완료 시, 뒤로가기 버튼 클릭 시 |

| **유스케이스 이름** | 메세지 송출 |
| --- | --- |
| **우선순위** | 하 |
| **이벤트 흐름** | • CM 변경 페이지의 미리보기 버튼 클릭 시 해당 값이 디스플레이에 송출되는 모습이 화면에 5초간 송출된다. |
|  | • 미리보기 화면이 끝나면 CM 변경 페이지로 돌아온다. |
|  | • 뒤로가기 버튼 클릭 시 CM 변경 페이지로 돌아온다. |
| **종료조건** | 미리 보기 5초 송출 후, 뒤로가기 버튼 클릭 시, |

| **유스케이스 이름** | 메세지 송출 |
| --- | --- |
| **우선순위** | 상 |
| **이벤트 흐름** | • 인포테인먼트 화면에서 아이콘을 클릭한다. |
|  | • 아이콘에 저장되어 있는 메세지(이모지,이미지)가 차량용 통신을 통해 디스플레이에 전송된다. |
|  | • 전송된 메세지(이모지,이미지)가 디스플레이 화면에 송출된다. |
| **종료조건** | 디스플레이에 메세지 송출 화면 5초 유지 후, 자동 종료한다. |
    
# 서비스 흐름도
    
![서비스 흐름도](https://github.com/user-attachments/assets/629c014d-322b-403a-8648-efee54801749)
    
# ERD 다이어그램

![ERD 다이어그램](https://github.com/user-attachments/assets/11ccc5da-57a5-49b8-848b-a94df42493e7)

# 화면구성
    
![화면구성1](https://github.com/user-attachments/assets/7d32ffbc-a9ca-4c85-852c-a35c11d4fd65)

![화면구성2](https://github.com/user-attachments/assets/797a5a2a-25d9-40c6-890b-1a2f9c63dcb0)

![화면구성3](https://github.com/user-attachments/assets/3868480b-4483-4aaf-805e-dd85bf8772cd)

![홈화면](https://github.com/user-attachments/assets/0d7dd569-1cd1-4575-b07c-682079384879)
![로그인](https://github.com/user-attachments/assets/1f50a9d5-b0a9-4396-b08d-2ad093fc2898)
![회원가입](https://github.com/user-attachments/assets/36e05b3d-fc98-4af2-9a70-d086f8e0ed30)
![홈화면2](https://github.com/user-attachments/assets/e89e55c1-de70-4ad7-9e2f-4a1e84a8f824)
![메세지 메인](https://github.com/user-attachments/assets/0d6ba513-3d04-4f25-9829-b4caaa57178f)
![메세지 기본](https://github.com/user-attachments/assets/6d58e9e1-f044-4163-8be1-05c8d0902c8c)
![메세지 설정](https://github.com/user-attachments/assets/641e2d04-269d-4277-8190-737bd0825d2c)


# 최종 ppt
https://drive.google.com/file/d/1kcixuKFD_AqgQKYAkwWIKjUXR340kWfz/view?usp=sharing
    
# 팀원역할
    
- 이지연(팀장, 유니티 제작, 디자인, ppt 제작)
- 진선명(백엔드 개발, 프론트 개발)
- 이예진(프론트 개발, ppt 제작)
- 김서현(프론트 개발, ppt 제작)
- 송정민(백엔드 개발, ppt 제작)


