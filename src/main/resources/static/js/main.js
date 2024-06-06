 // 业务逻辑
var topAvatar = document.getElementById("topAvatar");
// console.log(topAvatar);
topAvatar.onclick = function(){
    window.location.href = "../loading.html";
}

 //切换表格
 document.getElementById('switch-button-1').addEventListener('click', function() {
     document.getElementById('table1').style.display = 'block';
     document.getElementById('table2').style.display = 'none';
     document.getElementById('table3').style.display = 'none';
 });

 document.getElementById('switch-button-2').addEventListener('click', function() {
     document.getElementById('table1').style.display = 'none';
     document.getElementById('table2').style.display = 'block';
     document.getElementById('table3').style.display = 'none';
 });

 document.getElementById('switch-button-3').addEventListener('click', function() {
     document.getElementById('table1').style.display = 'none';
     document.getElementById('table2').style.display = 'none';
     document.getElementById('table3').style.display = 'block';
 });

 // 发起AJAX请求
 var xhr = new XMLHttpRequest();
 xhr.open("POST", "http://localhost:8081/login", true);
 xhr.setRequestHeader("Content-Type", "application/json");
 xhr.onreadystatechange = function () {
     if (xhr.readyState === 4 && xhr.status === 200) {
         var data = JSON.parse(xhr.responseText);

         // 获取表格的tbody部分
         var tbody = document.getElementById("responseTableBody");

         // 创建新的行并填充数据
         var newRow = tbody.insertRow();
         var usernameCell = newRow.insertCell(0);
         var stuidCell = newRow.insertCell(1);
         var gradeCell = newRow.insertCell(2);
         var classCell = newRow.insertCell(3);

         usernameCell.innerHTML = data.stuInfo.username;
         stuidCell.innerHTML = data.stuInfo.stuid;
         gradeCell.innerHTML = data.stuInfo.grade;
         classCell.innerHTML = data.stuInfo.studentClass;
     } else if (xhr.readyState === 4) {
         var errorData = JSON.parse(xhr.responseText);
         console.error("Error: " + errorData.message);
     }
 };

 var data = {
     username: "your_username",
     password: "your_password"
 };
 xhr.send(JSON.stringify(data));