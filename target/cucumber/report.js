$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/shoppingSearchSorting.feature");
formatter.feature({
  "name": "Shopping Search Result Sorting",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Ascending price order verification in Search Result",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@priceOrder"
    }
  ]
});
formatter.step({
  "name": "user goes to shopping homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "user searches for item \"\u003citem\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user verifies the message \"\u003cresult\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects sort by option \"\u003csortByOption\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user verifies each result is sorted by lowest price first",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "item",
        "result",
        "sortByOption"
      ]
    },
    {
      "cells": [
        "dress",
        "7",
        "Price: Lowest first"
      ]
    },
    {
      "cells": [
        "short",
        "4",
        "Price: Lowest first"
      ]
    },
    {
      "cells": [
        "printed dress",
        "5",
        "Price: Lowest first"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Ascending price order verification in Search Result",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@priceOrder"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to shopping homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoppingAccountCreation_steps.user_goes_to_shopping_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for item \"dress\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_searches_for_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the message \"7\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_verifies_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects sort by option \"Price: Lowest first\"",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_selects_sort_by_option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies each result is sorted by lowest price first",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_verifies_each_result_is_sorted_by_lowest_price_first()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Ascending order in price failed: first price: 16.51 second price: 16.4\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat steps.ShoppingSearchSorting_steps.user_verifies_each_result_is_sorted_by_lowest_price_first(ShoppingSearchSorting_steps.java:48)\n\tat ✽.user verifies each result is sorted by lowest price first(src/test/resources/features/shoppingSearchSorting.feature:9)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("THIS SCENARIO FAILED");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Ascending price order verification in Search Result",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@priceOrder"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to shopping homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoppingAccountCreation_steps.user_goes_to_shopping_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for item \"short\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_searches_for_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the message \"4\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_verifies_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects sort by option \"Price: Lowest first\"",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_selects_sort_by_option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies each result is sorted by lowest price first",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_verifies_each_result_is_sorted_by_lowest_price_first()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Ascending price order verification in Search Result",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@priceOrder"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to shopping homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoppingAccountCreation_steps.user_goes_to_shopping_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for item \"printed dress\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_searches_for_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the message \"5\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_verifies_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects sort by option \"Price: Lowest first\"",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_selects_sort_by_option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies each result is sorted by lowest price first",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingSearchSorting_steps.user_verifies_each_result_is_sorted_by_lowest_price_first()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Ascending order in price failed: first price: 30.5 second price: 28.98\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat steps.ShoppingSearchSorting_steps.user_verifies_each_result_is_sorted_by_lowest_price_first(ShoppingSearchSorting_steps.java:48)\n\tat ✽.user verifies each result is sorted by lowest price first(src/test/resources/features/shoppingSearchSorting.feature:9)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.write("THIS SCENARIO FAILED");
formatter.after({
  "status": "passed"
});
});