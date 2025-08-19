# Selenium Snippets – Element Screenshot 🎥📸

This repository contains a **simple Selenium WebDriver snippet in Java (with TestNG)** that demonstrates how to capture a **screenshot of a specific web element** instead of the entire page.  

This is useful for:  
- Debugging UI elements 🐞  
- Capturing test evidence ✅  
- Enhancing automation reports 📊  

---

## 🚀 Snippet: `ScreenshotTest.java`
The snippet:  
- Launches Chrome with custom options  
- Opens a sample form page  
- Locates a specific input element  
- Captures and saves its screenshot as an image  

---

## Files

testdoc/
│
├── ScreenshotTest.java
└── README.md # Documentation


---

## ⚡ How to Run
1. Create a Java + TestNG project (Maven or any IDE project).  
2. Add dependencies:  
   - `selenium-java`  
   - `testng`  
   - `commons-io`  
3. Copy `ScreenshotTest.java` into your `src/test/java` folder.  
4. Run it with TestNG → it will save an element screenshot into `Output_Image/webelement_image.png`.  

---

## 🔧 Dependencies (Maven example)
```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.21.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.10.2</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>commons-io</groupId>
        <artifactId>commons-io</artifactId>
        <version>2.16.1</version>
    </dependency>
</dependencies>


✨ This repo is my personal Selenium snippet archive.
More eaxmple will be added, if I work on this in again . 🚀