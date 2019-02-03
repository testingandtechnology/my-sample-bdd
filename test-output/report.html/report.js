$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/demo.feature");
formatter.feature({
  "line": 1,
  "name": "My demo feature",
  "description": "",
  "id": "my-demo-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2590766390,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "[TA-001] - Open google test",
  "description": "",
  "id": "my-demo-feature;[ta-001]---open-google-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open website https://www.google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I see the title Google",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com",
      "offset": 15
    }
  ],
  "location": "MySteps.openSite(String)"
});
formatter.result({
  "duration": 2226737379,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 16
    }
  ],
  "location": "MySteps.verifyTitle(String)"
});
formatter.result({
  "duration": 7286019,
  "status": "passed"
});
formatter.after({
  "duration": 74767,
  "status": "passed"
});
});