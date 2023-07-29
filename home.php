<?php

include 'components/connect.php';

session_start();

if(isset($_SESSION['user_id'])){
   $user_id = $_SESSION['user_id'];
}else{
   $user_id = '';
};

include 'components/wishlist_cart.php';

?>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ecommerce</title>
    <meta name="theme-color" content="#317EFB"/>
    <link rel="stylesheet" href="p.css">
    <link rel="stylesheet" href="hedar.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
  </head>
  
  <body>
  <?php include 'components/user_header.php'; ?>


    <section class="home">
      <video class="video-slide active" src="./images/4.mp4" autoplay muted loop></video>
      <video class="video-slide" src="./images/2.mp4" autoplay muted loop></video>
      <video class="video-slide" src="./images/3.mp4" autoplay muted loop></video>
      <video class="video-slide" src="./images/1.webm" autoplay muted loop></video>
      <video class="video-slide" src="./images/5.mp4" autoplay muted loop></video>
      <div class="content active">
        <h1>KIAAN INTERIORS & ELECTRICALS</h1>
        <p>Decor your Dream Space With Us</p>
    
      </div>
      <div class="content">
      <h1>KIAAN INTERIORS & ELECTRICALS</h1>
        <p>Decor your Dream Space With Us</p>
        
      </div>
      <div class="content">
      <h1>KIAAN INTERIORS & ELECTRICALS</h1>
        <p>Decor your Dream Space With Us</p>
        
      </div>
      <div class="content">
      <h1>KIAAN INTERIORS & ELECTRICALS</h1>
        <p>Decor your Dream Space With Us</p>
        
      </div>
      <div class="content">
      <h1>KIAAN INTERIORS & ELECTRICALS</h1>
        <p>Decor your Dream Space With Us</p>
      </div>
      
      <div class="slider-navigation">
        <div class="nav-btn active"></div>
        <div class="nav-btn"></div>
        <div class="nav-btn"></div>
        <div class="nav-btn"></div>
        <div class="nav-btn"></div>
      </div>
    </section>

    <script type="text/javascript">
    //Javacript for responsive navigation menu
   
    //Javacript for video slider navigation
    const btns = document.querySelectorAll(".nav-btn");
    const slides = document.querySelectorAll(".video-slide");
    const contents = document.querySelectorAll(".content");

    var sliderNav = function(manual){
      btns.forEach((btn) => {
        btn.classList.remove("active");
      });

      slides.forEach((slide) => {
        slide.classList.remove("active");
      });

      contents.forEach((content) => {
        content.classList.remove("active");
      });

      btns[manual].classList.add("active");
      slides[manual].classList.add("active");
      contents[manual].classList.add("active");
    }

    btns.forEach((btn, i) => {
      btn.addEventListener("click", () => {
        sliderNav(i);
      });
    });
    </script>

  </body>
  <script src="js/script.js"></script>
</html>
      