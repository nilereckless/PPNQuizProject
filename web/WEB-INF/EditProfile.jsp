<%-- 
    Document   : EditProfile
    Created on : Nov 19, 2019, 4:11:11 PM
    Author     : theeradonjaroonchon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PPN Quiz </title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Alatsi&display=swap" rel="stylesheet">
        <style>
            nav{
                background-color: honeydew;
                margin: -10px;
                padding: 10px
            }
              div.nav{
                padding-top: 8px;
                padding-left: 1170px;
            }
              body{
                background-color: #FCD6A5;
                font-family: 'Alatsi', sans-serif;
            }
            div.container{
                padding-top: 80px;
            }
            div.col-sm-12{
                padding: 25px;
                margin-left: 90px;
            }
            .popup {
  position: relative;
  display: inline-block;
  cursor: pointer;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

/* The actual popup */
.popup .popuptext {
  visibility: hidden;
  width: 160px;
  background-color: #555;
  color: #fff;
  text-align: center;
  border-radius: 6px;
  padding: 8px 0;
  position: absolute;
  z-index: 1;
  bottom: 125%;
  left: 50%;
  margin-left: -80px;
}

/* Popup arrow */
.popup .popuptext::after {
  content: "";
  position: absolute;
  top: 100%;
  left: 50%;
  margin-left: -5px;
  border-width: 5px;
  border-style: solid;
  border-color: #555 transparent transparent transparent;
}

/* Toggle this class - hide and show the popup */
.popup .show {
  visibility: visible;
  -webkit-animation: fadeIn 1s;
  animation: fadeIn 1s;
}

/* Add animation (fade in the popup) */
@-webkit-keyframes fadeIn {
  from {opacity: 0;} 
  to {opacity: 1;}
}

@keyframes fadeIn {
  from {opacity: 0;}
  to {opacity:1 ;}
}
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-secondary navbar-dark fixed-top">
            <a class="navbar-brand" href="Home.jsp">
                    <img src= "./Picture/Logo.svg" alt="logo" style="width:40px; padding-top: 10px ; margin-left:  10px ">
                </a>
                <span class="navbar-text" style="padding-top: 15px ; margin-left:5px; font-family: 'Alatsi', sans-serif;float: left;  font-size:22px ; color: whitesmoke;">
                    PPNQuiz  
                </span>
                <div class="nav">
                    <ul class="nav nav-tabs">

                        <li class="nav-item dropdown">
                            <a class="nav-link active dropdown-toggle" data-toggle="dropdown" href="#">I'm ${user.fullname} </a>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="#">My account</a>
                                <a class="dropdown-item" href="EditProfile.jsp">Edit Profile</a>
                                <a class="dropdown-item" href="#">Logout</a></div>
                        </li>
                    </ul>
                </div>            
            </nav>
                            <div class="container">
                                <h1><center>Edit your Information</center></h1>
        <h2>${message}</h2>
        <hr><center><div class="row">
        <form action="EditProfile" method="post">
              
             <div class="col-sm-12" style="background-color:lavender;">
                  <h3>Reset Password</h3>
            Old Password : <input type="password" name="opassword"><br><br>
            New Password : <input type="password" name="npassword"><br><br>
            Confirm Password : <input type="password" name="cpassword"><br><br>         
              <div class="popup" onclick="myFunction()">
                <input type="submit" value="Update Password">
                <span class="popuptext" id="myPopup">Change Password Already!</span>
            </div>
             </div>
            
        </form>
       
        <form action="EditName" method="post">
            
             <div class="col-sm-12" style="background-color:lavenderblush; margin-left:130px;">
                 <h3>Reset Name</h3>
            Old Name : <input type="text" name="ofullname"><br><br>
            <%--Old Lastname : <input type="text" name="olastname"><br><br>--%>
            New Name : <input type="text" name="nfullname"><br><br>
            <%--New Lastname : <input type="text" name="nlastname"><br><br>--%>
            Confirm Name : <input type="text" name="cfullname"><br><br>
            <%--Confirm Lastname : <input type="text"name="clastname"><br><br>--%>
            
            <div class="popup" onclick="myFunction()">
                <input type="submit" value="Update Name">
                <span class="popuptext" id="myPopup">Change Username Already!</span>
            </div>
        </form>
        <br></div><br><br>
        <a href="Home.jsp"><button type="button" class="btn btn-outline-dark">Back to home</button></a>
            </center>
                            </body>
</html>
