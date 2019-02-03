$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demo.feature");
formatter.feature({
  "line": 1,
  "name": "My demo feature",
  "description": "",
  "id": "my-demo-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2545333476,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Open google test",
  "description": "",
  "id": "my-demo-feature;open-google-test",
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
  "duration": 2880002905,
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
  "duration": 7546443,
  "status": "passed"
});
formatter.after({
  "duration": 83493115,
  "status": "passed"
});
});