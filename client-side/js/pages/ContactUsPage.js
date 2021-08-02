export default function ContactUsPage() {
    return `
    <link rel="stylesheet" href="css/form.css">
      
      <h1> Talk To Us !! </h1> 
      <div class="container">
    
    <div class="row">
      <div class="column">
      </div>
      <div class="column">
        <form action="/action_page.php">
        
          <label for="fname">First Name</label>
          <input type="text" id="fname" name="firstname" placeholder="Your name..">
          <label for="lname">Last Name</label>
          <input type="text" id="lname" name="lastname" placeholder="Your last name..">
          <label for="email">Email</label>
          <input type="text" id="email" name="email placeholder="Your email..">
          <label for="email"> Your Thoughts </label>
          <textarea id="subject" name="subject" placeholder="Write something.." style="height:170px"></textarea>
          <input type="submit" value="Submit">
          
          <div class="star-rating" >
          <div class="thanks-msg">Thank you for your feedback !!!</div>
            <div class="star-input">
                <input type="radio" name="rating" id="rating-5">
                <label for="rating-5" class="fas fa-star"></label>
                <input type="radio" name="rating" id="rating-4">
                <label for="rating-4" class="fas fa-star"></label>
                <input type="radio" name="rating" id="rating-3">
                <label for="rating-3" class="fas fa-star"></label>
                <input type="radio" name="rating" id="rating-2">
                <label for="rating-2" class="fas fa-star"></label>
                <input type="radio" name="rating" id="rating-1">
                <label for="rating-1" class="fas fa-star"></label>

                <form>
                    <span class="rating-reaction"></span>
                    <button type="submit" class="submit-rating">Submit</button>
                </form>
          </div>
        </form>
      </div>
    </div>
  </div>
      `;
  }