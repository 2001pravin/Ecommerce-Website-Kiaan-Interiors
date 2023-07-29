<?php
   if(isset($message)){
      foreach($message as $message){
         echo '
         <div class="message">
            <span>'.$message.'</span>
            <i class="fas fa-times" onclick="this.parentElement.remove();"></i>
         </div>
         ';
      }
   }
?>

<header class="header">
<header class="flex">
   
 <a href="home.php" class="logo">KIAAN INTERIORS</a>
  


      <nav class="navbar">
         
         
        
         
         <div class="navigation">
         <ul class="menu">
          <div class="close-btn"></div>
          <li class="menu-item"><a href="home.php">Home</a></li>
          <li class="menu-item"> <a href="orders.php">Orders</a>
          

          <li class="menu-item">
            <a class="sub-btn" href="#">Services <i class="fas fa-angle-down"></i></a>
            <ul class="sub-menu">
            <li class="sub-item"><a href="interior design.php">Interior Design</a></li>
              <li class="sub-item"><a href="#">Event Planner</a></li>
              <li class="sub-item"><a href="#">Pop</a></li>
              <li class="sub-item"><a href="#">Wallpaper Wholsaler</a></li>
              <li class="sub-item"><a href="#">Artifical Grass</a></li>
              <li class="sub-item more">
                <a class="more-btn" href="#">More <i class="fas fa-angle-right"></i></a>
                <ul class="more-menu">
                  <li class="more-item"><a href="#">Vinyl Flooring</a></li>
                  <li class="more-item"><a href="#">Electrical Contractor</a></li>
                  <li class="more-item"><a href="#">False Ceiling</a></li>
                  <li class="more-item"><a href="#">Desingn Consultant</a></li>
                  <li class="more-item"><a href="#">Vastu Consultant</a></li>

                </ul>
              </li>
            </ul>
          </li>
          <li class="menu-item">
            <a class="sub-btn" href="#">Product <i class="fas fa-angle-down"></i></a>
            <ul class="sub-menu">
              <li class="sub-item"><a href="Shop.php">Wallpaper/Decor Items</a></li>
              
            </ul>
          </li>
          
          
          <li class="menu-item"><a href="about.php">About Us</a></li>
          <li class="menu-item"><a href="contact.php">Contact Us</a></li>
        </ul>
      </div>
      <div class="menu-btn"></div>

   </nav>
   

      <div class="icons">
         <?php
            $count_wishlist_items = $conn->prepare("SELECT * FROM `wishlist` WHERE user_id = ?");
            $count_wishlist_items->execute([$user_id]);
            $total_wishlist_counts = $count_wishlist_items->rowCount();

            $count_cart_items = $conn->prepare("SELECT * FROM `cart` WHERE user_id = ?");
            $count_cart_items->execute([$user_id]);
            $total_cart_counts = $count_cart_items->rowCount();
         ?>
         <div id="menu-btn" class="fas fa-bars"></div>
         <a href="search_page.php"><i class="fas fa-search"></i></a>
         <a href="wishlist.php"><i class="fas fa-heart"></i><span>(<?= $total_wishlist_counts; ?>)</span></a>
         <a href="cart.php"><i class="fas fa-shopping-cart"></i><span>(<?= $total_cart_counts; ?>)</span></a>
         <div id="user-btn" class="fas fa-user"></div>
      </div>

      <div class="profile">
         <?php          
            $select_profile = $conn->prepare("SELECT * FROM `users` WHERE id = ?");
            $select_profile->execute([$user_id]);
            if($select_profile->rowCount() > 0){
            $fetch_profile = $select_profile->fetch(PDO::FETCH_ASSOC);
         ?>
         <p><?= $fetch_profile["name"]; ?></p>
         <a href="update_user.php" class="btn">update profile</a>
         <div class="flex-btn">
            <a href="user_register.php" class="option-btn">register</a>
            <a href="user_login.php" class="option-btn">login</a>
         </div>
         <a href="components/user_logout.php" class="delete-btn" onclick="return confirm('logout from the website?');">logout</a> 
         <?php
            }else{
         ?>
         <p>please login or register first!</p>
         <div class="flex-btn">
            <a href="user_register.php" class="option-btn">register</a>
            <a href="user_login.php" class="option-btn">login</a>
         </div>
         <?php
            }
         ?>      
         
         
      </div>

         </header>

</header>