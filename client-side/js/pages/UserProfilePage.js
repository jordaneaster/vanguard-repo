export default function userWelcome(users) {
  console.log(users);
  return `
  <div class="userClass"></div>
    ${users
      .map((user) => {
        return `
      <div class="user_tile">
      <p class="userName">${user.userName}</p>
      <p class="password">${user.password}</p>
        <p class="age">${user.age}</p>
        <p class="mood">${user.mood.mood}</p>
      <input type='hidden' id='userId' value='${user.id}'>
      </div>
       
        `;
      })
      .join("")}
    `;
}
