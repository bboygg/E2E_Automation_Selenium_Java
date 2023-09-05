# E2E Automation Sample Project with Selnium and Java

* Selenium WebDriver, TestNG, 그리고 Java 를 이용한 Web 자동화 프로젝트 이며, 제가 개인적으로 자주 이용하던 스타일로 작성되었습니다.


## Structure
* 프로젝트의 구조 입니다.
* Page Object Model 디자인 패턴을 적용해서 작성되었습니다.

```bash
.
├── browsers.json
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── src
│   └── test
│       ├── java
│       │   └── com
│       │       └── bboygg
│       │           └── e2e_automation_selenium_java
│       │               ├── MainPage.java
│       │               ├── MainPageTest.java
│       │               ├── pages
│       │               │   ├── BasePage.java
│       │               │   └── HomePage.java
│       │               ├── tests
│       │               │   ├── HomePageTest.java
│       │               │   └── TestBase.java
│       │               └── utils
│       │                   └── Utils.java
│       └── resources
│           └── testng.xml
```

## Requirements

* [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* Selenium 4.9.0
* WebDriverManager 5.3.2
* TestNG 7.7.1

Java와 Maven은 사용자의 컴퓨터에 설치되어야 하며, Selenium, WebDriverManager, TestNG는 pom.xml 파일의 Maven 에서 관리됩니다.

## Running the tests

1. 소스코드를 로컬 머신에 다운로드 혹은 git clone 합니다.
2. 터미널 / 프롬프트 에서 프로젝트 root directory 로 이동합니다.
3. 아래 명령어를 실행해주세요!!

```bash
mvn test