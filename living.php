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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="p.css">
<link rel="stylesheet" href="k.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    
    <script src="lightbox-plus-jquery.min.js"></script>
    <title>service</title>
</head>
<body>
<?php include 'components/user_header.php'; ?>
<section id="designs" class="samples">
<div class="featured">

    <div class="gallery">
        
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    <figure><a href="images/1.jpg"> <img src="images/1.jpg" ></a></figure>
    
    </div>
</div>
</section>
   
</body>
</html>