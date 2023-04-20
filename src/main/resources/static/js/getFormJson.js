function getFormJson() {
  // Select Form
  let selForm = document.querySelector("#test_form");

  // Getting an FormData
  let data = new FormData(selForm);

  // Getting a Serialize Data from FormData
  let serializedFormData = serialize(data);

  // Log
  alert(JSON.stringify(serializedFormData));
}

function serialize (rawData) {

  let rtnData = {};
  for (let [key, value] of rawData) {
    let sel = document.querySelectorAll("[name=" + key + "]");

    // Array Values
    if (sel.length > 1) {
      if (rtnData[key] === undefined) {
        rtnData[key] = [];
      }
      rtnData[key].push(value);
    }
    // Other
    else {
          rtnData[key] = value;
    }
  }

  return rtnData;
}