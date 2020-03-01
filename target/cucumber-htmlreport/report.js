$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to search in google",
  "description": "",
  "id": "users-ability-to-search-in-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@google"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should able to search in google",
  "description": "",
  "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Browse to Google homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Search by \"\u003cKeyword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify search result appear",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google;",
  "rows": [
    {
      "cells": [
        "Keyword"
      ],
      "line": 11,
      "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google;;1"
    },
    {
      "cells": [
        "Car"
      ],
      "line": 12,
      "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5577583100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should able to search in google",
  "description": "",
  "id": "users-ability-to-search-in-google;user-should-able-to-search-in-google;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@google"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to Google homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Search by \"Car\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify search result appear",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.browse_to_Google_homepage()"
});
formatter.result({
  "duration": 2235427600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Car",
      "offset": 11
    }
  ],
  "location": "GoogleSearch.search_by(String)"
});
formatter.result({
  "duration": 7723452400,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.verify_search_result_appear()"
});
formatter.result({
  "duration": 155600,
  "status": "passed"
});
formatter.after({
  "duration": 762433700,
  "status": "passed"
});
});