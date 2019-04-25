$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Skeleton/FeatureCaseStudy.feature");
formatter.feature({
  "name": "FeatureCaseStudy Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login Scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Login as Admin",
  "keyword": "Given "
});
formatter.match({
  "location": "CaseStudyClass1.user_Login_as_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add product details",
  "keyword": "When "
});
formatter.match({
  "location": "CaseStudyClass1.user_add_product_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify new products displayed or not",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudyClass1.verify_new_products_displayed_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});