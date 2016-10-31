/**
 * Created by lichen on 2016/10/28.
 */
$(document).ready(function () {
    var icon = "<i class='fa fa-times-circle'></i> ";

    $('button[type="submit"]').click(function () {
        $('#loginForm').validate({
            rules: {
                userName: 'required',
                userPassword: 'required',
                captcha: 'required'
            },
            messages: {
                userName: icon + '用户名不能为空',
                userPassword: icon + "密码不能为空",
                captcha: icon + "验证码不能为空"
            },
            submitHandler: function (form) {
                var pwd = $('#userPassword').val();
                $('#userPassword').val(CryptoJS.AES.encrypt(pwd, '192847723'));
                form.submit();
            }
        })
    });
});