export default function AppointmentPage() {
  return `
    <link rel="stylesheet" href="css/form.css">
      <h1>Schedule An Appointment</h1>
      <form id="form1" method="post" action="javascript:alert('Submitted')">
      <div class="container">
      <div class="card">
         
          <div class="time__container">
              <div class="section">
                  <div class="box">
                      
                  </div><span>Date &amp; Time:</span>
              </div>
              <form action="" class="form__time">
                  <div class="date">
                      <label for="date"> Appointment Date:</label> <input id="date" type="date">
                  </div>
                  <div class="time">
                      <label for="time"> Appointment Time:</label> <input id="time" type="time">
                  </div>
                  <span>  Martial Status:</span>
                  <select style="width: 280px" id="Mobility" name="Mobility">
    <option selected="">Please Select</option>
    <option>Married</option>
    <option>Single</option>
    
  </select>
    
  </select>
                  </div>
                  
  <div><span> Any Disability</span>
                  <select style="width: 280px" id="Mobility" name="Mobility">
    <option selected="">Please Select</option>
    <option>Yes</option>
    <option>No</option>
   </select> </div>
  <div><span>  Veteran Status</span>
  <select style="width: 280px" id="Mobility" name="Mobility">
  <option selected="">Please Select</option>
  <option> Still active</option></option>
  <option> Not active</option>
  <option> Not an active veteran </option>
  </select> </div>            
                  
          <div class="message__container">
              <div class="section">
                  <div class="box">
                      
                  </div> Any Concerns to Address: <span> </span>
              </div>
              <textarea placeholder="e.g. Please do .. Also, .." cols="50" rows="5"></textarea>
          </div>
          <div class="contact__container">
              <div class="section">
                  <div class="box">
                      
                  </div><span>Contact Information</span>
              </div>
              <form action="" class="form__contact">
                  <div class="cname">
                      <label for="cname">Name:</label> <input placeholder="e.g. John Doe" id="cname" type="text">
                  </div>
                  <div class="cnum">
                      <label for="cnum">Phone Number:</label> <input id="cnum" type="text">
                  </div>
                  <div class="email">
                      <label for="cemail">Email Address:</label> <input placeholder="e.g. example@email.com" id="cemail" type="email">
                      </div>
              </form>
              </br>
          </div>
          <div class="form__confirmation">
          <button>Confirm Appointment </button>
          </div>
      
       </div>
      `;
}
