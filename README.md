# URL Requester
### What is this project about?
This project helps to automate your API testing - this is a  tool written in Java that takes all your API testing links and generates outputs in one **.txt** file
### Installation

1. Download `Java JDK` of 8+ version [(download here)](https://www.oracle.com/ru/java/technologies/javase-downloads.html)
2. Add SDK path to your PATH variable. 
    - for Windows: 
```set path=C:\Program Files\Java\jdk1.8.0_121\bin```
    - for MacOS
```export JAVA_HOME=/Library/Java/Home```
[Full guide how to do that](https://beginnersbook.com/2013/05/first-java-program/)
 2. `git clone`

### Usage

1. Compile program using 
`javac %PATH_TO_REPOSITORY%/ssd/src/URLRequester.java  ` 
where `%PATH_TO_REPOSITORY%` is a path to a folder where you cloned the repository

2. Create a **.txt** file and put all your requests. Write a new request from **a new line**.
3. Run the program using ` java UrlRequester %PATH_TO_TXT_FILE%` where `%PATH_TO_TXT_FILE% ` is the path to your **.txt** file with requests
4. You can find output in a new file **output.txt** that is located in `%PATH_TO_REPOSITORY%/ssd`. All responses will be separated by `\n------\n` string. 

Program will throw an `MalformedURLException` if format of the URL is incorrect. In case the file is not found, program with throw `IOException`.

### Where can you use it

You can integrate this tool to your CI/CD pipeline to automate testing of your API. 


### How it works

URL Requester parses all given requests, then using `java.net` library iteratively executes all requests and writes all responses to the **output.txt**

