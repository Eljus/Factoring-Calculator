# Factoring-Calculator
Swedbank Homework for UI tests

<h3>Plugins used</h3>
<b>RoboPOJOGenerator</b> added - this is used to not use raw JSON but JAVA Object which are converted to JSON
<br>
<b>Lombok</b> - In order to successfully use this plugin, open "File" -> "Settings" -> "Build, Executions, Deployments" -> "Annotation Processors" and tick "Enable annotation processing"


Test Cases:
<br>
As this is mostly calculations, if api was available, most of the test cases would be done using API leaving only user case scenarios with some field validations.
In this project, test cases were done either to cover boundary values or verifying error messages.
<br>
Current Test cases are defined in "ui-tests\src\test\java\com\factoring\ui\tests\FactoringCalculatorTests.java"
<br><br>

<h2>Execution</h2>
Api tests are runnable from: api-tests/src/test/java/com/calculator/tests/CalculatorTest.java
<br>
UI tests are runnable from: ui-tests/src/test/resources/FactoringCalculatorTests.xml
<br>
Simply right-click on the xml and hit Run. Currently, tests are running in headless mode with 8 threads at the same time by default

<h2>Test Results</h2>
There are two ways to generate reports:
1. Allure
2. XML report
<br>
In order to generate results using allure, it has to be installed on the local machine, but I would encourage using it instead. Guide can be found here: https://docs.qameta.io/allure-report/
Simply run the next command in the "cd .\Factoring-Calculator\ui-tests" folder: "allure serve .\allure-results\"
<br>
If easier path is chosen, xml report is generated in test-output folder