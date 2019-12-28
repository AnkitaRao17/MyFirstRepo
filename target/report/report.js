$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WindowPopUp.feature");
formatter.feature({
  "line": 2,
  "name": "To check window Popup functionality.",
  "description": "",
  "id": "to-check-window-popup-functionality.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12152495900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Switch to child window popup",
  "description": "",
  "id": "to-check-window-popup-functionality.;switch-to-child-window-popup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@WindowPopUp"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Enter url for window pop up handles",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on button to open window popup",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Switch to particular child popup window",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I validate the correct child pop up window should be opened",
  "keyword": "Then "
});
formatter.match({
  "location": "WindowPopUpStep.enter_url_for_window_pop_up_handles()"
});
formatter.result({
  "duration": 558828800,
  "status": "passed"
});
formatter.match({
  "location": "WindowPopUpStep.click_on_button_to_open_window_popup()"
});
formatter.result({
  "duration": 36500,
  "status": "passed"
});
formatter.match({
  "location": "WindowPopUpStep.switch_to_particular_child_popup_window()"
});
formatter.result({
  "duration": 35800,
  "status": "passed"
});
formatter.match({
  "location": "WindowPopUpStep.i_validate_the_correct_child_pop_up_window_should_be_opened()"
});
formatter.result({
  "duration": 38800,
  "status": "passed"
});
formatter.after({
  "duration": 297375900,
  "status": "passed"
});
});