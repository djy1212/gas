var _this = this;
var validate = true;
$('#btn-save').on('click', function () {
    _this.validateForm();
});

function validateForm() {
    var pwd = document.querySelector('input[id="pwd"]').value;
    var repwd = document.querySelector('input[id="repwd"]').value;
  if (pwd.length < 4) {
    alert("password must be at least 4 digits.");
    validate = false;
  }
  if (pwd != repwd) {
    alert("Passwords do not match.");
    validate = false;
  }
}