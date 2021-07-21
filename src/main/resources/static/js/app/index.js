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

var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
        $('#btn-update').on('click', function () {
            _this.update();
        });
        $('#btn-delete').on('click', function () {
            _this.delete();
        });
    },
    save : function () {
        var data = {
            name: document.getElementById("name").value,
            idNumber: document.getElementById('id-number').value,
            phoneNumber: document.getElementById('phone-number').value,
            email: document.getElementById('email').value,
            address: document.getElementById('address').value,
            address2: document.getElementById('address2').value,
            zip: document.getElementById('zip').value,
            gender: document.querySelector('input[name="gender"]:checked').value,
            selfIntroduce: document.getElementById('self-introduce').value
        };
        if(validate){
            $.ajax({
                type: 'POST',
                url: '/api/v1/admissionapp',
                dataType: 'json',
                contentType:'application/json; charset=utf-8',
                data: JSON.stringify(data)
            }).done(function() {
                alert('글이 등록되었습니다.');
                window.location.href = '/';
            }).fail(function (error) {
                alert(JSON.stringify(error));
            });
        }
    },
    update : function () {
        var data = {
            phoneNumber: document.getElementById('phone-number').value,
            email: document.getElementById('email').value,
            address: document.getElementById('address').value,
            address2: document.getElementById('address2').value,
            zip: document.getElementById('zip').value,
            selfIntroduce: document.getElementById('self-introduce').value
        };
        var id = $('#id').val();
        $.ajax({
            type: 'PUT',
            url: '/api/v1/admissionapp/'+id,
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('글이 수정되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    delete : function () {
        var id = $('#id').val();
        $.ajax({
            type: 'DELETE',
            url: '/api/v1/admissionapp/'+id,
            dataType: 'json',
            contentType:'application/json; charset=utf-8'
        }).done(function() {
            alert('글이 삭제되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};
main.init();

