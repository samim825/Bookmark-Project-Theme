<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  
  <style>
      .background{
          background-color: whitesmoke;
      }
      .font-color{
          color: white;
      }
      .nav-link:hover {
          color: black;
          background-color:whitesmoke; 
          margin: 0;
          display: block;
      }
      .link:hover{
           color: tomato; 
           text-decoration: none;
          margin: 0;
      }
      
      
  </style>
  
</head>
<body class="background">
<header>
<nav class="navbar navbar-expand-sm bg-dark fixed-top">
  <!-- Links -->
  <ul class="navbar-nav" >
    <li class="nav-item">
        <a class="nav-link font-color" href="home.jsp" style="padding-left:20px;"><i class="fas fa-home"></i> Home</a>
    </li>
    <li class="nav-item ">
      <a class="nav-link font-color" href="bookmark.jsp" style="padding-left:20px;"><i class="fas fa-bookmark"></i> Bookmark</a>
    </li>
    <li class="nav-item">
      <a class="nav-link font-color" href="contact.jsp" style="padding-left:20px;"><i class="fas fa-user-friends"></i> Contact</a>
    </li>   
  </ul>
  
  <ul class="navbar-nav ml-auto">           
     <li class="nav-item">
        <a class="nav-link font-color" href="about.jsp" style="padding-left:20px;"><i class="fas fa-user-circle"></i> Profile</a>
     </li>
     <li class="nav-item">
        <a class="nav-link font-color" href="index.jsp" style="padding-left:20px;"><i class="fas fa-sign-out-alt"></i> Logout</a>
     </li>
  </ul>

</nav>
<br>
</header>
<div class="container">
  <% for(int i=1;i<=20;i++){ %>
  <br>
  <% } %>
</div>
<footer>
    <div class="container-fluid ">
        <div class="row font-color" style="background-color: black;padding-top: 20px;padding-left: 30px;padding-bottom: 20px;">
            <div class="col-sm-4">
                <h6>Quick Links</h6>
                <a href="home.jsp" class="font-color link">Home</a><br>
                <a href="bookmar.jsp" class="font-color link">Bookmark</a><br>
                <a href="contact.jsp" class="font-color link">Contact</a><br>
                <a href="about.jsp" class="font-color link">Profile</a>
            </div>
            <div class="col-sm-4">
                <h6>Contuct Us</h6>
                <h7>01933245746</h7><br>
                <h7>0161167654</h7><br>               
                <a href="" class="font-color link">samim825.blogspot.com</a>
                <p class="font-color">samimhossain825@gmail.com</p>
            </div>
            <div class="col-sm-4">
                <h6>About Us</h6>
                <p>We are softtech limited.We provide different types of service.This is our bookmarking and Contact saving web app.</p>
            </div>
            
        </div>
        <div class="row " align='center' style="padding-left: 10px;">
            <p> softtech@2020 , All right's reserved</p>
        </div>
    </div>
</footer>
</body>
</html>


