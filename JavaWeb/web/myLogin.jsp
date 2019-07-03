<%--
  Created by IntelliJ IDEA.
  User: chenjianliang
  Date: 2017/7/12
  Time: 上午7:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    
    <script type="text/javascript">
        function validate() {
            //通过控件id获取值或getElementsByName,id可和name相同
            var usernames = document.getElementsByName("username")
//            usernames.item(0).value



            var username = document.getElementById("username1")//分号可有可无
            username.value
            if(usernames.item(0).value == ""){
                alert(usernames.item(0).value + "username can't not be blank")
                return false
            }

            alert(usernames.item(0).value)
            return true
        }
        
        function selectAll() {
            var all = document.getElementById("all")
            if(all.checked){
//                alert("选中")
                var checkbos = document.getElementsByName("cc")
                for (var i = 0;i< checkbos.length;i++){
                    checkbos.item(i).checked = true
                }
            }else{
                alert("未选中")
            }

        }
    </script>

    <title>Title</title>
</head>
<body>
    <form onsubmit="return validate()">
        username:<input type="text" name="username"  id="username1"><br>
        password:<input type="password" name="password" id="password1"><br>
        re-password:<input type="password" name="repassword"  id="repassword1"><br>

        all<input type="checkbox" onclick="selectAll()"  name="all" id="all"><br>
        <input type="checkbox" name="cc"> <br>
        <input type="checkbox" name="cc"> <br>
        <input type="checkbox" name="cc"> <br>
        <input type="checkbox" name="cc"> <br>
        <input type="checkbox" name="cc"> <br>




        submit<input type="submit">
    </form>
</body>
</html>
