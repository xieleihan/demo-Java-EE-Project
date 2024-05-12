$(document).ready(function() {
    // 检查是否有注册失败的标记
    var registrationFailed = <c:out value="${registrationFailed}" />;
    if (registrationFailed) {
        // 显示注册失败的提示弹窗
        alert("Registration failed. Please try again later.");
    }
});