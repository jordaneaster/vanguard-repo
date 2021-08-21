import "../../css/userProfilePage.css";

export default function userWelcome(users) {
  console.log(users);
  return `
  <div class="userClass">
    ${users
      .map((user) => {
        return `
        <h2 class="userName">Welcome ${user.firstName}!</h2>
        </br>
        <center><div class="user_tile">
      <h3 class="tile_header"> User Profile:</h3>
      <p class="userFirstName"><b>First Name:</b> ${user.firstName}</p>
      <p class="userLastName"><b> Last Name:</b>  ${user.lastName}</p>
      <p class="userEthnicity"><b> Ethnicity:</b> ${user.ethnicity}</p>
      <p class="userCity"><b>City:</b>  ${user.city}</p>
      <p class="userState"><b>State:</b> ${user.state}</p>
      <p class ="status"><b>Status:</b>  ${user.status}</p>
      <p class ="aboutMe"><b>About Me:</b>  ${user.aboutMe}</p>
      </br>
      <input type='hidden' id='userId' value='${user.id}'></div></center>
        `;
      })
      .join("")}
      </div> 
    `;
}
