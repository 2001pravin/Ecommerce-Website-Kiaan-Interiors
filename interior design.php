<?php

include 'components/connect.php';


session_start();

if(isset($_SESSION['user_id'])){
   $user_id = $_SESSION['user_id'];
}else{
   $user_id = '';
};
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>interior design</title>
</head>
<link rel="stylesheet" href="inter.css">
<link rel="stylesheet" href="p.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<link rel="stylesheet" href="css/style.css">

<body>
<?php include 'components/user_header.php'; ?>


<section id="designs" class="samples"> 
   
<div class="section-text">

      <h2>Interior design </h2>

               </div>

<div class="featured">

     <div class="work">

       <figure>

            <img src="./images/1.jpg" alt="">

            <figcaption>

                  <a href="living.php"><h2>Living Room </h2></a>

            </figcaption>

       </figure>

    </div>

    <div class="work">

       <figure>

            <img src="./images/2.jpg" alt="">

            <figcaption>

                  <a href="#"><h2>Bedroom</h2></a>

            </figcaption>

       </figure>

    </div>
    <div class="work">

       <figure>

            <img src="./images/3.jpg" alt="">

            <figcaption>

                  <a href="#"><h2>Bathroom</h2></a>

            </figcaption>

       </figure>

    </div>
    <div class="work">

       <figure>

            <img src="./images/4.jpg" alt="">

            <figcaption>

                  <a href="#"><h1>Kitchen</h1></a>

            </figcaption>

       </figure>

    </div>
</div>

</section>
</body>
</html>
